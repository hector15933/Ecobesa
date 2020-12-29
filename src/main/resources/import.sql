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


INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)
INSERT INTO actividades(nombre,objetivo_general_id) VALUES('APROBAR EL PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO - PASST',1)

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






