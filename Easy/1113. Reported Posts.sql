# Write your MySQL query statement below
SELECT extra report_reason, count(distinct post_id) report_count
FROM Actions
WHERE extra is not null and action_date = '2019-07-04' and action = 'report'
GROUP BY extra
ORDER BY 2