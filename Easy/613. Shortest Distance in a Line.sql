# Write your MySQL query statement below

SELECT MIN(abs(p.x-p1.x)) shortest
FROM point p JOIN point p1
WHERE p.x != p1.x