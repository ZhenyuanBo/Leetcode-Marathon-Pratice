# Write your MySQL query statement below
SELECT sell_date, count(distinct product) num_sold, group_concat(distinct product order by product) as products
FROM Activities
GROUP BY 11484. Group Sold Products By The Date