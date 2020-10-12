# Write your MySQL query statement below
WITH T AS (
    SELECT COUNT(order_number) number, customer_number
    FROM orders
    GROUP BY customer_number
)

SELECT customer_number
FROM T
WHERE T.number IN (SELECT MAX(number) FROM T)