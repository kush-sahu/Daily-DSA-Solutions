# Write your MySQL query statement below
select person_name
from(
select person_name ,weight, Sum(weight) over (order by turn) as TTweight
from Queue
)t
where t.TTweight <=1000
order by t.TTweight desc
LIMIT 1

