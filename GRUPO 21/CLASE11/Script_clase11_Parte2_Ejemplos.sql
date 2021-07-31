--Grupo 21

SELECT *
FROM departments

SELECT department_id, department_name 
FROM departments 

SELECT * 
FROM employees

SELECT last_name, first_name , department_id 
FROM employees 


SELECT last_name, first_name , department_id, salary, salary * 0.3 /12
FROM employees

ALTER TABLE employees ADD COLUMN commision NUMERIC(5,2)

UPDATE employees SET commision = 0.3 WHERE job_id = 16

SELECT last_name, salary, commision, salary * commision
FROM employees

SELECT last_name AS Apellido, salary AS Salario, commision Porcentaje, ifnull(salary * commision, 0) Comision
FROM employees 


SELECT first_name || ' con apellido ' || last_name NombreCompleto, salary Salario, commision Porcentaje, salary * commision Comision
FROM employees

SELECT DISTINCT department_id 
FROM employees

SELECT * 
FROM employees 
WHERE department_id = 9


SELECT last_name, job_id, department_id 
FROM employees 
WHERE last_name = 'Whalen'


SELECT *
FROM employees 
WHERE hire_date = '1997-09-28'


SELECT *
FROM employees 
WHERE department_id >= 3 AND department_id <=5




SELECT *
FROM employees 
WHERE manager_id IS NULL 
--WHERE last_name LIKE '___R%'       -- % -> 0 o mas caracteres     _ ->1 caracter  'A%'  '_a%'
--WHERE department_id IN ( 2, 8, 10)
--WHERE department_id BETWEEN 3 and 5
--WHERE hire_date <>'1994-06-07'
--WHERE hire_date ='1994-06-07'


SELECT DISTINCT department_id 
FROM employees
ORDER BY department_id  



SELECT last_name, job_id, department_id 
FROM employees 
ORDER BY 1