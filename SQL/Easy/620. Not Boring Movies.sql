# Write your MySQL query statement below
SELECT * FROM cinema
WHERE description!='boring' and id%2!=0
ORDER BY rating DESC