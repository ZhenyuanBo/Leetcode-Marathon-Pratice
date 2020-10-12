# Write your MySQL query statement below
with temp as 
(SELECT team_id, count(*) team_size FROM Employee GROUP BY team_id)

SELECT e.employee_id, temp.team_size
FROM Employee e JOIN temp ON e.team_id = temp.team_id