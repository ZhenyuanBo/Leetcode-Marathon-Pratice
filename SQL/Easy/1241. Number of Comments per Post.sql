# Write your MySQL query statement below
WITH T AS
(SELECT distinct(sub_id) post_id, parent_id FROM Submissions WHERE parent_id is null),

T1 AS (
    SELECT parent_id post_id, COUNT(distinct(sub_id)) number_of_comments
    FROM Submissions 
    WHERE parent_id is not null and parent_id IN (SELECT T.post_id FROM T)
    GROUP BY parent_id
)

SELECT * FROM (
    SELECT * FROM T1

    UNION 

    SELECT post_id, 
    CASE
        WHEN parent_id is null THEN 0 
    END AS number_of_comments
    FROM T 
    WHERE post_id NOT IN (SELECT post_id from T1)
) T2
ORDER BY 1 ASC
