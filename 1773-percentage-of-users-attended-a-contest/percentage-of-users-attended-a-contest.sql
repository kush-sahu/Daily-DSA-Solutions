# Write your MySQL query statement below
select r.contest_id ,ROUND((count(r.user_id)*100/(select count(*)from Users )),2) as percentage
from Users u
Right join Register r
on u.user_id=r.user_id
group by r.contest_id
order by 
percentage DeSC,
r.contest_id ASC;
