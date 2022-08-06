# Write your MySQL query statement below
select email from 
(select email, count(email) as c from Person group by email) as temp
where c>1;