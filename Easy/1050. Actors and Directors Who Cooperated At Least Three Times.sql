# Write your MySQL query statement below
WITH temp as
(SELECT actor_id, director_id, count(*) times FROM ActorDirector GROUP BY 1, 2)

SELECT temp.actor_id, temp.director_id
FROM temp
WHERE times>=3