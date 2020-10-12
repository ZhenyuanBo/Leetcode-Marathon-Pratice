# Write your MySQL query statement below

SELECT s.name
FROM salesperson s
WHERE s.sales_id NOT IN(
    SELECT o.sales_id
    FROM orders o JOIN company c
    WHERE c.com_id = o.com_id and c.name = 'RED'
    )