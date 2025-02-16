# Write your MySQL query statement below

select Product_id, year as first_year,quantity , price
from Sales
where (product_id, year)in(
select product_id , MIN(year) as first_year 
from Sales
group by product_id)