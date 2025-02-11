# Write your MySQL query statement below
select p.product_id, Round(ifNull(sum(u.units*p.price)/Sum(u.units),0),2) as average_price
from Prices p
left join UnitsSold u
on p.product_id=u.product_id
and u.purchase_date>=p.start_date
and u.purchase_date<=p.end_date
GROUP by p.product_id