# Write your MySQL query statement below
SELECT e.name
FROM Employee e
cross join Employee m
on e.id=m.managerId
group by m.managerId
having count(m.managerId)>=5
