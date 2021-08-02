---CLASE 13 CONSULTAS AVANZADAS
--Nombre de los cargos en cada pais
-- de los empleados que ganan entre 2000 y 3000 dolares


SELECT c.country_name, j.job_title , COUNT(*)
FROM departments d , employees e , locations l , countries c , jobs j 
WHERE e.department_id = d.department_id 
AND l.location_id = d.location_id
AND c.country_id = l.country_id
AND j.job_id  = e.job_id 
AND e.salary BETWEEN  2000 AND 3000
GROUP BY c.country_name , j.job_title;


--Nombre de los cargos en cada pais
-- de los empleados que ganan entre 2000 y 3000 dolares O
-- los empleados que ganan entre 5000 y 8000 dolares


SELECT c.country_name, j.job_title , COUNT(*) AS conteo
FROM departments d , employees e , locations l , countries c , jobs j 
WHERE e.department_id = d.department_id 
AND l.location_id = d.location_id
AND c.country_id = l.country_id
AND j.job_id  = e.job_id 
AND (e.salary BETWEEN  2000 AND 3000
OR e.salary BETWEEN  5000 AND 8000)
GROUP BY c.country_name , j.job_title;

--NATURAL JOIN -> hace el join con las columnas del mismo nombre

SELECT *
FROM employees e , departments d 
WHERE e.department_id = d.department_id 

SELECT *
FROM employees e 
NATURAL JOIN departments d 



SELECT c.country_name, j.job_title , COUNT(*) as conteo
FROM employees e 
NATURAL JOIN departments d 
NATURAL JOIN locations l 
NATURAL JOIN countries c 
NATURAL JOIN jobs j 
WHERE e.salary BETWEEN  2000 AND 3000
OR e.salary BETWEEN  5000 AND 8000
GROUP BY c.country_name , j.job_title;

--USING ->  Me permite especificar el nombre del campo comun
--			mediante el cual hago la relacion

SELECT c.country_name, j.job_title , COUNT(*) as conteo
FROM employees e 
JOIN departments d USING(department_id) 
JOIN locations l  USING(location_id)
JOIN countries c USING(country_id)
JOIN jobs j USING(job_id)
WHERE e.salary BETWEEN  2000 AND 3000
OR e.salary BETWEEN  5000 AND 8000
GROUP BY c.country_name , j.job_title;


--ON --> 	Puedo especificar el nombre de campo,
--			que  puede ser diferente en cada tabla

SELECT c.country_name, j.job_title , COUNT(*) as conteo
FROM employees e 
JOIN departments d ON e.department_id = d.department_id 
JOIN locations l  ON d.location_id = l.location_id 
JOIN countries c ON l.country_id = c.country_id 
JOIN jobs j ON e.job_id = j.job_id 
WHERE e.salary BETWEEN  2000 AND 3000
OR e.salary BETWEEN  5000 AND 8000
GROUP BY c.country_name , j.job_title;

-- SELF JOIN

SELECT *
FROM employees jefes
JOIN employees empleados ON (jefes.manager_id = empleados.employee_id) 

SELECT *
FROM employees jefes


SELECT e.first_name || ' ' || e.last_name as empleado , m.first_name || ' ' || m.last_name as jefe
FROM employees e
JOIN employees m ON (e.manager_id = m.employee_id) 


--LEFT JOIN --LEFT OUTER JOIN -> Lo utilizo cuando me importa la información
					-- de una de las tablas, sin importar si no existe match
					-- con la otra tabla
SELECT *
FROM employees jefes
LEFT JOIN employees empleados ON (jefes.manager_id = empleados.employee_id) 


SELECT e.first_name || ' ' || e.last_name as empleado , m.first_name || ' ' || m.last_name as jefe
FROM employees e
LEFT JOIN employees m ON (e.manager_id = m.employee_id) 


-- NON EQUIJOIN -> Cuando no existe una llave foranea comun pero puedo
--					enlazarlo por un campo.

SELECT last_name , salary, NULL AS grado
FROM employees e 

SELECT *
FROM job_grades jg 


SELECT e.last_name , e.salary, jg.grade 
FROM employees e
JOIN job_grades jg ON e.salary BETWEEN jg.lowest_sal AND jg.highest_sal



SELECT jg.grade , COUNT(*) conteo 
FROM employees e
JOIN job_grades jg ON e.salary BETWEEN jg.lowest_sal AND jg.highest_sal
GROUP BY jg.grade 
ORDER BY conteo DESC

--CROSS JOIN -> Muestra todas las prosibles combinaciones entre dos tablas

SELECT *
FROM departments d 

SELECT *
FROM jobs j 

SELECT d.department_name , j.job_title 
FROM jobs j , departments d 

SELECT d.department_name , j.job_title 
FROM  jobs j
CROSS JOIN departments d 


--CUALES SERIAN LOS DEPARTAMENTOS Y PUESTOS NUEVOS
--QUE TENDRIA QUE CREAR PARA LOGRAR UN CONJUNTO QUE CUMPLIERA
--QUE TODOS LOS CARGOS"job_title", esten presentes en todos los
--departamentos

--Empleados que ya existen en los departamentos
SELECT DISTINCT department_name , j.job_title 
FROM departments d 
NATURAL JOIN employees e 
NATURAL JOIN jobs j 

SELECT d.department_name , j.job_title 
FROM departments d 
CROSS JOIN jobs j 
WHERE(d.department_name, j.job_title) NOT IN(  SELECT DISTINCT department_name , j.job_title 
											   FROM departments d 
											   NATURAL JOIN employees e 
											   NATURAL JOIN jobs j )
											   
--SUBCONSULTAS

--todos los departamentos en donde hayan mas de 2 empleados
											   
-- ademas los departamentos que devenguen mas de 5000

SELECT *
FROM(
		SELECT e.department_id , COUNT(*) empleados, SUM(salary) as salarios
		FROM employees e 
		GROUP BY department_id)
WHERE empleados > 2
AND salarios > 50000


SELECT 	last_name , salary , 
		(SELECT AVG(salary) FROM employees e) AS promedio,
		salary - (SELECT AVG(salary) FROM employees e) as diferencia
FROM employees e 


--EJEMPLO INSERT INTO

INSERT INTO departments (department_id, department_name, location_id)
VALUES(70, 'PUBLIC RELATIONS', 3000)

SELECT * FROM departments d



