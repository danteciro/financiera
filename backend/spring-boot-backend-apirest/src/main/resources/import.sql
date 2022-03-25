/* Populate tabla clientes */
INSERT INTO cliente (Id,nombres, apellidos,dni,telefono, email) VALUES(CLIENTES_SEQ.nextval,'Juan', 'Perez','10682279','979719847', 'jperez@gmail.com');
INSERT INTO cliente (Id,nombres, apellidos,dni,telefono, email) VALUES(CLIENTES_SEQ.nextval,'Luis', 'Martinez','10682278','979719846', 'lmartines@gmail.com');
INSERT INTO cliente (Id,nombres, apellidos,dni,telefono, email) VALUES(CLIENTES_SEQ.nextval,'Paolo', 'Guerrero','10682277','979719845', 'pguerrero@gmail.com');
INSERT INTO cliente (Id,nombres, apellidos,dni,telefono, email) VALUES(CLIENTES_SEQ.nextval,'Dante', 'Artica','10682276','979719844', 'dante@gmail.com');
INSERT INTO cliente (Id,nombres, apellidos,dni,telefono, email) VALUES(CLIENTES_SEQ.nextval,'Pedro', 'Rivera','10682274','979719843', 'pedro@gmail.com');

INSERT INTO producto (Id,nombre, precio) VALUES(PRODUCTO_SEQ.nextval,'Mouse', '15');
INSERT INTO producto (Id,nombre, precio) VALUES(PRODUCTO_SEQ.nextval,'Teclado', '36');
