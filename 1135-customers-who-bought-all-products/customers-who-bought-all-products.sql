# Write your MySQL query statement below
select customer_id 
from Customer
group by customer_id
having Count(DISTINCT product_key)=(
    select count(product_key)
    from Product
)