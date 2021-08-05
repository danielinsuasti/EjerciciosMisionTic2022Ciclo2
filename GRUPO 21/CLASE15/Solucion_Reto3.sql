--SOLUCION PREGUNTA 1
SELECT mc.Nombre_Material , mc.Precio_Unidad 
FROM MaterialConstruccion mc 
WHERE mc.Importado = 'Si'
ORDER BY Precio_Unidad Desc

--SOLUCION PREGUNTA 2

SELECT DISTINCT c.Proveedor , mc.Nombre_Material , mc.Importado 
FROM MaterialConstruccion mc 
JOIN Compra c ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion 
WHERE mc.Importado = 'Si'
ORDER BY c.Proveedor , mc.Nombre_Material 


--SOLUCION PREGUNTA 3

SELECT c.Proveedor , mc.Nombre_Material , mc.Importado , mc.Precio_Unidad, SUM(c.Cantidad) as Cantidad
FROM MaterialConstruccion mc 
JOIN Compra c ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion 
WHERE mc.Importado = 'Si' AND c.Proveedor = 'Homecenter'
GROUP BY c.Proveedor , mc.Nombre_Material 
ORDER BY c.Proveedor , mc.Nombre_Material 

--SOLUCION PREGUNTA 4

SELECT DISTINCT p.Constructora , p.Ciudad 
FROM Proyecto p 
WHERE p.Ciudad LIKE 'B%'
ORDER BY p.Ciudad 


--SOLUCION PREGUNTA 5

SELECT c.Proveedor , mc.Nombre_Material , mc.Importado , mc.Precio_Unidad, SUM(c.Cantidad) as Cantidad
FROM MaterialConstruccion mc 
JOIN Compra c ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion 
WHERE mc.Importado = 'Si' AND c.Proveedor = 'Homecenter'
GROUP BY c.Proveedor , mc.Nombre_Material 
HAVING SUM(c.Cantidad) > 100
ORDER BY c.Proveedor , mc.Nombre_Material 
