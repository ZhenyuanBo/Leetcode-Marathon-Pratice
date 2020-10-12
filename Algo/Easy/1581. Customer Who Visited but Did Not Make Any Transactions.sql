# Write your MySQL query statement below
WITH T AS(
    SELECT visit_id, customer_id
    FROM Visits
    WHERE visit_id NOT IN (SELECT visit_id FROM Transactions)
)

SELECT customer_id, count(visit_id) as count_no_trans
FROM T
GROUP BY customer_id;