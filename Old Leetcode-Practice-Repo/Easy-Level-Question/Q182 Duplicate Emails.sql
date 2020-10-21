# Write your MySQL query statement below
select P1.Email
from Person P1
join Person P2
where P1.Id<P2.Id and P1.Email = P2.Email
group by P1.Email;
