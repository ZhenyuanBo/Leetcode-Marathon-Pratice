# Write your MySQL query statement below
WITH T AS(
    SELECT seller_id, SUM(price) total_price
    FROM Sales
    GROUP BY 1
), 
T1 AS(
    SELECT seller_id
    FROM T
    WHERE T.total_price IN (SELECT MAX(T.total_price) FROM T)
)

SELECT * FROM T1;