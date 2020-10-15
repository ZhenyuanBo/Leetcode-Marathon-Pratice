# Write your MySQL query statement below
select W1.Id
from Weather W1
join Weather W2
on W1.Id != W2.Id and W1.Temperature > W2.Temperature and DATEDIFF(W1.DATE, W2.DATE)=1;