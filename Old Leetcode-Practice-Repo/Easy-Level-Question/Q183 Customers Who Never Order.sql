select c.Name as Customers
from Customers c
where c.Id NOT IN (
	select CustomerId
	from Orders
)
