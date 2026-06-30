SELECT MAX(salary)  AS SecondHighestSalary FROM Employee WHERE salary < (SELECT MAX(salary) from Employee) ;
 