# Write your MySQL query statement below
select a.machine_id , Round(AVG(b.timestamp-a.timestamp),3) as processing_time
from Activity a 
inner join Activity b
on a.process_id=b.process_id
 and a.machine_id=b.machine_id
 and a.timestamp<b.timeStamp
 group by a.machine_id
