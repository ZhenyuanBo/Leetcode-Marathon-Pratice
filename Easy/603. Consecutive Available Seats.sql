# Write your MySQL query statement below
SELECT distinct(c1.seat_id) 
FROM cinema c1 JOIN cinema c2 ON (c1.seat_id+1 = c2.seat_id or c1.seat_id - 1 = c2.seat_id) and c1.free = 1 and c2.free=1