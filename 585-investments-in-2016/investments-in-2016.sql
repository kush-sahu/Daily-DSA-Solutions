# Write your MySQL query statement below

SELECT Round(SUM(tiv_2016),2) AS tiv_2016
FROM Insurance
where tiv_2015 in(
    select tiv_2015
    from Insurance
    group by tiv_2015
    having count(tiv_2015)>1
)
And  (lat,lon) in(
    select lat ,lon 
    from Insurance
    group by lat,lon
    having count(*)=1
)