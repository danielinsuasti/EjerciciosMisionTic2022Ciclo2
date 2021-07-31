

  CREATE TABLE Persona  (
  ID_Persona INTEGER NOT NULL, 
  Nombre  VARCHAR(20) NOT NULL, 
  Edad INTEGER NOT NULL, 
  Ingresos  INTEGER NOT NULL, 
  PRIMARY KEY (ID_Carro));

INSERT INTO Persona (ID_Persona, Nombre, Edad, Ingresos) VALUES
  (1002400, 'Humberto',  58,  500),
  (1002401, 'Gloria',  55,  600,
  (1002402, 'Angelica',  27,  300),
  (1002403, 'Luis',  29,  700),
  (1002404, 'Alberto', 60,  400),
  (1002405, 'Andres',  19,  200);
 




 CREATE TABLE Carro  (
  ID_Carro INTEGER NOT NULL, 
  Placa  VARCHAR(2) NOT NULL, 
  Marca  VARCHAR(45) NOT NULL, 
  Modelo  INTEGER NOT NULL, 
  Serie VARCHAR(20) NOT NULL, 
  Costo INTEGER NOT NULL, 
  ID_Dueño INTEGER NOTNULL, 
  PRIMARY KEY (ID_Carro)
  FOREIGN KEY (ID_Carro) REFERENCES Persona(ID_Persona));

 

 INSERT INTO Carro (ID_Carro,Placa,Marca,Modelo,Serie,Costo, ID_Dueño) VALUES
  (1, J1,  Peugeot, 2008,  206, 40000, 1002400),
  (2, H3,  Mazda, 2016,  3, 52000, 1002402),
  (3, P5,  Audi,  2021,  A200,  90000, 1002401),
  (4, M9,  Mercedez,  2014,  654, 110000,  1002403),
  (5, N0,  Renault, 2009,  Sandero, 35000, 1002402),
  (6, J5,  Seat,  2014,  v900,  40000, 1002405);
