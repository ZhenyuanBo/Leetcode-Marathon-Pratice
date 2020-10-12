# Write your MySQL query statement below
SELECT MAX(num) num
FROM (
    SELECT num FROM my_numbers GROUP BY num HAVING count(num) = 1
) T