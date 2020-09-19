# Write your MySQL query statement below
WITH T AS(
    SELECT project_id, count(employee_id) number
    FROM Project 
    GROUP BY 1
),

T2 AS(
    SELECT MAX(T.number) max_number
    FROM T
)

SELECT T.project_id
FROM T
WHERE T.number IN (SELECT * FROM T2);