INSERT INTO frecuencia(nombre) VALUES('ANUAL');
INSERT INTO frecuencia(nombre) VALUES('DIARIO');
INSERT INTO frecuencia(nombre) VALUES('SEMANAL');
INSERT INTO frecuencia(nombre) VALUES('QUINCENAl');
INSERT INTO frecuencia(nombre) VALUES('SEMESTRAL');
INSERT INTO frecuencia(nombre) VALUES('MENSUAL');
INSERT INTO frecuencia(nombre) VALUES('PERMANENTE');
INSERT INTO frecuencia(nombre) VALUES('PERSONALIZADO');

INSERT INTO sedes(nombre,estado) VALUES('Amazonas',true)
INSERT INTO sedes(nombre,estado) VALUES('Áncash',true)
INSERT INTO sedes(nombre,estado) VALUES('Apurímac',true)
INSERT INTO sedes(nombre,estado) VALUES('Arequipa',true)
INSERT INTO sedes(nombre,estado) VALUES('Ayacucho',true)
INSERT INTO sedes(nombre,estado) VALUES('Cajamarca',true)
INSERT INTO sedes(nombre,estado) VALUES('Callao',true)
INSERT INTO sedes(nombre,estado) VALUES('Chiclayo',true)


INSERT INTO areas(nombre,sede_id,status) VALUES('Produccion',1,true);
INSERT INTO areas(nombre,sede_id,status) VALUES('SSO',1,true);
INSERT INTO areas(nombre,sede_id,status) VALUES('Almacenamiento',1,true);
INSERT INTO areas(nombre,sede_id,status) VALUES('Distribucion',1,true);
INSERT INTO areas(nombre,sede_id,status) VALUES('Ventas',1,true);




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

INSERT INTO cargos(nombre,estado) VALUES('Gerente',true);
INSERT INTO cargos(nombre,estado) VALUES('Administrador',true);
INSERT INTO cargos(nombre,estado) VALUES('Secretario',true);

INSERT INTO roles(authority) VALUES('ROLE_ADMIN')
INSERT INTO roles(authority) VALUES('ROLE_USER')
INSERT INTO roles(authority) VALUES('ROLE_NIVEL3')

INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Hector17','Apellido01 Apellido02','user@gmail.com',true,'78021293','995707476','user123','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,1);
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Jose17','Apellido01 Apellido02','user@gmail.com',true,'78021293','995707476','user234','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,1);
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Walter','Reaños Arcilla','user@gmail.com',true,'78021293','995707476','user234','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,1,1);
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 4','Primero Segundo 4','user4@ecobesa.com',true,'19194','1616161','user4','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 5','Primero Segundo 5','user5@ecobesa.com',false,'19195','1616161','user5','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 6','Primero Segundo 6','user6@ecobesa.com',true,'19196','1616161','user6','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,4)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 7','Primero Segundo 7','user7@ecobesa.com',false,'19197','1616161','user7','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,5)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 8','Primero Segundo 8','user8@ecobesa.com',true,'19198','1616161','user8','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,6)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 9','Primero Segundo 9','user9@ecobesa.com',false,'19199','1616161','user9','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,7)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 10','Primero Segundo 10','user10@ecobesa.com',true,'191910','1616161','user10','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,8)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 11','Primero Segundo 11','user11@ecobesa.com',false,'191911','1616161','user11','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 12','Primero Segundo 12','user12@ecobesa.com',true,'191912','1616161','user12','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 13','Primero Segundo 13','user13@ecobesa.com',false,'191913','1616161','user13','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 14','Primero Segundo 14','user14@ecobesa.com',true,'191914','1616161','user14','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 15','Primero Segundo 15','user15@ecobesa.com',false,'191915','1616161','user15','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,4)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 16','Primero Segundo 16','user16@ecobesa.com',true,'191916','1616161','user16','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,5)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 17','Primero Segundo 17','user17@ecobesa.com',false,'191917','1616161','user17','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,6)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 18','Primero Segundo 18','user18@ecobesa.com',true,'191918','1616161','user18','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,7)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 19','Primero Segundo 19','user19@ecobesa.com',false,'191919','1616161','user19','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,8)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 20','Primero Segundo 20','user20@ecobesa.com',true,'191920','1616161','user20','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 21','Primero Segundo 21','user21@ecobesa.com',false,'191921','1616161','user21','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 22','Primero Segundo 22','user22@ecobesa.com',true,'191922','1616161','user22','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 23','Primero Segundo 23','user23@ecobesa.com',false,'191923','1616161','user23','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,4)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 24','Primero Segundo 24','user24@ecobesa.com',true,'191924','1616161','user24','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,5)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 25','Primero Segundo 25','user25@ecobesa.com',false,'191925','1616161','user25','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,6)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 26','Primero Segundo 26','user26@ecobesa.com',true,'191926','1616161','user26','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,7)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 27','Primero Segundo 27','user27@ecobesa.com',false,'191927','1616161','user27','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,8)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 28','Primero Segundo 28','user28@ecobesa.com',true,'191928','1616161','user28','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 29','Primero Segundo 29','user29@ecobesa.com',false,'191929','1616161','user29','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 30','Primero Segundo 30','user30@ecobesa.com',true,'191930','1616161','user30','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 31','Primero Segundo 31','user31@ecobesa.com',false,'191931','1616161','user31','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,4)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 32','Primero Segundo 32','user32@ecobesa.com',true,'191932','1616161','user32','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,5)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 33','Primero Segundo 33','user33@ecobesa.com',false,'191933','1616161','user33','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,6)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 34','Primero Segundo 34','user34@ecobesa.com',true,'191934','1616161','user34','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,7)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 35','Primero Segundo 35','user35@ecobesa.com',false,'191935','1616161','user35','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,8)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 36','Primero Segundo 36','user36@ecobesa.com',true,'191936','1616161','user36','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 37','Primero Segundo 37','user37@ecobesa.com',false,'191937','1616161','user37','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 38','Primero Segundo 38','user38@ecobesa.com',true,'191938','1616161','user38','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 39','Primero Segundo 39','user39@ecobesa.com',false,'191939','1616161','user39','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,4)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 40','Primero Segundo 40','user40@ecobesa.com',true,'191940','1616161','user40','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,5)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 41','Primero Segundo 41','user41@ecobesa.com',false,'191941','1616161','user41','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,6)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 42','Primero Segundo 42','user42@ecobesa.com',true,'191942','1616161','user42','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,7)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 43','Primero Segundo 43','user43@ecobesa.com',false,'191943','1616161','user43','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,8)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 44','Primero Segundo 44','user44@ecobesa.com',true,'191944','1616161','user44','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,1)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 45','Primero Segundo 45','user45@ecobesa.com',false,'191945','1616161','user45','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,2)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 46','Primero Segundo 46','user46@ecobesa.com',true,'191946','1616161','user46','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,3)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 47','Primero Segundo 47','user47@ecobesa.com',false,'191947','1616161','user47','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,4)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 48','Primero Segundo 48','user48@ecobesa.com',true,'191948','1616161','user48','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,5)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 49','Primero Segundo 49','user49@ecobesa.com',false,'191949','1616161','user49','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,6)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 50','Primero Segundo 50','user50@ecobesa.com',true,'191950','1616161','user50','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',2,2,7)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 51','Primero Segundo 51','user51@ecobesa.com',false,'191951','1616161','user51','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',3,3,8)
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,role_id,cargo_id,sede_id) VALUES('Nombre 52','Primero Segundo 52','user52@ecobesa.com',true,'191952','1616161','user52','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1,1,1)




INSERT INTO programa_anuales(nombre,id_aprobado_id,id_revisado_id,id_elaborado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1,1,1);
INSERT INTO programa_anuales(nombre,id_aprobado_id,id_revisado_id,id_elaborado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1,1,1);
INSERT INTO programa_anuales(nombre,id_aprobado_id,id_revisado_id,id_elaborado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1,1,1);


INSERT INTO empresa(razon_social,actividad_economica,numero_trabajadores,ruc,foto,domicilio,pantalla_inicio) VALUES('EMPRESA COMERCIALIZADORA DE BEBIDAS SOCIEDAD ANÓNIMA CERRADA','COMERCIALIZACIÓN DE BEBIDAS NO ALCOHÓLICAS',14010,'20557079441','111cb499-dbde-4ce6-a1f8-8592ae3b0b79_foto123.jpeg','JR. CAJAMARCA 371 RIMAC , LIMA','banner_login02.jpg');

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






INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 1','Apellido 1',78787871,747474771,'peruano',true,'1999/04/04','1.jpg',true,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 2','Apellido 2',78787872,747474772,'peruano',false,'1999/04/04','2.jpg',false,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 3','Apellido 3',78787873,747474773,'argentino',true,'1999/04/05','3.jpg',false,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 4','Apellido 4',78787874,747474774,'chileno',false,'1999/04/04','4.jpg',true,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 5','Apellido 5',78787875,747474775,'venezolano',false,'1999/04/04',null,false,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 6','Apellido 6',78787876,747474776,'peruano',false,'1999/04/04',null,false,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 7','Apellido 7',78787877,747474777,'peruano',false,'1999/04/04',null,true,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 8','Apellido 8',78787878,747474778,'peruano',false,'1999/04/04',null,false,8,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 9','Apellido 9',78787879,747474779,'peruano',false,'1999/04/04',null,false,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 10','Apellido 10',78787810,747474710,'peruano',false,'1999/04/04',null,false,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 11','Apellido 11',78787811,747474711,'peruano',false,'1999/04/04',null,false,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 12','Apellido 12',78787411,747474711,'peruano',false,'1999/04/01',null,false,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 13','Apellido 13',78787413,747474713,'peruano',true,'1913/04/01',null,true,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 14','Apellido 14',78787414,747474714,'peruano',false,'1914/04/01',null,false,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 15','Apellido 15',78787415,747474715,'peruano',true,'1915/04/01',null,true,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 16','Apellido 16',78787416,747474716,'peruano',false,'1916/04/01',null,false,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 17','Apellido 17',78787417,747474717,'peruano',true,'1917/04/01',null,true,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 18','Apellido 18',78787418,747474718,'peruano',false,'1918/04/01',null,false,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 19','Apellido 19',78787419,747474719,'peruano',true,'1919/04/01',null,true,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 20','Apellido 20',78787420,747474720,'peruano',false,'1920/04/01',null,false,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 21','Apellido 21',78787421,747474721,'peruano',true,'1921/04/01',null,true,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 22','Apellido 22',78787422,747474722,'peruano',false,'1922/04/01',null,false,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 23','Apellido 23',78787423,747474723,'peruano',true,'1923/04/01',null,true,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 24','Apellido 24',78787424,747474724,'peruano',false,'1924/04/01',null,false,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 25','Apellido 25',78787425,747474725,'peruano',true,'1925/04/01',null,true,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 26','Apellido 26',78787426,747474726,'peruano',false,'1926/04/01',null,false,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 27','Apellido 27',78787427,747474727,'peruano',true,'1927/04/01',null,true,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 28','Apellido 28',78787428,747474728,'peruano',false,'1928/04/01',null,false,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 29','Apellido 29',78787429,747474729,'peruano',true,'1929/04/01',null,true,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 30','Apellido 30',78787430,747474730,'peruano',false,'1930/04/01',null,false,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 31','Apellido 31',78787431,747474731,'peruano',true,'1931/04/01',null,true,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 32','Apellido 32',78787432,747474732,'peruano',false,'1932/04/01',null,false,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 33','Apellido 33',78787433,747474733,'peruano',true,'1933/04/01',null,true,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 34','Apellido 34',78787434,747474734,'peruano',false,'1934/04/01',null,false,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 35','Apellido 35',78787435,747474735,'peruano',true,'1935/04/01',null,true,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 36','Apellido 36',78787436,747474736,'peruano',false,'1936/04/01',null,false,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 37','Apellido 37',78787437,747474737,'peruano',true,'1937/04/01',null,true,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 38','Apellido 38',78787438,747474738,'peruano',false,'1938/04/01',null,false,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 39','Apellido 39',78787439,747474739,'peruano',true,'1939/04/01',null,true,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 40','Apellido 40',78787440,747474740,'peruano',false,'1940/04/01',null,false,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 41','Apellido 41',78787441,747474741,'peruano',true,'1941/04/01',null,true,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 42','Apellido 42',78787442,747474742,'peruano',false,'1942/04/01',null,false,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 43','Apellido 43',78787443,747474743,'peruano',true,'1943/04/01',null,true,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 44','Apellido 44',78787444,747474744,'peruano',false,'1944/04/01',null,false,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 45','Apellido 45',78787445,747474745,'peruano',true,'1945/04/01',null,true,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 46','Apellido 46',78787446,747474746,'peruano',false,'1946/04/01',null,false,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 47','Apellido 47',78787447,747474747,'peruano',true,'1947/04/01',null,true,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 48','Apellido 48',78787448,747474748,'peruano',false,'1948/04/01',null,false,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 49','Apellido 49',78787449,747474749,'peruano',true,'1949/04/01',null,true,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 50','Apellido 50',78787450,747474750,'peruano',false,'1950/04/01',null,false,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 51','Apellido 51',78787451,747474751,'peruano',true,'1951/04/01',null,true,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 52','Apellido 52',78787452,747474752,'peruano',false,'1952/04/01',null,false,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 53','Apellido 53',78787453,747474753,'peruano',true,'1953/04/01',null,true,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 54','Apellido 54',78787454,747474754,'peruano',false,'1954/04/01',null,false,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 55','Apellido 55',78787455,747474755,'peruano',true,'1955/04/01',null,true,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 56','Apellido 56',78787456,747474756,'peruano',false,'1956/04/01',null,false,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 57','Apellido 57',78787457,747474757,'peruano',true,'1957/04/01',null,true,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 58','Apellido 58',78787458,747474758,'peruano',false,'1958/04/01',null,false,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 59','Apellido 59',78787459,747474759,'peruano',true,'1959/04/01',null,true,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 60','Apellido 60',78787460,747474760,'peruano',false,'1960/04/01',null,false,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 61','Apellido 61',78787461,747474761,'peruano',true,'1961/04/01',null,true,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 62','Apellido 62',78787462,747474762,'peruano',false,'1962/04/01',null,false,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 63','Apellido 63',78787463,747474763,'peruano',true,'1963/04/01',null,true,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 64','Apellido 64',78787464,747474764,'peruano',false,'1964/04/01',null,false,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 65','Apellido 65',78787465,747474765,'peruano',true,'1965/04/01',null,true,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 66','Apellido 66',78787466,747474766,'peruano',false,'1966/04/01',null,false,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 67','Apellido 67',78787467,747474767,'peruano',true,'1967/04/01',null,true,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 68','Apellido 68',78787468,747474768,'peruano',false,'1968/04/01',null,false,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 69','Apellido 69',78787469,747474769,'peruano',true,'1969/04/01',null,true,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 70','Apellido 70',78787470,747474770,'peruano',false,'1970/04/01',null,false,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 71','Apellido 71',78787471,747474771,'peruano',true,'1971/04/01',null,true,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 72','Apellido 72',78787472,747474772,'peruano',false,'1972/04/01',null,false,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 73','Apellido 73',78787473,747474773,'peruano',true,'1973/04/01',null,true,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 74','Apellido 74',78787474,747474774,'peruano',false,'1974/04/01',null,false,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 75','Apellido 75',78787475,747474775,'peruano',true,'1975/04/01',null,true,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 76','Apellido 76',78787476,747474776,'peruano',false,'1976/04/01',null,false,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 77','Apellido 77',78787477,747474777,'peruano',true,'1977/04/01',null,true,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 78','Apellido 78',78787478,747474778,'peruano',false,'1978/04/01',null,false,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 79','Apellido 79',78787479,747474779,'peruano',true,'1979/04/01',null,true,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 80','Apellido 80',78787480,747474780,'peruano',false,'1980/04/01',null,false,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 81','Apellido 81',78787481,747474781,'peruano',true,'1981/04/01',null,true,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 82','Apellido 82',78787482,747474782,'peruano',false,'1982/04/01',null,false,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 83','Apellido 83',78787483,747474783,'peruano',true,'1983/04/01',null,true,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 84','Apellido 84',78787484,747474784,'peruano',false,'1984/04/01',null,false,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 85','Apellido 85',78787485,747474785,'peruano',true,'1985/04/01',null,true,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 86','Apellido 86',78787486,747474786,'peruano',false,'1986/04/01',null,false,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 87','Apellido 87',78787487,747474787,'peruano',true,'1987/04/01',null,true,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 88','Apellido 88',78787488,747474788,'peruano',false,'1988/04/01',null,false,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 89','Apellido 89',78787489,747474789,'peruano',true,'1989/04/01',null,true,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 90','Apellido 90',78787490,747474790,'peruano',false,'1990/04/01',null,false,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 91','Apellido 91',78787491,747474791,'peruano',true,'1991/04/01',null,true,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 92','Apellido 92',78787492,747474792,'peruano',false,'1992/04/01',null,false,3,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 93','Apellido 93',78787493,747474793,'peruano',true,'1993/04/01',null,true,4,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 94','Apellido 94',78787494,747474794,'peruano',false,'1994/04/01',null,false,5,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 95','Apellido 95',78787495,747474795,'peruano',true,'1995/04/01',null,true,6,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 96','Apellido 96',78787496,747474796,'peruano',false,'1996/04/01','4.jpg',false,7,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 97','Apellido 97',78787497,747474797,'peruano',true,'1997/04/01','3.jpg',true,1,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 98','Apellido 98',78787498,747474798,'peruano',false,'1998/04/01','2.jpg',false,2,'2000/04/04','Calle Merisco 123')
INSERT INTO empleados(nombres,apellidos,dni,telefono,nacionalidad,sexo,fecha_nacimiento,foto,estado,sede_id,fecha_ingreso,direccion) VALUES('Empleado 99','Apellido 99',78787499,747474799,'peruano',true,'1999/04/01','1.jpg',true,3,'2000/04/04','Calle Merisco 123')






