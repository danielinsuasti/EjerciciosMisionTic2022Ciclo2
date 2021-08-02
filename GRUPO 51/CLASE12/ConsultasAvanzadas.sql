---------------GRUPO 51 CLASE 12
------------------CLASE 12 GRUPO 51--------------

--FUNCTIONS
SELECT last_name , salary , salary / 10000, ROUND(salary / 10000, 1), FLOOR(salary / 10000), CEIL (salary / 10000)
FROM employees e 

--CADENAS

SELECT employee_id , last_name , department_id 
FROM employees e 
WHERE lower(last_name) = 'higgins'


--DATE FUNCTIONS

SELECT DATE('now'), TIME('now'), JULIANDAY('now'), JULIANDAY('2000-01-01') 

SELECT DATE('now'), TIME('now'), JULIANDAY('now') - JULIANDAY('2000-01-01') 

SELECT date('now','start of month','+2 month','-1 day');

SELECT date('now','start of year','+9 months','weekday 2');

--COMPARE FUNCTIONS

--COALESCE

SELECT last_name , commision , manager_id, COALESCE (commision, manager_id, 0)
FROM employees e 

--CASE 

SELECT last_name , salary ,
	CASE
		WHEN salary > 17000
			THEN 'The salary is greater than 17000'
		WHEN salary = 17000 THEN 'The salary is 17000'
		ELSE 'The salary is under 17000'
	END AS SalaryText
FROM employees e ;

--NESTED FUNCTIONS


--Armar un codigo a partir de las primeras cuatro letras del 
--apellido, y adicionarle el estring '_US'
SELECT last_name, UPPER(SUBSTRING(last_name, 1 , 4) || '_US' ) codigo
FROM employees e 

----FUNCIONES AVANZADAS---

--FUNCIONES MULTIFILA

SELECT AVG(salary), SUM(salary), MAX(salary), MIN(salary)
FROM employees e 

SELECT COUNT(*)
FROM employees e 

SELECT DISTINCT department_id
FROM employees e 


SELECT COUNT(DISTINCT department_id)
FROM employees e 


SELECT COUNT(*), COUNT(DISTINCT department_id), COUNT(commision)
FROM employees e 


SELECT COUNT(department_id)
FROM employees e 

--GROUP BY

--Agrupar por department_id

SELECT AVG(salary), SUM(salary), MAX(salary), MIN(salary)
FROM employees e 

--Agrupo por un atributo 
SELECT department_id , AVG(salary), SUM(salary), MAX(salary), MIN(salary)
FROM employees e 
GROUP BY department_id 
--ORDER BY AVG(salary ) desc


--Agrupo por dos atributos
SELECT department_id , job_id ,AVG(salary), SUM(salary), MAX(salary), MIN(salary)
FROM employees e 
--WHERE department_id =10 or department_id = 11
GROUP BY department_id , job_id 



--contar cantidad por cada grupo posible
SELECT department_id , job_id , COUNT(*) ,AVG(salary), SUM(salary), MAX(salary), MIN(salary)
FROM employees e 
--WHERE department_id =10 or department_id = 11
GROUP BY department_id , job_id 

--con HAVING Y WHERE


SELECT department_id , job_id , COUNT(*) empleados ,AVG(salary) Promedio, SUM(salary) salarioTotal, MAX(salary) Maximo, MIN(salary) Minimo
FROM employees e 
WHERE department_id <> 9
--WHERE department_id =10 or department_id = 11
GROUP BY department_id , job_id 
HAVING Promedio > 8000
ORDER BY Promedio DESC 


--------------MULTIPLES TABLAS JOINS----------------


SELECT *
FROM employees e 

SELECT *
FROM departments d 
WHERE department_id = 10

--RELACIONAR DOS TABLAS
SELECT e.last_name , e.department_id , d.department_name 
FROM employees e , departments d 
WHERE e.department_id = d.department_id 


--RELACIONAR TRES TABLAS, departamento, empleados Y UBICACION
SELECT e.last_name , e.department_id , d.department_name, l.city 
FROM employees e , departments d, locations l 
WHERE e.department_id = d.department_id AND d.location_id = l.location_id 


--RELACIONAR CUATRO TABLAS, departamento, empleados, ubicacion y PAIS
SELECT e.last_name , e.department_id , d.department_name, l.city, c.country_name 
FROM employees e , departments d, locations l, countries c 
WHERE e.department_id = d.department_id 
AND d.location_id = l.location_id
AND c.country_id = l.country_id 

--RELACIONAR CUATRO TABLAS, departamento, empleados, ubicacion , pais y REGION