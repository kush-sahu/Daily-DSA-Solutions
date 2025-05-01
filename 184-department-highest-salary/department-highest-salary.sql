# Write your MySQL query statement below
select t.Department , t.Employee , t.salary as Salary from (
select d.name as Department , e.name as Employee ,  salary
from Employee e
left join Department d
on e.departmentId=d.id )t

JOIN (select  d.name ,max(salary) as Salary
from Employee e
left join Department d
on e.departmentId=d.id
group by d.name
order by salary desc )t2

on t.Department=t2.name and t.salary=t2.salary





