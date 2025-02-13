# Write your MySQL query statement below
select Round(Sum(case when order_date=customer_pref_delivery_date then 1 else 0 End)*100/count(DISTINCT customer_id),2) as immediate_percentage
from Delivery
where(customer_id, order_date)in(
    select customer_id, MIN(order_date) as firstorderdatef
from Delivery
group by customer_id
)
