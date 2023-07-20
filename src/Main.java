//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//
//        Here are 100 SQL query questions for a SQL interview:
//
//        1. Write a SQL query to select all columns from a table named "employees".
//                Answer: SELECT * FROM employees;
//
//        2. Write a SQL query to select specific columns "name" and "age" from the "users" table.
//                Answer: SELECT name, age FROM users;
//
//        3. Write a SQL query to filter rows from a table where the "salary" is greater than 50000.
//        Answer: SELECT * FROM employees WHERE salary > 50000;
//
//        4. Write a SQL query to filter rows from a table where the "status" is 'active' and the "department" is 'IT'.
//                Answer: SELECT * FROM employees WHERE status = 'active' AND department = 'IT';
//
//        5. Write a SQL query to retrieve unique values from a column "country" in the "customers" table.
//                Answer: SELECT DISTINCT country FROM customers;
//
//        6. Write a SQL query to retrieve the top 5 highest salaries from the "employees" table.
//                Answer: SELECT * FROM employees ORDER BY salary DESC LIMIT 5;
//
//        7. Write a SQL query to calculate the average salary of employees in the "sales" department.
//                Answer: SELECT AVG(salary) FROM employees WHERE department = 'sales';
//
//        8. Write a SQL query to find the number of employees in each department and display the department name along with the count.
//        Answer: SELECT department, COUNT(*) FROM employees GROUP BY department;
//
//        9. Write a SQL query to find the total sales amount for each month in the "sales" table.
//                Answer: SELECT MONTH(sale_date) AS month, SUM(amount) AS total_sales FROM sales GROUP BY MONTH(sale_date);
//
//        10. Write a SQL query to retrieve the oldest employee from the "employees" table based on the "hire_date" column.
//                Answer: SELECT * FROM employees ORDER BY hire_date ASC LIMIT 1;
//
//        11. Write a SQL query to update the "status" of an employee with ID 101 to 'inactive'.
//                Answer: UPDATE employees SET status = 'inactive' WHERE id = 101;
//
//        12. Write a SQL query to delete all records from the "customers" table where the "country" is 'USA'.
//                Answer: DELETE FROM customers WHERE country = 'USA';
//
//        13. Write a SQL query to join two tables "orders" and "customers" based on the "customer_id" column.
//                Answer: SELECT * FROM orders JOIN customers ON orders.customer_id = customers.customer_id;
//
//        14. Write a SQL query to retrieve the names of customers who have not placed any orders.
//        Answer: SELECT name FROM customers LEFT JOIN orders ON customers.customer_id = orders.customer_id WHERE orders.order_id IS NULL;
//
//        15. Write a SQL query to find the highest salary for each department in the "employees" table.
//                Answer: SELECT department, MAX(salary) FROM employees GROUP BY department;
//
//        16. Write a SQL query to calculate the total revenue for each product in the "sales" table and display the product name along with the total revenue.
//                Answer: SELECT product_name, SUM(amount) AS total_revenue FROM sales GROUP BY product_name;
//
//        17. Write a SQL query to find the second-highest salary from the "employees" table.
//                Answer: SELECT salary FROM employees ORDER BY salary DESC LIMIT 1 OFFSET 1;
//
//        18. Write a SQL query to retrieve the names of employees whose names start with the letter 'A'.
//                Answer: SELECT name FROM employees WHERE name LIKE 'A%';
//
//        19. Write a SQL query to calculate the average salary of employees and display it as "Average Salary".
//                Answer: SELECT AVG(salary) AS "Average Salary" FROM employees;
//
//        20. Write a SQL query to retrieve the number of orders placed by each customer in the "orders" table.
//                Answer: SELECT customer_id, COUNT(*) AS order_count FROM orders GROUP BY customer_id;
//
//        21. Write a SQL query to find the employees who earn more than the average salary of all employees.
//        Answer: SELECT * FROM employees WHERE salary > (SELECT AVG(salary) FROM employees);
//
//        22. Write a SQL query to retrieve the names of customers who have placed orders in the last 30 days.
//                Answer: SELECT name FROM customers WHERE customer_id IN (SELECT DISTINCT customer_id FROM orders WHERE order_date >= (CURDATE() - INTERVAL 30 DAY));
//
//        23. Write a SQL query to find the third-highest salary from the "employees" table.
//                Answer: SELECT DISTINCT salary FROM employees ORDER BY salary DESC LIMIT 2, 1;
//
//        24. Write a SQL query to find the customers who have not placed any orders in the "orders" table.
//                Answer: SELECT name FROM customers WHERE customer_id NOT IN (SELECT DISTINCT customer_id FROM orders);
//
//        25. Write a SQL query to find the employees who have the same salary as the highest salary.
//                Answer: SELECT * FROM employees WHERE salary = (SELECT MAX(salary) FROM employees);
//
//        26. Write a SQL query to calculate the total revenue for each month in the "sales" table and display the month and total revenue.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m');
//
//        27. Write a SQL query to retrieve the names of employees who work in the "sales" or "marketing" department.
//                Answer: SELECT name FROM employees WHERE department IN ('sales', 'marketing');
//
//        28. Write a SQL query to calculate the total revenue for each category in the "products" table and display the category name along with the total revenue.
//                Answer: SELECT category, SUM(price * quantity) AS total_revenue FROM products GROUP BY category;
//
//        29. Write a SQL query to find the employees who joined the company in the year 2021.
//        Answer: SELECT * FROM employees WHERE YEAR(hire_date) = 2021;
//
//        30. Write a SQL query to retrieve the names of customers who have placed orders with a total amount greater than 1000.
//        Answer: SELECT name FROM customers WHERE customer_id IN (SELECT customer_id FROM orders GROUP BY customer_id HAVING SUM(amount) > 1000);
//
//        31. Write a SQL query to calculate the total revenue for each month and year in the "sales" table and display the month and year along with the total revenue.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS month_year, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m');
//
//        32. Write a SQL query to find the employees who have not been assigned to any project.
//        Answer: SELECT * FROM employees WHERE id NOT IN (SELECT DISTINCT employee_id FROM projects);
//
//        33. Write a SQL query to calculate the total revenue for each customer in the "orders" table and display the customer name along with the total revenue.
//                Answer: SELECT customers.name, SUM(orders.amount) AS total_revenue FROM customers JOIN orders ON customers.customer_id = orders.customer_id GROUP BY customers.name;
//
//        34. Write a SQL query to find the employees whose salary is within the range of 50000 and 70000.
//        Answer: SELECT * FROM employees WHERE salary BETWEEN 50000 AND 70000;
//
//        35. Write a SQL query to find the employees who earn more than the average salary of their department.
//        Answer: SELECT * FROM employees WHERE salary > (SELECT AVG(salary) FROM employees GROUP BY department WHERE employees.department = department);
//
//        36. Write a SQL query to calculate the total revenue for each day in the "sales" table and display the day along with the total revenue.
//        Answer:
//
//        SELECT DATE(sale_date) AS day, SUM(amount) AS total_revenue FROM sales GROUP BY DATE(sale_date);
//
//        37. Write a SQL query to find the customers who have placed orders with more than one product.
//                Answer: SELECT customer_id FROM orders GROUP BY customer_id HAVING COUNT(DISTINCT product_id) > 1;
//
//        38. Write a SQL query to find the employees who have been assigned to all projects.
//                Answer: SELECT * FROM employees WHERE id NOT IN (SELECT DISTINCT employee_id FROM projects WHERE employee_id IS NULL);
//
//        39. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue.
//                Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category;
//
//        40. Write a SQL query to find the customers who have placed orders in the "orders" table after a specific date (e.g., '2022-01-01').
//                Answer: SELECT customer_id FROM orders WHERE order_date > '2022-01-01';
//
//        41. Write a SQL query to find the employees whose name contains the word 'Manager'.
//                Answer: SELECT * FROM employees WHERE name LIKE '%Manager%';
//
//        42. Write a SQL query to find the customers who have placed orders with a total amount greater than the average total amount of all orders.
//                Answer: SELECT customer_id FROM orders GROUP BY customer_id HAVING SUM(amount) > (SELECT AVG(amount) FROM orders);
//
//        43. Write a SQL query to calculate the total revenue for each day of the week (e.g., Monday, Tuesday) in the "sales" table and display the day of the week along with the total revenue.
//                Answer: SELECT DAYNAME(sale_date) AS day_of_week, SUM(amount) AS total_revenue FROM sales GROUP BY DAYOFWEEK(sale_date);
//
//        44. Write a SQL query to find the employees who have not been assigned to any project after a specific date (e.g., '2022-01-01').
//        Answer: SELECT * FROM employees WHERE id NOT IN (SELECT DISTINCT employee_id FROM projects WHERE start_date > '2022-01-01');
//
//        45. Write a SQL query to calculate the total revenue for each product in the "sales" table and display the product name along with the total revenue in descending order of revenue.
//        Answer: SELECT product_name, SUM(amount) AS total_revenue FROM sales GROUP BY product_name ORDER BY total_revenue DESC;
//
//        46. Write a SQL query to find the customers who have placed orders with products that have a price greater than 100.
//        Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE price > 100);
//
//        47. Write a SQL query to calculate the total revenue for each quarter (Q1, Q2, Q3, Q4) in the "sales" table and display the quarter along with the total revenue.
//        Answer: SELECT CONCAT('Q', QUARTER(sale_date)) AS quarter, SUM(amount) AS total_revenue FROM sales GROUP BY quarter;
//
//        48. Write a SQL query to find the employees who have the highest salary in their respective department.
//                Answer: SELECT * FROM employees WHERE (department, salary) IN (SELECT department, MAX(salary) FROM employees GROUP BY department);
//
//        49. Write a SQL query to calculate the total revenue for each year in the "sales" table and display the year along with the total revenue.
//        Answer: SELECT YEAR(sale_date) AS year, SUM(amount) AS total_revenue FROM sales GROUP BY YEAR(sale_date);
//
//        50. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics'.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Electronics');
//
//        51. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in descending order of revenue.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category ORDER BY total_revenue DESC;
//
//        52. Write a SQL query to find the employees who have been assigned to all projects with the status 'Completed'.
//                Answer: SELECT * FROM employees WHERE id NOT IN (SELECT DISTINCT employee_id FROM projects WHERE status != 'Completed');
//
//        53. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Clothing' or 'Shoes'.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category IN ('Clothing', 'Shoes'));
//
//        54. Write a SQL query to calculate the total revenue for each year and month in the "sales" table and display the year and month along with the total revenue.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS year_month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m');
//
//        55. Write a SQL query to find the employees who have not been assigned to any project with the status 'In Progress'.
//                Answer: SELECT * FROM employees WHERE id NOT IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'In Progress');
//
//        56. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category ORDER BY total_revenue;
//
//        57. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' and have a price greater than 500.
//        Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Electronics' AND price > 500);
//
//        58. Write a SQL query to calculate the total revenue for each day of the week (e.g., Monday, Tuesday) in the "sales" table and display the day of the week along with the total revenue in descending order of revenue.
//        Answer: SELECT DAYNAME(sale_date) AS day_of_week, SUM(amount) AS total_revenue FROM sales GROUP BY DAYOFWEEK(sale_date) ORDER BY total_revenue DESC;
//
//        59. Write a SQL query to find the employees who have been assigned to all projects with the status 'Completed' and have a rating greater than 4.
//        Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'Completed') AND rating > 4;
//
//        60. Write a SQL query to calculate the total revenue for each quarter (Q1, Q2, Q3, Q4) in the "sales" table and display the quarter along with the total revenue in descending order of revenue.
//                Answer: SELECT CONCAT('Q', QUARTER(sale_date)) AS quarter, SUM(amount) AS total_revenue FROM sales GROUP BY quarter ORDER BY total_revenue DESC;
//
//        61. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Clothing' and have a price greater than 100.
//        Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Clothing' AND price > 100);
//
//        62. Write a SQL query to calculate the total revenue for each year in the "
//
//        sales" table and display the year along with the total revenue in descending order of revenue.
//        Answer: SELECT YEAR(sale_date) AS year, SUM(amount) AS total_revenue FROM sales GROUP BY YEAR(sale_date) ORDER BY total_revenue DESC;
//
//        63. Write a SQL query to find the employees who have been assigned to all projects with the status 'In Progress' and have a rating greater than 3.
//        Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'In Progress') AND rating > 3;
//
//        64. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 5000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 5000 ORDER BY total_revenue;
//
//        65. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' or 'Appliances' and have a price greater than 1000.
//        Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category IN ('Electronics', 'Appliances') AND price > 1000);
//
//        66. Write a SQL query to calculate the total revenue for each month and year in the "sales" table and display the month and year along with the total revenue in descending order of revenue, but only display months with a revenue greater than 10000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS month_year, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 10000 ORDER BY total_revenue DESC;
//
//        67. Write a SQL query to find the employees who have been assigned to all projects with the status 'Completed' and have a rating greater than 4.5.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'Completed') AND rating > 4.5;
//
//        68. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 10000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 10000 ORDER BY total_revenue;
//
//        69. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' or 'Appliances' and have a price greater than 5000.
//        Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category IN ('Electronics', 'Appliances') AND price > 5000);
//
//        70. Write a SQL query to calculate the total revenue for each month and year in the "sales" table and display the month and year along with the total revenue in descending order of revenue, but only display months with a revenue greater than 50000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS month_year, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 50000 ORDER BY total_revenue DESC;
//
//        71. Write a SQL query to find the employees who have been assigned to all projects with the status 'In Progress' and have a rating greater than 4.5.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'In Progress') AND rating > 4.5;
//
//        72. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 50000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 50000 ORDER BY total_revenue;
//
//        73. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' and have a price greater than 5000, but have not placed orders in the last 60 days.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Electronics' AND price > 5000) AND customer_id NOT IN (SELECT customer_id FROM orders WHERE order_date >= (CURDATE() - INTERVAL 60 DAY));
//
//        74. Write a SQL query to calculate the total revenue for each year and month in the "sales" table and display the year and month along with the total revenue in descending order of revenue, but only display months with a revenue greater than 100000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS year_month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 100000 ORDER BY total_revenue DESC;
//
//        75. Write a SQL query to find the employees who have been assigned to all projects with the status 'Completed' and have a rating greater than 4.8.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'Completed') AND rating > 4.8;
//
//        76. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 100000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 100000 ORDER BY
//
//        total_revenue;
//
//        77. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' or 'Appliances' and have a price greater than 10000, but have not placed orders in the last 90 days.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category IN ('Electronics', 'Appliances') AND price > 10000) AND customer_id NOT IN (SELECT customer_id FROM orders WHERE order_date >= (CURDATE() - INTERVAL 90 DAY));
//
//        78. Write a SQL query to calculate the total revenue for each year and month in the "sales" table and display the year and month along with the total revenue in descending order of revenue, but only display months with a revenue greater than 500000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS year_month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 500000 ORDER BY total_revenue DESC;
//
//        79. Write a SQL query to find the employees who have been assigned to all projects with the status 'In Progress' and have a rating greater than 4.8.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'In Progress') AND rating > 4.8;
//
//        80. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 500000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 500000 ORDER BY total_revenue;
//
//        81. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' and have a price greater than 10000, but have not placed orders in the last 120 days.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Electronics' AND price > 10000) AND customer_id NOT IN (SELECT customer_id FROM orders WHERE order_date >= (CURDATE() - INTERVAL 120 DAY));
//
//        82. Write a SQL query to calculate the total revenue for each year and month in the "sales" table and display the year and month along with the total revenue in descending order of revenue, but only display months with a revenue greater than 1000000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS year_month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 1000000 ORDER BY total_revenue DESC;
//
//        83. Write a SQL query to find the employees who have been assigned to all projects with the status 'Completed' and have a rating greater than 4.9.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'Completed') AND rating > 4.9;
//
//        84. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 1000000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 1000000 ORDER BY total_revenue;
//
//        85. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' and have a price greater than 50000, but have not placed orders in the last 150 days.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Electronics' AND price > 50000) AND customer_id NOT IN (SELECT customer_id FROM orders WHERE order_date >= (CURDATE() - INTERVAL 150 DAY));
//
//        86. Write a SQL query to calculate the total revenue for each year and month in the "sales" table and display the year and month along with the total revenue in descending order of revenue, but only display months with a revenue greater than 2000000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS year_month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 2000000 ORDER BY total_revenue DESC;
//
//        87. Write a SQL query to find the employees who have been assigned to all projects with the status 'In Progress' and have a rating greater than 4.9.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'In Progress') AND rating > 4.9;
//
//        88. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 2000000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 2000000 ORDER BY total_revenue;
//
//        89. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' and have a price greater than 100000, but have not placed orders in the last 180 days.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Electronics' AND price > 100000) AND customer_id NOT IN (SELECT customer_id FROM orders WHERE order_date >= (CURDATE() - INTERVAL 180 DAY));
//
//        90. Write a SQL query to calculate the total revenue for each year and month in the "sales" table and display the year and month along with the total revenue in descending order of revenue, but only display months with a revenue greater than 3000000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS year_month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 3000000 ORDER BY total_revenue DESC;
//
//        91. Write a SQL query to find the employees who have been assigned to all projects with the status 'Completed' and have a rating greater than 4.95.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'Completed') AND rating > 4.95;
//
//        92. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 3000000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 3000000 ORDER BY total_revenue;
//
//        93. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' and
//
//        have a price greater than 200000, but have not placed orders in the last 210 days.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Electronics' AND price > 200000) AND customer_id NOT IN (SELECT customer_id FROM orders WHERE order_date >= (CURDATE() - INTERVAL 210 DAY));
//
//        94. Write a SQL query to calculate the total revenue for each year and month in the "sales" table and display the year and month along with the total revenue in descending order of revenue, but only display months with a revenue greater than 4000000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS year_month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 4000000 ORDER BY total_revenue DESC;
//
//        95. Write a SQL query to find the employees who have been assigned to all projects with the status 'In Progress' and have a rating greater than 4.95.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'In Progress') AND rating > 4.95;
//
//        96. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 4000000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 4000000 ORDER BY total_revenue;
//
//        97. Write a SQL query to find the customers who have placed orders with products that belong to the category 'Electronics' and have a price greater than 300000, but have not placed orders in the last 240 days.
//                Answer: SELECT DISTINCT customer_id FROM orders WHERE product_id IN (SELECT product_id FROM products WHERE category = 'Electronics' AND price > 300000) AND customer_id NOT IN (SELECT customer_id FROM orders WHERE order_date >= (CURDATE() - INTERVAL 240 DAY));
//
//        98. Write a SQL query to calculate the total revenue for each year and month in the "sales" table and display the year and month along with the total revenue in descending order of revenue, but only display months with a revenue greater than 5000000.
//        Answer: SELECT DATE_FORMAT(sale_date, '%Y-%m') AS year_month, SUM(amount) AS total_revenue FROM sales GROUP BY DATE_FORMAT(sale_date, '%Y-%m') HAVING total_revenue > 5000000 ORDER BY total_revenue DESC;
//
//        99. Write a SQL query to find the employees who have been assigned to all projects with the status 'Completed' and have a rating greater than 4.98.
//                Answer: SELECT * FROM employees WHERE id IN (SELECT DISTINCT employee_id FROM projects WHERE status = 'Completed') AND rating > 4.98;
//
//        100. Write a SQL query to calculate the total revenue for each product category in the "sales" table and display the category name along with the total revenue in ascending order of revenue, but only display categories with a revenue greater than 5000000.
//        Answer: SELECT category, SUM(amount) AS total_revenue FROM sales JOIN products ON sales.product_id = products.product_id GROUP BY category HAVING total_revenue > 5000000 ORDER BY total_revenue;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//}