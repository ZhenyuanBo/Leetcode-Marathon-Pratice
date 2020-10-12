# Write your MySQL query statement below

WITH T AS(
    SELECT left(order_date, 7) as month, customer_id, invoice
    FROM Orders
    WHERE invoice>20
)

SELECT month, count(invoice) as order_count, count(distinct(customer_id)) as customer_count
FROM T
GROUP BY 1;