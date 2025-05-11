# Write your MySQL query statement below
-- select requester_id as id ,max(req_c+acc_c) as num
-- from(
-- select requester_id , count(requester_id) as req_c
-- from RequestAccepted
-- group by requester_id)a
-- Inner join 
-- (select accepter_id , count(accepter_id) as acc_c
-- from RequestAccepted
-- group by accepter_id) b
-- on requester_id=accepter_id 


select id,count(id) as num from(
select requester_id as id from RequestAccepted
UNION ALL
select accepter_id from RequestAccepted
) t
group by id 
order by num desc
limit 1


