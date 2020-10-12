# Write your MySQL query statement below
WITH T1 AS(
    SELECT o.customer_id, LEFT(o.order_date, 7) as month, SUM(o.quantity*p.price) as total_price
    FROM Orders o JOIN Product p ON o.product_id = p.product_id
    GROUP BY 1, 2
), T2 AS(
    SELECT T1.customer_id as customer_id
    FROM T1
    WHERE T1.month = '2020-06' and T1.total_price>=100
    ),
T3 AS(
    SELECT T1.customer_id as customer_id
    FROM T1
    WHERE T1.month = '2020-07' and T1.total_price>=100
),
T4 AS(
    SELECT T2.customer_id as customer_id
    FROM T2 INNER JOIN T3 ON T2.customer_id = T3.customer_id
)

SELECT T4.customer_id, c.name
FROM T4 JOIN Customers c ON T4.customer_id = c.customer_id