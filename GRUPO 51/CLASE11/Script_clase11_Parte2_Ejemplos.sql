--GRUPO 51

SELECT *
FROM employees

SELECT last_name, first_name, department_id 
FROM employees 

SELECT last_name, salary 
FROM employees 

SELECT last_name, salary, salary *0.3 / 12
FROM employees


ALTER TABLE employees ADD commission_pc NUMERIC(5,2)


UPDATE employees set commission_pc = 0.3 WHERE job_id = 16


SELECT last_name as APELLIDO, salary SALARY, salary * commission_pc COMISION 
FROM employees

SELECT last_name APELLIDO, salary SALARIO, commission_pc PORCENTAJE, ifnull(salary * commission_pc, 0) COMISION
FROM employees 

SELECT first_name || '  ' || last_name NombreCompleto, salary SALARIO
FROM employees e 

SELECT DISTINCT department_id 
FROM employees 
ORDER BY department_id ASC

SELECT *
FROM employees 
WHERE department_id = 6

SELECT last_name , first_name, job_id , department_id 
FROM employees e 
WHERE last_name = 'Whalen'

SELECT last_name , first_name, job_id , department_id 
FROM employees 
WHERE department_id = 9

SELECT * 
FROM employees 


SELECT *
FROM employees 
WHERE last_name LIKE '__r%'-- 'a%'   '_a%' '_a%s'
--WHERE department_id IN (2, 8 ,10)
--WHERE hire_date <> '1994-06-07'
--WHERE hire_date = '1994-06-07'
--WHERE department_id BETWEEN 3 AND 5
--WHERE department_id >=3 and department_id <=5

SELECT *
FROM employees
WHERE manager_id IS  NULL 



SELECT last_name , first_name, job_id , department_id , hire_date contratacion
FROM employees 
ORDER BY 3, department_id DESC 




