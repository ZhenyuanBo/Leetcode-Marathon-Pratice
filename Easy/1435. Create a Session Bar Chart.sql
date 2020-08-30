# Write your MySQL query statement below
SELECT '[0-5>' as 'bin', SUM(CASE WHEN duration/60>=0 and duration/60<5 THEN 1 ELSE 0 END) AS total FROM Sessions

union

SELECT '[5-10>' as 'bin', SUM(CASE WHEN duration/60>=5 and duration/60<10 THEN 1 ELSE 0 END) AS total FROM Sessions

union

SELECT '[10-15>' as 'bin', SUM(CASE WHEN duration/60>=10 and duration/60<15 THEN 1 ELSE 0 END) AS total FROM Sessions

union

SELECT '15 or more' as 'bin', SUM(CASE WHEN duration/60>=15 THEN 1 ELSE 0 END) AS total FROM Sessions

