# Write your MySQL query statement below
SELECT ifnull(round((count(*) / d.num_delivery)*100, 2), 0) immediate_percentage
FROM Delivery JOIN (SELECT count(*) num_delivery FROM Delivery ) d
WHERE order_date = customer_pref_delivery_date