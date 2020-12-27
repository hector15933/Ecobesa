INSERT INTO frecuencia(nombre) VALUES('ANUAL');
INSERT INTO frecuencia(nombre) VALUES('DIARIO');
INSERT INTO frecuencia(nombre) VALUES('SEMESTRAL');
INSERT INTO frecuencia(nombre) VALUES('MENSUAL');
INSERT INTO frecuencia(nombre) VALUES('PERMANENTE');
INSERT INTO frecuencia(nombre) VALUES('PERSONALIZADO');



INSERT INTO cargos(nombre) VALUES('ADMINISTRADOR');

INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,cargo_id) VALUES('Hector17','Apellido01 Apellido02','user@gmail.com',true,78021293,995707476,'user123','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1);
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,cargo_id) VALUES('Jose17','Apellido01 Apellido02','user@gmail.com',true,78021293,995707476,'user234','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1);
INSERT INTO users(nombres,apellidos,email,estado,dni,telefono,usuario,password,cargo_id) VALUES('Walter','Reaños Arcilla','user@gmail.com',true,78021293,995707476,'user234','$2a$10$DDNB/kjudd5GvexibmBfk.IsI5l6KTmXPLZdx3O7i3Q5v8m7xbPg6',1);


INSERT INTO roles(authority,user_id) VALUES('ROLE_ADMIN',1)
INSERT INTO roles(authority,user_id) VALUES('ROLE_USER',2)
INSERT INTO roles(authority,user_id) VALUES('ROLE_ADMIN',3)


INSERT INTO programa_anuales(nombre,id_aprobado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1);
INSERT INTO programa_anuales(nombre,id_aprobado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1);
INSERT INTO programa_anuales(nombre,id_aprobado_id) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1);


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


INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)