INSERT INTO actividades(fecha_inicio,frecuencia,nombre,objetivo_general_id,programa_actividad_id,responsable_user_id,tipo_actividad_id) VALUES('01/01/2021','ANUAL','APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1,3,1,1);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/02/01',1);

INSERT INTO actividades(fecha_inicio,frecuencia,nombre,objetivo_general_id,programa_actividad_id,responsable_user_id,tipo_actividad_id) VALUES('01/01/2021','ANUAL','ELABORAR Y APROBAR EL PROGRAMA ANUAL DE CAPACITACIÓN DE SSO (PAC-SSO)',1,3,1,1);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(true,'2021/02/01',2);


INSERT INTO actividades(fecha_inicio,frecuencia,nombre,objetivo_general_id,programa_actividad_id,responsable_user_id,tipo_actividad_id) VALUES('01/02/2021','ANUAL','ELABORAR Y APROBAR EL PROGRAMA ANUAL DE INSPECCIÓN DE SST',1,3,1,1);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(true,'2021/02/01',3);


INSERT INTO actividades(fecha_inicio,frecuencia,nombre,objetivo_general_id,programa_actividad_id,responsable_user_id,tipo_actividad_id) VALUES('01/01/2021','MENSUAL','REUNIÓN MENSUAL DEL CSST Y EL CONTROL DE LOS ACUERDOS DEL LIBRO DE ACTAS',1,3,1,1);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(true,'2021/01/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(true,'2021/02/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(true,'2021/03/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(true,'2021/04/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/05/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/06/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/07/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/08/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/09/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/10/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/11/01',4);
INSERT INTO fechas(estado,fecha,actividad_id) VALUES(false,'2021/12/01',4);	

INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(1,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(2,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(3,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(4,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(5,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(6,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(7,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(8,1,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(9,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(10,1,false,false);

INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(11,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(12,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(13,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(14,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(15,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(16,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(17,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(18,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(19,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(20,1,false,false);

INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(21,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(22,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(23,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(24,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(25,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(26,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(27,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(28,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(29,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(30,1,false,false);

INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(31,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(32,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(33,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(34,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(35,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(36,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(37,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(38,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(39,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(40,1,false,false);

INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(41,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(42,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(43,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(44,1,false,false);

INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(45,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(46,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(47,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(48,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(49,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(50,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(51,1,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(52,1,false,false);


INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(1,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(2,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(3,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(4,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(5,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(6,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(7,2,true,true);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(8,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(9,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(10,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(11,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(12,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(13,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(14,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(15,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(16,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(17,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(18,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(19,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(20,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(21,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(22,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(23,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(24,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(25,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(26,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(27,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(28,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(29,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(30,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(31,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(32,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(33,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(34,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(35,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(36,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(37,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(38,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(39,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(40,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(41,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(42,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(43,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(44,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(45,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(46,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(47,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(48,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(49,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(50,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(51,2,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(52,2,false,false);

INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(1,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(2,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(3,3,true,true);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(4,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(5,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(6,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(7,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(8,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(9,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(10,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(11,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(12,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(13,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(14,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(15,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(16,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(17,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(18,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(19,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(20,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(21,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(22,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(23,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(24,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(25,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(26,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(27,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(28,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(29,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(30,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(31,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(32,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(33,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(34,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(35,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(36,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(37,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(38,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(39,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(40,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(41,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(42,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(43,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(44,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(45,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(46,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(47,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(48,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(49,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(50,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(51,3,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(52,3,false,false);

INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(1,4,true,true);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(2,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(3,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(4,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(5,4,true,true);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(6,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(7,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(8,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(9,4,true,true);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(10,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(11,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(12,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(13,4,true,true);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(14,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(15,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(16,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(17,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(18,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(19,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(20,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(21,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(22,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(23,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(24,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(25,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(26,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(27,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(28,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(29,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(30,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(31,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(32,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(33,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(34,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(35,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(36,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(37,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(38,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(39,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(40,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(41,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(42,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(43,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(44,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(45,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(46,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(47,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(48,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(49,4,true,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(50,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(51,4,false,false);
INSERT INTO actividad_semanas(numero_semana,actividad_id,asignado,realizado) VALUES(52,4,false,false);



INSERT INTO actividad_users(user_id,actividad_id) VALUES(1,1)
INSERT INTO actividad_users(user_id,actividad_id) VALUES(2,1)
INSERT INTO actividad_users(user_id,actividad_id) VALUES(3,1)

INSERT INTO actividad_users(user_id,actividad_id) VALUES(1,2)
INSERT INTO actividad_users(user_id,actividad_id) VALUES(2,2)
INSERT INTO actividad_users(user_id,actividad_id) VALUES(3,2)

INSERT INTO actividad_users(user_id,actividad_id) VALUES(1,3)
INSERT INTO actividad_users(user_id,actividad_id) VALUES(2,3)
INSERT INTO actividad_users(user_id,actividad_id) VALUES(3,3)

INSERT INTO actividad_users(user_id,actividad_id) VALUES(1,4)
INSERT INTO actividad_users(user_id,actividad_id) VALUES(2,4)
INSERT INTO actividad_users(user_id,actividad_id) VALUES(3,4)


INSERT INTO lineamientos(nombre) VALUES('principios');
INSERT INTO lineamientos(nombre) VALUES('politica');
INSERT INTO lineamientos(nombre) VALUES('direccion');
INSERT INTO lineamientos(nombre) VALUES('liderazgo');
INSERT INTO lineamientos(nombre) VALUES('organizacion');
INSERT INTO lineamientos(nombre) VALUES('competencia');
INSERT INTO lineamientos(nombre) VALUES('diagnostico');
INSERT INTO lineamientos(nombre) VALUES('Planeamiento para la identificación de peligros, evaluación y control de riesgos');
INSERT INTO lineamientos(nombre) VALUES('Objetivos');
INSERT INTO lineamientos(nombre) VALUES('Programa de seguridad y salud en el trabajo');
INSERT INTO lineamientos(nombre) VALUES('Estructura y responsabilidades');
INSERT INTO lineamientos(nombre) VALUES('Capacitación');
INSERT INTO lineamientos(nombre) VALUES('Medidas de prevención');
INSERT INTO lineamientos(nombre) VALUES('Preparación y respuestas ante emergencias');
INSERT INTO lineamientos(nombre) VALUES('Contratistas, Subcontratistas, empresa, entidad pública o privada, de servicios y cooperativas');
INSERT INTO lineamientos(nombre) VALUES('Consulta y comunicación');
INSERT INTO lineamientos(nombre) VALUES('Requisitos legales y de otro tipo');
INSERT INTO lineamientos(nombre) VALUES('Supervisión, monitoreo y seguimiento de desempeño');
INSERT INTO lineamientos(nombre) VALUES('Salud en el trabajo');
INSERT INTO lineamientos(nombre) VALUES('Accidentes, incidentes peligrosos e incidentes, no conformidad, acción correctiva y preventiva');
INSERT INTO lineamientos(nombre) VALUES('Investigación de accidentes y enfermedades ocupacionales');
INSERT INTO lineamientos(nombre) VALUES('Control de las operaciones');
INSERT INTO lineamientos(nombre) VALUES('Gestión del cambio');
INSERT INTO lineamientos(nombre) VALUES('Auditorias');
INSERT INTO lineamientos(nombre) VALUES('Documentos');
INSERT INTO lineamientos(nombre) VALUES('Control de la documentación y de los datos');
INSERT INTO lineamientos(nombre) VALUES('Gestión de los registros');
INSERT INTO lineamientos(nombre) VALUES('Gestión de la mejora continua');



INSERT INTO linea_bases(nombre) VALUES('LISTA DE VERIFICACIÓN DE LINEAMIENTOS DEL SISTEMA DE GESTIÓN DE SEGURIDAD Y SALUD EN EL TRABAJO');
INSERT INTO linea_bases(nombre) VALUES('LISTA DE VERIFICACIÓN DE LINEAMIENTOS DEL SSGT');


INSERT INTO rango_ley(nombre) VALUES('Decreto Supremo');
INSERT INTO rango_ley(nombre) VALUES('Ley');
INSERT INTO rango_ley(nombre) VALUES('Resolucion Ministerial');

INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/01/07','14:00:00',true);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/01/11','13:00:59',true);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/01/12','13:00:59',true);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/01/14','13:00:59',true);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/02/16','13:00:59',true);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/02/19','13:00:59',false);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/02/25','13:00:59',false);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/02/25','13:00:59',false);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/02/01','13:00:59',false);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/03/10','13:00:59',false);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/03/01','13:00:59',false);
INSERT INTO planner_safety(titulo,fecha,hora,estado) VALUES('Capacitacion de ergonommia.Josaft La Rosa.Oficina de Ventas','2021/03/10','13:00:59',false);


INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('FISICO','FIS',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('QUÍMICO','QUI',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('BIOLÓGICO','BIO',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('ERGONOMICO','ERG',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('MECANICO','MEC',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('ELECTRICO','ELE',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('LOCATIVO','FEX',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('PSICOSOCIAL','PSC',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('PSICOLABORAL','PSI',1);
INSERT INTO tipo_riesgos(nombre,codigo,empresa) VALUES('OTRO','OTR',1);

INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Sustancias Químicas, Vapores, Compuestos o productos químicos en general','',2);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Polvo (Material Particulado)','',2);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Humos Metalicos','',2);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Gases y Vapores','',2);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Neblinas','',2);

INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Movimientos Repetitivos','',4);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Espacio Inadecuado de Trabajo','',4);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Iluminación Inadecuada','',4);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Sobreesfuerzo','',4);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Postura Inadecuada','',4);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Carga Estatica (Trabajo de pie, sentado y posturas invariantes)','',4);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Manipulacion manual de carga inadecuada','',4);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Diseño puesto de trabajo ( altura de plano de trabajo, ubicación de controles, equipos)','',4);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Uso en tiempo prolongados de pantalla de visualizacion - PC','',4);

INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Agentes Biológicos','',3);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Animales / Insectos','',3);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Virus','',3);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Bacterias','',3);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Hongos','',3);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Parasitos','',3);

INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Contenido de la tarea (Monotonia, Repetitividad)','',9);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Relaciones Humanas(Jefes, colegas, subordinados)','',9);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Organización del tiempo de trabajo (Ritmo, Pausas, Turnos)','',9);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Gestion de personal (Induccion, Capacitacion, Evaluacion y desempeño)','',9);

INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Ruido','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Vibraciones','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Radiaciones No Ionizantes','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Frío','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Corrientes de aire','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Ventilación','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Humedad','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Presión Atmosférica','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Radiaciones Ionizantes','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Rayos UV','',1);

INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Carga en Movimiento','',1);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Manipulación de Herramientas/objetos','',5);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Fluidos a Presión, Equipo Presurizado','',5);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Objetos/Equipos','',5);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Partículas en Proyección','',5);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Sistemas de transmision en movimiento','',5);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Recipientes a Presion','',5);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Puntos Ciegos de montacarguistas','',5);

INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Material Inflamable','',7);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Material Inflamable; Fluidos a Presión, Equipo Presurizado','',7);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Vidrios, objetos punzocortantes','',7);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Superficie de trabajo defectuosas ','',7);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Escaleras, plataformas, anadamios','',7);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Apilamiento de materiales','',7);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Transito por debajo de estructura de baja altura','',7);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Señalizacion de transito peatonal','',7);

INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Energía Eléctrica','',6);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Electricidad Directa','',6);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Electricidad Indirecta','',6);
INSERT INTO tipo_riesgo_child(nombre,simbologia,tipo_riesgo) VALUES('Electricidad Estatica','',6);



INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image2.png',2,4,'BAJO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(2,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image3.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image4.png',2,4,'ALTO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image5.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image7.png',2,4,'BAJO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'ALTO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(2,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(3,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(4,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(5,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'BAJO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',1);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',2);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',2);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',2);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'ALTO',2);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',2);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(2,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',2);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(3,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',2);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(4,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',3);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'BAJO',3);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',3);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(2,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',3);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(1,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',3);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(4,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',3);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(5,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',3);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(5,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',3);
INSERT INTO riesgos(tipo_riesgo_id,peligro,evento_peligroso,consecuencias,vinculo_legal,simbologia,probabilidad,severidad,nivel_riesgo,cargo) VALUES(6,'Ruido','Exposición a Ruido','Pérdida Auditiva Inducida por Ruido (Hipoacusia), Nerviosismo','42F (Art.1283 al 1286) ','image8.png',2,4,'MEDIO',3);



INSERT INTO evaluacion_riesgo(personas_expuestas,controles_existentes,capacitacion_capacidades_humanas,expocicion_riesgo,severidad_consecuencia,grado_riesgo,nivel_riesgo) VALUES('De 1 a 3','Existen son satisfactorios y suficientes','Personal entrenado conoce el peligro y lo previene','Al menos 1 vez al año (S)','Lesión sin incapacidad (S)','Trivial (T)','4');
INSERT INTO evaluacion_riesgo(personas_expuestas,controles_existentes,capacitacion_capacidades_humanas,expocicion_riesgo,severidad_consecuencia,grado_riesgo,nivel_riesgo) VALUES('De 4  a 12','Existen parcialmente y nos son satisfactorioo suficientes ','Personal parcialmente entrenado conoce el peligro, pero no toma acciones de control','Eventualmente (SO)','Daño a la salud reversible','Importante (I)','De 17 a 24');
INSERT INTO evaluacion_riesgo(personas_expuestas,controles_existentes,capacitacion_capacidades_humanas,expocicion_riesgo,severidad_consecuencia,grado_riesgo,nivel_riesgo) VALUES('Más de  12','No existen ','Personal no entrenado,no conoce el peligro,no toma acciones de control','Al menos 1 vez al dia  (S)','Lesión con incapacidad permanente  (S)','Intolerable (IT)','De 25 a 36');

INSERT INTO tipo_tareas(nombre,codigo,descripcion) VALUES('RUTINARIA','R','Son aquellas tareas operacionales, en las que se desarrolla de manera continua de acuerdo a parametros de operación especificas o establecidos previamente.   ');
INSERT INTO tipo_tareas(nombre,codigo,descripcion) VALUES('NO RUTINARIA','NR',' Son aquellas por la que se detiene la continuidad de la tarea o actividad y están vinculadas a los trabajos de limpieza, reparación y mantenimiento, ejemplo, paradas cortas de máquina por fallas, cambios de formato, arranques y paradas de Planta (al finalizar o iniciar un periodo de producción o en un mantenimiento preventivo), implementación de nuevos procesos de trabajo y otros. ');
INSERT INTO tipo_tareas(nombre,codigo,descripcion) VALUES('EMERGENCIA','E','Son aquellas no deseadas que pueden ocurrir repentinamente en el desarrollo de actividades rutinarias y no rutinarias requiriendo acciones de mitigación y control inmediato, como por ejemplo un incidente con lesión grave: atrapamientos, atropello, caidas de altura, un incendio/explosión (severidad 3). También se consideras los Desastres Naturales (actividad) con Evacuación a zonas seguras internas (tarea) y Evacuación a zonas seguras externas (tarea), ');


INSERT INTO equipo_evaluador(user_id) VALUES (1);
INSERT INTO equipo_evaluador(user_id) VALUES (2);
INSERT INTO equipo_evaluador(user_id) VALUES (3);
INSERT INTO equipo_evaluador(user_id) VALUES (4);


INSERT INTO configuraciones(codigo, nombre, descripcion, realizado) VALUES ('CCHH_MODULE_EXCEL_IS_LOADED', 'El excel del modulo de CCHH ha sido cargado', null, false);