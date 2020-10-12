# Write your MySQL query statement below
WITH T AS (
    SELECT user_id, count(distinct session_id) num_session
    FROM Activity 
    WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
    GROUP BY user_id, session_id
),

T1 AS(
    SELECT T.user_id, SUM(T.num_session) total_num_session
    FROM T
    GROUP BY T.user_id
)

SELECT 
CASE
    WHEN ROUND(SUM(T1.total_num_session)/COUNT(*), 2) IS NULL THEN 0.00
    ELSE
        ROUND(SUM(T1.total_num_session)/COUNT(*), 2)
END AS average_sessions_per_user
FROM T1