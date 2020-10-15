# Write your MySQL query statement below
SELECT distinct(P1.Email)
FROM Person P1 JOIN Person P2
WHERE P1.Email=P2.Email and P1.Id!=P2.Id