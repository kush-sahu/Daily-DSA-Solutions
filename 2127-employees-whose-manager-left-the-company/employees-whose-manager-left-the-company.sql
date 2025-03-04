# Write your MySQL query statement below
select t.employee_id 
from (
select *
from Employees
where salary<30000
)t
where t.manager_id not in(
    select employee_id
    from Employees
)
order by employee_id ASc