# Write your MySQL query statement below

SELECT s.product_id, p.product_name
FROM Product p JOIN Sales s ON p.product_id = s.product_id
WHERE s.product_id NOT IN(
SELECT s.product_id
FROM Sales s
WHERE sale_date>'2019-03-31' or sale_date<'2019-01-01')
GROUP BY 1
ORDER BY 1