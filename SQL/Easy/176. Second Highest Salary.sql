# Write your MySQL query statement below
select MAX(Salary) as SecondHighestSalary 
from Employee
where Salary < (Select MAX(Salary) from Employee E1)