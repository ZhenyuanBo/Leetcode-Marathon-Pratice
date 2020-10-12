# Write your MySQL query statement below
WITH T AS
(SELECT p.product_id, SUM(p.price * u.units) total_price, SUM(u.units) number_item
 FROM Prices p JOIN UnitsSold u ON p.product_id = u.product_id
 WHERE u.purchase_date>=p.start_date and u.purchase_date<=p.end_date
 GROUP BY 1
)

SELECT T.product_id, ROUND((T.total_price / T.number_item),2) average_price
FROM T