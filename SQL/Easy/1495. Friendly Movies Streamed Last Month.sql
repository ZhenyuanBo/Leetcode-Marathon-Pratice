# Write your MySQL query statement below
SELECT distinct(title)
FROM TVProgram jOIN Content ON TVProgram.content_id = Content.content_id
WHERE Kids_content='Y' and content_type = 'Movies' and 
LEFT(program_date, 7)='2020-06';