# Write your MySQL query statement below
select Customers.name as 'Customers'
from customers where customers.id not in
(
    select Orders.customerid from orders
);