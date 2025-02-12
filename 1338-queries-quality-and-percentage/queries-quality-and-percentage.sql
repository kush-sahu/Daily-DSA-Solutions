# Write your MySQL query statement below
select  query_name , round(SUM(rating/position)/count(query_name),2) as quality ,
round(SUM(CASE WHEN rating<3 THEN 1 ELSE 0 END)/count(query_name)*100,2) as poor_query_percentage
from Queries
group by query_name