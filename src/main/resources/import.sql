INSERT INTO frecuencia(nombre) VALUES('ANUAL');
INSERT INTO frecuencia(nombre) VALUES('DIARIO');
INSERT INTO frecuencia(nombre) VALUES('SEMANAL');
INSERT INTO frecuencia(nombre) VALUES('SEMESTRAL');
INSERT INTO frecuencia(nombre) VALUES('MENSUAL');
INSERT INTO frecuencia(nombre) VALUES('PERMANENTE');
INSERT INTO frecuencia(nombre) VALUES('PERSONALIZADO');



INSERT INTO programa_actividades(nombre,status) VALUES('Plan de Acción de Investigación de Incidentes',true);
INSERT INTO programa_actividades(nombre,status) VALUES('Programa de Comité Paritario Santiago',true);
INSERT INTO programa_actividades(nombre,status) VALUES('Programa de Compromisos',true);
INSERT INTO programa_actividades(nombre,status) VALUES('Programa de Inspección de Activos',true);
INSERT INTO programa_actividades(nombre,status) VALUES('Programa de Prevención',true);


INSERT INTO tipo_actividad(nombre) VALUES('Hallazgo');
INSERT INTO tipo_actividad(nombre) VALUES('Check List');
INSERT INTO tipo_actividad(nombre) VALUES('Capacitacion');
INSERT INTO tipo_actividad(nombre) VALUES('Observacion Preventiva de Seguridad');
INSERT INTO tipo_actividad(nombre) VALUES('Revision AST');

INSERT INTO cargos(nombre) VALUES('Gerente');
INSERT INTO cargos(nombre) VALUES('Administrador');
INSERT INTO cargos(nombre) VALUES('Secretario');

INSERT INTO roles(authority) VALUES('ROLE_ADMIN')
INSERT INTO roles(authority) VALUES('ROLE_USER')
INSERT INTO roles(authority) VALUES('ROLE_ADMIN')

INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Hector17','Apellido01 Apellido02','user@gmail.com',true,'78021293','995707476','user123','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1);
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Jose17','Apellido01 Apellido02','user@gmail.com',true,'78021293','995707476','user234','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,1);
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Walter','Reaños Arcilla','user@gmail.com',true,'78021293','995707476','user234','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,1);
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 4','Primero Segundo 4','user4@ecobesa.com',true,'19194','1616161','user4','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 5','Primero Segundo 5','user5@ecobesa.com',false,'19195','1616161','user5','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 6','Primero Segundo 6','user6@ecobesa.com',true,'19196','1616161','user6','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 7','Primero Segundo 7','user7@ecobesa.com',false,'19197','1616161','user7','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 8','Primero Segundo 8','user8@ecobesa.com',true,'19198','1616161','user8','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 9','Primero Segundo 9','user9@ecobesa.com',false,'19199','1616161','user9','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 10','Primero Segundo 10','user10@ecobesa.com',true,'191910','1616161','user10','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 11','Primero Segundo 11','user11@ecobesa.com',false,'191911','1616161','user11','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 12','Primero Segundo 12','user12@ecobesa.com',true,'191912','1616161','user12','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 13','Primero Segundo 13','user13@ecobesa.com',false,'191913','1616161','user13','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 14','Primero Segundo 14','user14@ecobesa.com',true,'191914','1616161','user14','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 15','Primero Segundo 15','user15@ecobesa.com',false,'191915','1616161','user15','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 16','Primero Segundo 16','user16@ecobesa.com',true,'191916','1616161','user16','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 17','Primero Segundo 17','user17@ecobesa.com',false,'191917','1616161','user17','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 18','Primero Segundo 18','user18@ecobesa.com',true,'191918','1616161','user18','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 19','Primero Segundo 19','user19@ecobesa.com',false,'191919','1616161','user19','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 20','Primero Segundo 20','user20@ecobesa.com',true,'191920','1616161','user20','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 21','Primero Segundo 21','user21@ecobesa.com',false,'191921','1616161','user21','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 22','Primero Segundo 22','user22@ecobesa.com',true,'191922','1616161','user22','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 23','Primero Segundo 23','user23@ecobesa.com',false,'191923','1616161','user23','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 24','Primero Segundo 24','user24@ecobesa.com',true,'191924','1616161','user24','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 25','Primero Segundo 25','user25@ecobesa.com',false,'191925','1616161','user25','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 26','Primero Segundo 26','user26@ecobesa.com',true,'191926','1616161','user26','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 27','Primero Segundo 27','user27@ecobesa.com',false,'191927','1616161','user27','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 28','Primero Segundo 28','user28@ecobesa.com',true,'191928','1616161','user28','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 29','Primero Segundo 29','user29@ecobesa.com',false,'191929','1616161','user29','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 30','Primero Segundo 30','user30@ecobesa.com',true,'191930','1616161','user30','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 31','Primero Segundo 31','user31@ecobesa.com',false,'191931','1616161','user31','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 32','Primero Segundo 32','user32@ecobesa.com',true,'191932','1616161','user32','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 33','Primero Segundo 33','user33@ecobesa.com',false,'191933','1616161','user33','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 34','Primero Segundo 34','user34@ecobesa.com',true,'191934','1616161','user34','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 35','Primero Segundo 35','user35@ecobesa.com',false,'191935','1616161','user35','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 36','Primero Segundo 36','user36@ecobesa.com',true,'191936','1616161','user36','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 37','Primero Segundo 37','user37@ecobesa.com',false,'191937','1616161','user37','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 38','Primero Segundo 38','user38@ecobesa.com',true,'191938','1616161','user38','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 39','Primero Segundo 39','user39@ecobesa.com',false,'191939','1616161','user39','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 40','Primero Segundo 40','user40@ecobesa.com',true,'191940','1616161','user40','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 41','Primero Segundo 41','user41@ecobesa.com',false,'191941','1616161','user41','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 42','Primero Segundo 42','user42@ecobesa.com',true,'191942','1616161','user42','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 43','Primero Segundo 43','user43@ecobesa.com',false,'191943','1616161','user43','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 44','Primero Segundo 44','user44@ecobesa.com',true,'191944','1616161','user44','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 45','Primero Segundo 45','user45@ecobesa.com',false,'191945','1616161','user45','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 46','Primero Segundo 46','user46@ecobesa.com',true,'191946','1616161','user46','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 47','Primero Segundo 47','user47@ecobesa.com',false,'191947','1616161','user47','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 48','Primero Segundo 48','user48@ecobesa.com',true,'191948','1616161','user48','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 49','Primero Segundo 49','user49@ecobesa.com',false,'191949','1616161','user49','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 50','Primero Segundo 50','user50@ecobesa.com',true,'191950','1616161','user50','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 51','Primero Segundo 51','user51@ecobesa.com',false,'191951','1616161','user51','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 52','Primero Segundo 52','user52@ecobesa.com',true,'191952','1616161','user52','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 53','Primero Segundo 53','user53@ecobesa.com',false,'191953','1616161','user53','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 54','Primero Segundo 54','user54@ecobesa.com',true,'191954','1616161','user54','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 55','Primero Segundo 55','user55@ecobesa.com',false,'191955','1616161','user55','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 56','Primero Segundo 56','user56@ecobesa.com',true,'191956','1616161','user56','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 57','Primero Segundo 57','user57@ecobesa.com',false,'191957','1616161','user57','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 58','Primero Segundo 58','user58@ecobesa.com',true,'191958','1616161','user58','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 59','Primero Segundo 59','user59@ecobesa.com',false,'191959','1616161','user59','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 60','Primero Segundo 60','user60@ecobesa.com',true,'191960','1616161','user60','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 61','Primero Segundo 61','user61@ecobesa.com',false,'191961','1616161','user61','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 62','Primero Segundo 62','user62@ecobesa.com',true,'191962','1616161','user62','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 63','Primero Segundo 63','user63@ecobesa.com',false,'191963','1616161','user63','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 64','Primero Segundo 64','user64@ecobesa.com',true,'191964','1616161','user64','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 65','Primero Segundo 65','user65@ecobesa.com',false,'191965','1616161','user65','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 66','Primero Segundo 66','user66@ecobesa.com',true,'191966','1616161','user66','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 67','Primero Segundo 67','user67@ecobesa.com',false,'191967','1616161','user67','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 68','Primero Segundo 68','user68@ecobesa.com',true,'191968','1616161','user68','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 69','Primero Segundo 69','user69@ecobesa.com',false,'191969','1616161','user69','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 70','Primero Segundo 70','user70@ecobesa.com',true,'191970','1616161','user70','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 71','Primero Segundo 71','user71@ecobesa.com',false,'191971','1616161','user71','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 72','Primero Segundo 72','user72@ecobesa.com',true,'191972','1616161','user72','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 73','Primero Segundo 73','user73@ecobesa.com',false,'191973','1616161','user73','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 74','Primero Segundo 74','user74@ecobesa.com',true,'191974','1616161','user74','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 75','Primero Segundo 75','user75@ecobesa.com',false,'191975','1616161','user75','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 76','Primero Segundo 76','user76@ecobesa.com',true,'191976','1616161','user76','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 77','Primero Segundo 77','user77@ecobesa.com',false,'191977','1616161','user77','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 78','Primero Segundo 78','user78@ecobesa.com',true,'191978','1616161','user78','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 79','Primero Segundo 79','user79@ecobesa.com',false,'191979','1616161','user79','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 80','Primero Segundo 80','user80@ecobesa.com',true,'191980','1616161','user80','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 81','Primero Segundo 81','user81@ecobesa.com',false,'191981','1616161','user81','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 82','Primero Segundo 82','user82@ecobesa.com',true,'191982','1616161','user82','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 83','Primero Segundo 83','user83@ecobesa.com',false,'191983','1616161','user83','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 84','Primero Segundo 84','user84@ecobesa.com',true,'191984','1616161','user84','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 85','Primero Segundo 85','user85@ecobesa.com',false,'191985','1616161','user85','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 86','Primero Segundo 86','user86@ecobesa.com',true,'191986','1616161','user86','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 87','Primero Segundo 87','user87@ecobesa.com',false,'191987','1616161','user87','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 88','Primero Segundo 88','user88@ecobesa.com',true,'191988','1616161','user88','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 89','Primero Segundo 89','user89@ecobesa.com',false,'191989','1616161','user89','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 90','Primero Segundo 90','user90@ecobesa.com',true,'191990','1616161','user90','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 91','Primero Segundo 91','user91@ecobesa.com',false,'191991','1616161','user91','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 92','Primero Segundo 92','user92@ecobesa.com',true,'191992','1616161','user92','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 93','Primero Segundo 93','user93@ecobesa.com',false,'191993','1616161','user93','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 94','Primero Segundo 94','user94@ecobesa.com',true,'191994','1616161','user94','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 95','Primero Segundo 95','user95@ecobesa.com',false,'191995','1616161','user95','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 96','Primero Segundo 96','user96@ecobesa.com',true,'191996','1616161','user96','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 97','Primero Segundo 97','user97@ecobesa.com',false,'191997','1616161','user97','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 98','Primero Segundo 98','user98@ecobesa.com',true,'191998','1616161','user98','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id) VALUES('Nombre 99','Primero Segundo 99','user99@ecobesa.com',false,'191999','1616161','user99','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3)


INSERT INTO programa_anuales(nombre,id_aprobado_id,id_revisado_id,id_elaborado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1,1,1);
INSERT INTO programa_anuales(nombre,id_aprobado_id,id_revisado_id,id_elaborado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1,1,1);
INSERT INTO programa_anuales(nombre,id_aprobado_id,id_revisado_id,id_elaborado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1,1,1);


INSERT INTO empresa(razon_social,actividad_economica,numero_trabajadores,ruc,foto,domicilio) VALUES('EMPRESA COMERCIALIZADORA DE BEBIDAS SOCIEDAD ANÓNIMA CERRADA','COMERCIALIZACIÓN DE BEBIDAS NO ALCOHÓLICAS',14010,'20557079441','de0bb7ee-8420-4b57-94b4-0becf43a87c7_Ecobesa.png','JR. CAJAMARCA 371 RIMAC , LIMA');

INSERT INTO objetivo_generales(nombre,meta,recursos,presupuesto_general,programa_anual_id) VALUES('CUMPLIR CON LA LEGISLACIÓN VIGENTE EN SEGURIDAD Y SALUD EN EL TRABAJO','100% de cumplimiento','Recursos humanos y procedimientos',25000,1)
INSERT INTO objetivo_generales(nombre,meta,recursos,presupuesto_general,programa_anual_id) VALUES('CUMPLIR CON LOS INDICADORES DE SEGURIDAD EN BASE A LA CANTIDAD DE ACCIDENTES E INCIDENTES DE TRABAJO','100% de cumplimiento','Recursos humanos y procedimientos',25000,1)
INSERT INTO objetivo_generales(nombre,meta,recursos,presupuesto_general,programa_anual_id) VALUES('ESTABLECER Y CUMPLIR CON EL PLAN DE RESPUESTA ANTE EMERGENCIA','100% de cumplimiento','Recursos humanos y procedimientos',25000,1)

INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Elaboración, aprobación, difusión e implementación de la documentación del Sistema de Gestión de Seguridad y Salud Ocupacional, de acuerdo a la legislación vigente.',1)
INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Actualización de los documentos del Sistema de Gestón de Seguridad y Salud Ocupacional.',1)
INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Cumplimiento con las actividades del Comité de Seguridad y Salud en el Trabajo - CSST, de acuerdo a la legislación vigente.',1)

INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Reducir la cantidad de accidentes con tiempo perdido (LTIR)',2)
INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Monitorear y disminuir el índice de severidad LTISR',2)
INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Monitorear y reducir la cantidad de incidentes con y sin tiempo perdido (TIR)',2)

INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Generar el conocimineto del "Procedimiento de Respuesta Ante Emergencia"',3)
INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Entrenar al personal para el uso de los equipos de emergencia',3)
INSERT INTO objetivo_especificos(nombre,objetivo_general_id) VALUES(' Asegurar el funcionamiento de los equipos de emergencia',3)


INSERT INTO actividades(nombre,objetivo_general_id,programa_actividad_id,responsable_user_id,tipo_actividad_id,fecha_inicio,frecuencia) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1,1,1,1,'4/01/2021','MENSUAL')
INSERT INTO actividades(nombre,objetivo_general_id,programa_actividad_id,responsable_user_id,tipo_actividad_id,fecha_inicio,frecuencia) VALUES('ELABORAR Y APROBAR EL PROGRAMA ANUAL DE CAPACITACIÓN DE SSO (PAC-SSO)',1,1,1,1,'06/02/2021','SEMESTRAL')





