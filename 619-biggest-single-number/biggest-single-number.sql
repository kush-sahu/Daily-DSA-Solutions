# Write your MySQL query statement below
select MAX(num) as num
from MyNumbers
where num in(select num as num 
from MyNumbers
group by num
having count(num)=1)