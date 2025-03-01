select num as ConsecutiveNums
from (
select num,Lead(num) over(order by id) as next_num,Lag(num) over(order by id) as prev_num
from Logs
)t
where num=next_num and num=prev_num
group by num