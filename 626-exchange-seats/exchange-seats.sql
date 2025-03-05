# Write your MySQL query statement below
select id, case when id%2=0 then LAG(student,1)over(order by id)
            when id%2=1 then ifnull(LEAD(student,1)over(order by id),student)
            End As student
from Seat            
