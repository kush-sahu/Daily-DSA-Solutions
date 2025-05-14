# Write your MySQL query statement below
select Name1 as name from(
 select t.name as Name1 , c.name from (
select s.name,o.com_id 
from SalesPerson s
left join Orders o 
on s.sales_id=o.sales_id
 )t
 left join Company c
 on c.com_id=t.com_id
 group by t.name
 having c.name!="RED" or c.name is null
)l