# Write your MySQL query statement below
select Customer.name from Customer where Customer.id not in
(
    select Customer.id from Customer where Customer.referee_id=2
);
