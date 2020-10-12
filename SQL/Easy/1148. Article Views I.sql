# Write your MySQL query statement below
SELECT author_id id
FROM Views
WHERE author_id = viewer_id
GROUP BY 1
ORDER BY 1  ASC