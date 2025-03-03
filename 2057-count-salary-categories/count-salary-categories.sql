# Write your MySQL query statement below
select "Low Salary" as category , Sum(case when income<20000 then 1 else 0 End)as accounts_count
from Accounts
UNION 
select "Average Salary" as category , Sum(case when (income>=20000 and income<=50000) then 1 else 0 End)as accounts_count
from Accounts
UNION 
select "High Salary" as category , Sum(case when (income>50000) then 1 else 0 End)as accounts_count
from Accounts