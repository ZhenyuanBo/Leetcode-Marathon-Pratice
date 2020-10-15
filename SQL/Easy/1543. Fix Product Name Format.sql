# Write your MySQL query statement below
SELECT LOWER(trim(product_name)) as PRODUCT_NAME,  DATE_FORMAT(sale_date, "%Y-%m") as SALE_DATE, count(sale_date) as TOTAL
FROM Sales
GROUP BY 1, 2
ORDER BY 1, 2