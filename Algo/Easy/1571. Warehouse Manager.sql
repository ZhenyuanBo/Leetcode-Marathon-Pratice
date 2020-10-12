# Write your MySQL query statement below
WITH T AS
(
    SELECT w.name as warehouse_name, (p.Width * p.Length * p.Height)*w.units as volume
    FROM Warehouse w JOIN Products p ON w.product_id = p.product_id
)

SELECT T.warehouse_name, SUM(T.volume) as volume
FROM T
Group By 1;