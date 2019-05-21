DROP TABLE IF EXISTS car;

CREATE TABLE car (
  id INT NOT NULL AUTO_INCREMENT,
  matricula VARCHAR(10) NOT NULL,
  marca VARCHAR(100) NOT NULL,
  modelo VARCHAR(100) NOT NULL,
  consumos INT NOT NULL,
  primary key (id)

);

INSERT INTO car(matricula,marca,modelo,consumos)values("01-02-FD","BMW","320CD",3);
INSERT INTO car(matricula,marca,modelo,consumos)values("01-02-FE","FORD","KA",2);
INSERT INTO car(matricula,marca,modelo,consumos)values("01-02-FR","AUDI","A5",1);