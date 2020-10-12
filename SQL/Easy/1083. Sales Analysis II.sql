# Write your MySQL query statement below
SELECT DISTINCT s.buyer_id
FROM Sales s
WHERE s.product_id IN (SELECT product_id FROM Product WHERE product_name='s8') AND s.buyer_id NOT IN(
    SELECT s1.buyer_id
    FROM Sales s1
    WHERE s1.product_id IN (SELECT product_id FROM Product WHERE product_name = 'iphone')
)