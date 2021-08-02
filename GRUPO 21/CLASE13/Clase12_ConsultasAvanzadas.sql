---------GRUPO 21 CLASE 12
----------------CLASE 12 -------------------------
--FUNCTIONS

SELECT last_name, salary, salary / 10000 , ROUND(salary / 10000, 1), FLOOR(salary / 10000), CEIL(salary / 10000), salary % 1000
FROM employees e 

--STRINGS
SELECT employee_id , last_name , department_id 
FROM employees e 
WHERE last_name = 'higgins'

SELECT employee_id , last_name, department_id 
FROM employees e 
WHERE LOWER(last_name) = 'higgins'

--DATE FUNCTIONS

SELECT DATE('now'), TIME('now'), JULIANDAY('now'), JULIANDAY('2000-01-01') 

SELECT DATE('now'), TIME('now'), JULIANDAY('now') - JULIANDAY('2000-01-01') 

SELECT date('2022-12-15','start of month','+1 month','-1 day');


--Calcule la fecha del primer martes de octubre para el año actual.
SELECT date('now','start of year','+9 months', 'weekday 2');



--COMPARE FUNCTIONS

--coalesce

SELECT *
FROM employees e 

SELECT last_name, commision , manager_id , COALESCE(commision, manager_id,0)
FROM employees e 

--CASE example

SELECT last_name , salary,
	CASE
		WHEN salary > 17000
			THEN 'The Salary is greater than 17000'
		WHEN salary = 17000 THEN 'The Salary is 17000'
		ELSE 'The salary is under 17000'
	END AS SalaryText
FROM employees e ;


-- NESTED functions example

SELECT last_name, UPPER(SUBSTRING(last_name, 1,4) || '_US')
FROM employees e 


-----CLASE FUNCIONES AVANZADAS----

SELECT AVG(salary), SUM(salary), MAX(salary), MIN(salary) 
FROM employees e 


--
SELECT COUNT(*)
FROM employees e 

SELECT DISTINCT department_id 
FROM employees e 

SELECT COUNT(DISTINCT (department_id))
FROM employees e 
--



SELECT department_id, salary 
FROM employees e 


SELECT COUNT(*)
FROM employees e 
WHERE department_id = 10


SELECT COUNT(commision)
FROM employees e 



--GROUP BY


SELECT department_id , AVG(salary) as promedio, SUM(salary), MAX(salary), MIN(salary) 
FROM employees e 
GROUP BY department_id 
ORDER BY promedio DESC 


SELECT department_id, job_id , AVG(salary) as promedio, SUM(salary), MAX(salary), MIN(salary) 
FROM employees e 
GROUP BY department_id , job_id 
ORDER BY department_id

--ERROR GROUP BY vs HAVING "corregir!"
SELECT department_id , AVG(salary)
FROM employees e
WHERE AVG(salary) > 8000
GROUP BY department_id
--HAVING AVG(salary) > 8000


SELECT department_id , AVG(salary) promedio_departamento
FROM employees e
WHERE department_id <> 9
GROUP BY department_id
HAVING promedio_departamento > 8000

---MULTIPLES TABLAS JOINS--

SELECT last_name , department_id 
FROM employees e 

SELECT *
FROM departments d
WHERE department_id = 6

--RELACIONAR DOS TABLAS, departamento y empleado
SELECT e.last_name , e.department_id , d.department_name 
FROM departments d , employees e 
WHERE e.department_id = d.department_id 


--RELACIONAR TRES TABLAS, departamento,  empleado y UBICACION
SELECT e.last_name , e.department_id , d.department_name, l.city 
FROM departments d , employees e , locations l 
WHERE e.department_id = d.department_id 
AND l.location_id = d.location_id 


--RELACIONAR CUATRO TABLAS, departamento,  empleado, ubicacion y PAISES
SELECT e.last_name , e.department_id , d.department_name, l.city, c.country_name 
FROM departments d , employees e , locations l , countries c 
WHERE e.department_id = d.department_id 
AND l.location_id = d.location_id
AND c.country_id = l.country_id 


--CUANTOS EMPLEADOS HAY POR PAIS
--RELACIONAR CUATRO TABLAS, departamento,  empleado, ubicacion y PAISES
SELECT c.country_name, COUNT(*)
FROM departments d , employees e , locations l , countries c 
WHERE e.department_id = d.department_id 
AND l.location_id = d.location_id
AND c.country_id = l.country_id 
GROUP BY c.country_name 



--Cuantos Empleados hay por PAIS, y ciudad
--RELACIONAR CUATRO TABLAS, departamento,  empleado, ubicacion y PAISES
SELECT c.country_name, l.city , COUNT(*)
FROM departments d , employees e , locations l , countries c 
WHERE e.department_id = d.department_id 
AND l.location_id = d.location_id
AND c.country_id = l.country_id 
GROUP BY c.country_name , l.city 

--Nombre de los cargos, en cada país

SELECT c.country_name, j.job_title , COUNT(*)
FROM departments d , employees e , locations l , countries c , jobs j 
WHERE e.department_id = d.department_id 
AND l.location_id = d.location_id
AND c.country_id = l.country_id
AND j.job_id  = e.job_id 
GROUP BY c.country_name , j.job_title;