INSERT INTO sedes(nombre) VALUES('Amazonas')
INSERT INTO sedes(nombre) VALUES('Áncash')
INSERT INTO sedes(nombre) VALUES('Apurímac')
INSERT INTO sedes(nombre) VALUES('Arequipa')
INSERT INTO sedes(nombre) VALUES('Ayacucho')
INSERT INTO sedes(nombre) VALUES('Cajamarca')
INSERT INTO sedes(nombre) VALUES('Callao')
INSERT INTO sedes(nombre) VALUES('Chiclayo')

INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 1','Apellido 1',78787871,747474771,'peruano',true,'1999/04/04','1.jpg',true,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 2','Apellido 2',78787872,747474772,'peruano',false,'1999/04/04','2.jpg',false,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 3','Apellido 3',78787873,747474773,'argentino',true,'1999/04/05','3.jpg',false,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 4','Apellido 4',78787874,747474774,'chileno',false,'1999/04/04','4.jpg',true,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 5','Apellido 5',78787875,747474775,'venezolano',false,'1999/04/04',null,false,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 6','Apellido 6',78787876,747474776,'peruano',false,'1999/04/04',null,false,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 7','Apellido 7',78787877,747474777,'peruano',false,'1999/04/04',null,true,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 8','Apellido 8',78787878,747474778,'peruano',false,'1999/04/04',null,false,8)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 9','Apellido 9',78787879,747474779,'peruano',false,'1999/04/04',null,false,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 10','Apellido 10',78787810,747474710,'peruano',false,'1999/04/04',null,false,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 11','Apellido 11',78787811,747474711,'peruano',false,'1999/04/04',null,false,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 12','Apellido 12',78787411,747474711,'peruano',false,'1999/04/01',null,false,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 13','Apellido 13',78787413,747474713,'peruano',true,'1913/04/01',null,true,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 14','Apellido 14',78787414,747474714,'peruano',false,'1914/04/01',null,false,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 15','Apellido 15',78787415,747474715,'peruano',true,'1915/04/01',null,true,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 16','Apellido 16',78787416,747474716,'peruano',false,'1916/04/01',null,false,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 17','Apellido 17',78787417,747474717,'peruano',true,'1917/04/01',null,true,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 18','Apellido 18',78787418,747474718,'peruano',false,'1918/04/01',null,false,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 19','Apellido 19',78787419,747474719,'peruano',true,'1919/04/01',null,true,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 20','Apellido 20',78787420,747474720,'peruano',false,'1920/04/01',null,false,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 21','Apellido 21',78787421,747474721,'peruano',true,'1921/04/01',null,true,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 22','Apellido 22',78787422,747474722,'peruano',false,'1922/04/01',null,false,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 23','Apellido 23',78787423,747474723,'peruano',true,'1923/04/01',null,true,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 24','Apellido 24',78787424,747474724,'peruano',false,'1924/04/01',null,false,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 25','Apellido 25',78787425,747474725,'peruano',true,'1925/04/01',null,true,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 26','Apellido 26',78787426,747474726,'peruano',false,'1926/04/01',null,false,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 27','Apellido 27',78787427,747474727,'peruano',true,'1927/04/01',null,true,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 28','Apellido 28',78787428,747474728,'peruano',false,'1928/04/01',null,false,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 29','Apellido 29',78787429,747474729,'peruano',true,'1929/04/01',null,true,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 30','Apellido 30',78787430,747474730,'peruano',false,'1930/04/01',null,false,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 31','Apellido 31',78787431,747474731,'peruano',true,'1931/04/01',null,true,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 32','Apellido 32',78787432,747474732,'peruano',false,'1932/04/01',null,false,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 33','Apellido 33',78787433,747474733,'peruano',true,'1933/04/01',null,true,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 34','Apellido 34',78787434,747474734,'peruano',false,'1934/04/01',null,false,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 35','Apellido 35',78787435,747474735,'peruano',true,'1935/04/01',null,true,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 36','Apellido 36',78787436,747474736,'peruano',false,'1936/04/01',null,false,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 37','Apellido 37',78787437,747474737,'peruano',true,'1937/04/01',null,true,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 38','Apellido 38',78787438,747474738,'peruano',false,'1938/04/01',null,false,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 39','Apellido 39',78787439,747474739,'peruano',true,'1939/04/01',null,true,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 40','Apellido 40',78787440,747474740,'peruano',false,'1940/04/01',null,false,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 41','Apellido 41',78787441,747474741,'peruano',true,'1941/04/01',null,true,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 42','Apellido 42',78787442,747474742,'peruano',false,'1942/04/01',null,false,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 43','Apellido 43',78787443,747474743,'peruano',true,'1943/04/01',null,true,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 44','Apellido 44',78787444,747474744,'peruano',false,'1944/04/01',null,false,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 45','Apellido 45',78787445,747474745,'peruano',true,'1945/04/01',null,true,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 46','Apellido 46',78787446,747474746,'peruano',false,'1946/04/01',null,false,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 47','Apellido 47',78787447,747474747,'peruano',true,'1947/04/01',null,true,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 48','Apellido 48',78787448,747474748,'peruano',false,'1948/04/01',null,false,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 49','Apellido 49',78787449,747474749,'peruano',true,'1949/04/01',null,true,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 50','Apellido 50',78787450,747474750,'peruano',false,'1950/04/01',null,false,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 51','Apellido 51',78787451,747474751,'peruano',true,'1951/04/01',null,true,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 52','Apellido 52',78787452,747474752,'peruano',false,'1952/04/01',null,false,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 53','Apellido 53',78787453,747474753,'peruano',true,'1953/04/01',null,true,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 54','Apellido 54',78787454,747474754,'peruano',false,'1954/04/01',null,false,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 55','Apellido 55',78787455,747474755,'peruano',true,'1955/04/01',null,true,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 56','Apellido 56',78787456,747474756,'peruano',false,'1956/04/01',null,false,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 57','Apellido 57',78787457,747474757,'peruano',true,'1957/04/01',null,true,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 58','Apellido 58',78787458,747474758,'peruano',false,'1958/04/01',null,false,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 59','Apellido 59',78787459,747474759,'peruano',true,'1959/04/01',null,true,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 60','Apellido 60',78787460,747474760,'peruano',false,'1960/04/01',null,false,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 61','Apellido 61',78787461,747474761,'peruano',true,'1961/04/01',null,true,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 62','Apellido 62',78787462,747474762,'peruano',false,'1962/04/01',null,false,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 63','Apellido 63',78787463,747474763,'peruano',true,'1963/04/01',null,true,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 64','Apellido 64',78787464,747474764,'peruano',false,'1964/04/01',null,false,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 65','Apellido 65',78787465,747474765,'peruano',true,'1965/04/01',null,true,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 66','Apellido 66',78787466,747474766,'peruano',false,'1966/04/01',null,false,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 67','Apellido 67',78787467,747474767,'peruano',true,'1967/04/01',null,true,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 68','Apellido 68',78787468,747474768,'peruano',false,'1968/04/01',null,false,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 69','Apellido 69',78787469,747474769,'peruano',true,'1969/04/01',null,true,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 70','Apellido 70',78787470,747474770,'peruano',false,'1970/04/01',null,false,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 71','Apellido 71',78787471,747474771,'peruano',true,'1971/04/01',null,true,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 72','Apellido 72',78787472,747474772,'peruano',false,'1972/04/01',null,false,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 73','Apellido 73',78787473,747474773,'peruano',true,'1973/04/01',null,true,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 74','Apellido 74',78787474,747474774,'peruano',false,'1974/04/01',null,false,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 75','Apellido 75',78787475,747474775,'peruano',true,'1975/04/01',null,true,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 76','Apellido 76',78787476,747474776,'peruano',false,'1976/04/01',null,false,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 77','Apellido 77',78787477,747474777,'peruano',true,'1977/04/01',null,true,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 78','Apellido 78',78787478,747474778,'peruano',false,'1978/04/01',null,false,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 79','Apellido 79',78787479,747474779,'peruano',true,'1979/04/01',null,true,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 80','Apellido 80',78787480,747474780,'peruano',false,'1980/04/01',null,false,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 81','Apellido 81',78787481,747474781,'peruano',true,'1981/04/01',null,true,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 82','Apellido 82',78787482,747474782,'peruano',false,'1982/04/01',null,false,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 83','Apellido 83',78787483,747474783,'peruano',true,'1983/04/01',null,true,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 84','Apellido 84',78787484,747474784,'peruano',false,'1984/04/01',null,false,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 85','Apellido 85',78787485,747474785,'peruano',true,'1985/04/01',null,true,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 86','Apellido 86',78787486,747474786,'peruano',false,'1986/04/01',null,false,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 87','Apellido 87',78787487,747474787,'peruano',true,'1987/04/01',null,true,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 88','Apellido 88',78787488,747474788,'peruano',false,'1988/04/01',null,false,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 89','Apellido 89',78787489,747474789,'peruano',true,'1989/04/01',null,true,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 90','Apellido 90',78787490,747474790,'peruano',false,'1990/04/01',null,false,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 91','Apellido 91',78787491,747474791,'peruano',true,'1991/04/01',null,true,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 92','Apellido 92',78787492,747474792,'peruano',false,'1992/04/01',null,false,3)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 93','Apellido 93',78787493,747474793,'peruano',true,'1993/04/01',null,true,4)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 94','Apellido 94',78787494,747474794,'peruano',false,'1994/04/01',null,false,5)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 95','Apellido 95',78787495,747474795,'peruano',true,'1995/04/01',null,true,6)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 96','Apellido 96',78787496,747474796,'peruano',false,'1996/04/01','4.jpg',false,7)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 97','Apellido 97',78787497,747474797,'peruano',true,'1997/04/01','3.jpg',true,1)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 98','Apellido 98',78787498,747474798,'peruano',false,'1998/04/01','2.jpg',false,2)
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id) VALUES('Empleado 99','Apellido 99',78787499,747474799,'peruano',true,'1999/04/01','1.jpg',true,3)










