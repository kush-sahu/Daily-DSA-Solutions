# Write your MySQL query statement below
-- //round(Sum(p.employee_id)/
select p.project_id , round(sum(e.experience_years)/count(e.experience_years),2) as  average_years 
from Project p
Left join Employee e
on p.employee_id=e.employee_id
group by p.project_id

