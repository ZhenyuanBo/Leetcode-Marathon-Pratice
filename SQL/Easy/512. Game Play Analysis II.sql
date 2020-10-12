# Write your MySQL query statement below
WITH T AS(
    SELECT player_id, MIN(event_date) first_time
    FROM Activity
    GROUP BY player_id
)
SELECT a.player_id, a.device_id
FROM Activity a JOIN T ON a.player_id = T.player_id and a.event_date = T.first_time