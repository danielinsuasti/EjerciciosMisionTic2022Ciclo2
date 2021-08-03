
-----------------------CLASE 13----------------------------------------
--RELACIONAR CINCO TABLAS, departamento, empleados, ubicacion , pais y REGION
SELECT e.last_name , e.department_id , d.department_name, l.city, c.country_name, r.region_name 
FROM employees e , departments d, locations l, countries c, regions r 
WHERE e.department_id = d.department_id 
AND d.location_id = l.location_id
AND c.country_id = l.country_id
AND r.region_id  = c.region_id 


--Cuantos empleados hay por país

SELECT c.country_name, COUNT(*) 
FROM employees e , departments d, locations l, countries c 
WHERE e.department_id = d.department_id 
AND d.location_id = l.location_id
AND c.country_id = l.country_id
GROUP BY c.country_name 

--Cuantos empleados hay por país y por CIUDAD

SELECT c.country_name, l.city , COUNT(*) 
FROM employees e , departments d, locations l, countries c 
WHERE e.department_id = d.department_id 
AND d.location_id = l.location_id
AND c.country_id = l.country_id
GROUP BY c.country_name, l.city 

--Nombre de los cargos por país

SELECT c.country_name, j.job_title , COUNT(*) 
FROM employees e , departments d, locations l, countries c, jobs j 
WHERE e.department_id = d.department_id 
AND d.location_id = l.location_id
AND c.country_id = l.country_id
AND j.job_id = e.job_id 
GROUP BY c.country_name, j.job_title 

--Nombre de los cargos, en cada país de los 
--empleados que ganan entre 2000 y 3000

-- O entre 5000 y 8000

SELECT c.country_name, j.job_title , COUNT(*) 
FROM employees e , departments d, locations l, countries c, jobs j 
WHERE e.department_id = d.department_id 
AND d.location_id = l.location_id
AND c.country_id = l.country_id
AND j.job_id = e.job_id 
AND (e.salary BETWEEN 2000 AND 3000
OR e.salary BETWEEN 5000 AND 8000)
GROUP BY c.country_name, j.job_title


--NATURAL JOIN -> Hace el join con las columnas con el mismo nombre

SELECT c.country_name, j.job_title , COUNT(*) 
FROM employees e --, departments d, locations l, countries c, jobs j 
NATURAL JOIN departments d 
NATURAL JOIN locations l 
NATURAL JOIN countries c 
NATURAL JOIN jobs j 
WHERE e.salary BETWEEN 2000 AND 3000
OR e.salary BETWEEN 5000 AND 8000
GROUP BY c.country_name, j.job_title

--USING -> Puedo especificar el nombre del campo con el cual quiero 
--		   relacionar	 

SELECT c.country_name, j.job_title , COUNT(*) 
FROM employees e --, departments d, locations l, countries c, jobs j 
JOIN departments d USING(department_id) 
JOIN locations l USING(location_id)
JOIN countries c USING (country_id)
JOIN jobs j USING (job_id)
WHERE e.salary BETWEEN 2000 AND 3000
OR e.salary BETWEEN 5000 AND 8000
GROUP BY c.country_name, j.job_title

--ON -> En el caso en el que las llaves primarias y foraneas se llamen diferente

SELECT c.country_name, j.job_title , COUNT(*) 
FROM employees e --, departments d, locations l, countries c, jobs j 
JOIN departments d ON e.department_id = d.department_id 
JOIN locations l ON d.location_id = l.location_id 
JOIN countries c ON l.country_id = c.country_id 
JOIN jobs j ON j.job_id = e.job_id 
WHERE e.salary BETWEEN 2000 AND 3000
OR e.salary BETWEEN 5000 AND 8000
GROUP BY c.country_name, j.job_title


--SELF JOIN 

SELECT *
FROM employees e 
JOIN employees e2 ON (e.manager_id = e2.employee_id)

SELECT e.first_name || ' ' || e.last_name EMPLEADO, m.first_name || ' ' || m.last_name JEFE
FROM employees e 
JOIN employees m ON (e.manager_id = m.employee_id)


---LEFT JOIN -> Cuando tengo prioridad sobre una tabla

SELECT *
FROM employees e 
LEFT JOIN employees e2 ON (e.manager_id = e2.employee_id)

SELECT e.first_name || ' ' || e.last_name EMPLEADO, m.first_name || ' ' || m.last_name JEFE
FROM employees e 
LEFT JOIN employees m ON (e.manager_id = m.employee_id)

--NO EQUIJOIN -> 	Cuando no existe una llave foranea entre tablas
--					pero puedo enlazarlas por un campo

SELECT last_name , salary, NULL as grado
FROM employees e 

SELECT *
FROM job_grades jg 

SELECT last_name , salary, jg.grade 
FROM employees e 
JOIN job_grades jg ON e.salary BETWEEN jg.lowest_sal AND jg.highest_sal 



SELECT jg.grade, COUNT(*) conteo 
FROM employees e 
JOIN job_grades jg ON e.salary BETWEEN jg.lowest_sal AND jg.highest_sal 
GROUP BY jg.grade
ORDER BY conteo DESC


--CROSS JOIN -> Producto punto entre dos tablas, realiza todas las
--				posibles combinaciones
SELECT *
FROM departments d

SELECT *
FROM jobs j 

SELECT d.department_name , j.job_title 
FROM departments d , jobs j 

SELECT d.department_name , j.job_title 
FROM departments d 
CROSS JOIN jobs j 

--Cuantos cargos habria que crear para que todos los departamentos
--tengan personal de todos los cargos.

--cuales seran los departamentos y puestos nuevos que tendría
--que crear para lograr ese conjunto


--EMPLEOS QUE YA EXISTEN

SELECT DISTINCT d.department_name , j.job_title 
FROM departments d 
NATURAL JOIN employees e 
NATURAL JOIN jobs j 


SELECT d.department_name , j.job_title 
FROM departments d 
CROSS JOIN jobs j 
WHERE (d.department_name, j.job_title) NOT IN(
											SELECT DISTINCT d.department_name , j.job_title 
											FROM departments d 
											NATURAL JOIN employees e 
											NATURAL JOIN jobs j)

											
--SUBCONULTAS
																					
--Todos los departamentos que tengan mas de 2 empleados

SELECT *
FROM(
		SELECT department_id , COUNT(*) empleados
		FROM employees e 
		GROUP BY department_id)
WHERE empleados >2


SELECT AVG(salary) FROM employees e 

--De todos los empleados tomar su salario, y saber la diferencia
--entre el salario promedio y el salario que recibe el empleado

SELECT  last_name, salary , 
		(SELECT AVG(salary) FROM employees e)  as promedio, 
		salary - (SELECT AVG(salary) FROM employees e) as diferencia
FROM employees e 
					


--INSERT

INSERT INTO departments (department_id, department_name, location_id)
VALUES (70, "DEPARTAMENTO NUEVO", 3000)


SELECT *
FROM departments d 
