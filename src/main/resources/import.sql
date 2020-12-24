INSERT INTO frecuencia(nombre) VALUES('ANUAL');
INSERT INTO frecuencia(nombre) VALUES('DIARIO');
INSERT INTO frecuencia(nombre) VALUES('SEMESTRAL');
INSERT INTO frecuencia(nombre) VALUES('MENSUAL');
INSERT INTO frecuencia(nombre) VALUES('PERMANENTE');
INSERT INTO frecuencia(nombre) VALUES('PERSONALIZADO');


INSERT INTO programa_anuales(nombre,id_aprobado) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1);
INSERT INTO programa_anuales(nombre,id_aprobado) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',2);
INSERT INTO programa_anuales(nombre,id_aprobado) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',3);


INSERT INTO empresa(razon_social,actividad_economica,numero_trabajadores,ruc) VALUES('EMPRESA COMERCIALIZADORA DE BEBIDAS SOCIEDAD ANÓNIMA CERRADA','COMERCIALIZACIÓN DE BEBIDAS NO ALCOHÓLICAS',14010,'20557079441');

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



