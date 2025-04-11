# Write your MySQL query statement below
select w.id
from Weather w, Weather we

where DateDiff(w.recordDate,we.recordDate)=1 and w.temperature>we.temperature


