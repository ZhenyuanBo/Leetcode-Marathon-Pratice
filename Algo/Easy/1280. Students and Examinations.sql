# Write your MySQL query statement below
with t1 as
(
    SELECT stu.student_id, stu.student_name, sub.subject_name
    FROM students stu JOIN Subjects sub
),

t2 as (
    SELECT e.student_id, e.subject_name, count(*) attended_exams
    FROM Examinations e
    GROUP BY 1, 2
)

SELECT t1.student_id, t1.student_name, t1.subject_name, 
CASE 
    WHEN t2.attended_exams is null THEN 0
    ELSE t2.attended_exams
END as attended_exams
FROM t1 LEFT JOIN t2 ON t1.student_id = t2.student_id and t1.subject_name = t2.subject_name
ORDER BY 1, 3