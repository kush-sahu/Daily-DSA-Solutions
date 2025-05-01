CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      
    --   select salary from(select salary from Employee
    --   order by salary desc
    --   limit N) t
    --   order by salary asc
    --   limit 1 


    select salary from (select *, ROW_NUMBER() over (order by salary desc)  as rowNum
    from Employee  group by salary) t
    where t.rowNum=N

  );
END