# Write your MySQL query statement below
select E1.Name as Employee
from Employee E1 join Employee E2 on E1.Id != E2.Id
where E1.Salary > E2.Salary and E1.ManagerId = E2.Id;