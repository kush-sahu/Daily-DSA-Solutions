# Write your MySQL query statement below
select DISTINCT employee_id , department_id
from Employee
where employee_id In(
    select employee_id
    from Employee
    group by employee_id
    having Count(*)=1
)  or primary_flag='Y' 
order by employee_id  asc