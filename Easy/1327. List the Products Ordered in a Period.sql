# Write your MySQL query statement below

WITH T AS (
    SELECT p.product_name, sum(o.unit) unit
    FROM Products p JOIN Orders o ON p.product_id = o.product_id
    WHERE MONTH(order_date)='02' and Year(order_date) = '2020'
    GROUP BY p.product_id
)

SELECT T.product_name, T.unit
FROM T
WHERE T.unit >= 100
