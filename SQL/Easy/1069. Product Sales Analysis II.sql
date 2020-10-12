# Write your MySQL query statement below
SELECT s.product_id, SUM(s.quantity) total_quantity
FROM Sales s JOIN Product p ON s.product_id = p.product_id
GROUP BY s.product_id