# Write your MySQL query statement below
select d.name as Department , t.name as Employee,t.Salary
from(
select  salary ,id , name   , departmentId , dense_rank() over(Partition by departmentId order by salary desc) as ranks
from Employee
) t
left join Department d
on t.departmentId=d.id
where ranks<=3
order by t.id



