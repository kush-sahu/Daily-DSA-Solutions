# Write your MySQL query statement below
select e1.name
from Employee e1
Inner join Employee e2
on e1.id=e2.managerId
Group by e2.managerId
Having count(e2.managerId)>=5