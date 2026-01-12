# Write your MySQL query statement belows
select name as Employee from Employee e
where  salary > 
(select salary from Employee
where id=e.managerId
);