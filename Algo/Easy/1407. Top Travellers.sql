# Write your MySQL query statement below
SELECT u.name, 
CASE
    WHEN r.distance is null THEN 0
    ELSE SUM(r.distance)
END AS travelled_distance
FROM Users u LEFT JOIN Rides r ON u.id = r.user_id
GROUP BY 1 
ORDER BY travelled_distance DESC, 1 ASC