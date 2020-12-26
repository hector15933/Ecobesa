INSERT INTO frecuencia(nombre) VALUES('ANUAL');
INSERT INTO frecuencia(nombre) VALUES('DIARIO');
INSERT INTO frecuencia(nombre) VALUES('SEMESTRAL');
INSERT INTO frecuencia(nombre) VALUES('MENSUAL');
INSERT INTO frecuencia(nombre) VALUES('PERMANENTE');
INSERT INTO frecuencia(nombre) VALUES('PERSONALIZADO');

INSERT INTO empresa(razon_social,actividad_economica,numero_trabajadores,ruc) VALUES('EMPRESA COMERCIALIZADORA DE BEBIDAS SOCIEDAD ANÓNIMA CERRADA','COMERCIALIZACIÓN DE BEBIDAS NO ALCOHÓLICAS',14010,'20557079441');

INSERT INTO objetivo_generales(nombre,meta,recursos,presupuesto_general) VALUES('CUMPLIR CON LA LEGISLACIÓN VIGENTE EN SEGURIDAD Y SALUD EN EL TRABAJO','100% de cumplimiento','Recursos humanos y procedimientos',25000)
INSERT INTO objetivo_generales(nombre,meta,recursos,presupuesto_general) VALUES('CUMPLIR CON LOS INDICADORES DE SEGURIDAD EN BASE A LA CANTIDAD DE ACCIDENTES E INCIDENTES DE TRABAJO','100% de cumplimiento','Recursos humanos y procedimientos',25000)
INSERT INTO objetivo_generales(nombre,meta,recursos,presupuesto_general) VALUES('ESTABLECER Y CUMPLIR CON EL PLAN DE RESPUESTA ANTE EMERGENCIA','100% de cumplimiento','Recursos humanos y procedimientos',25000)

INSERT INTO objetivo_especificos(nombre) VALUES(' Elaboración, aprobación, difusión e implementación de la documentación del Sistema de Gestión de Seguridad y Salud Ocupacional, de acuerdo a la legislación vigente.')
INSERT INTO objetivo_especificos(nombre) VALUES(' Actualización de los documentos del Sistema de Gestón de Seguridad y Salud Ocupacional.')
INSERT INTO objetivo_especificos(nombre) VALUES(' Cumplimiento con las actividades del Comité de Seguridad y Salud en el Trabajo - CSST, de acuerdo a la legislación vigente.')

INSERT INTO objetivo_especificos(nombre) VALUES(' Reducir la cantidad de accidentes con tiempo perdido (LTIR)')
INSERT INTO objetivo_especificos(nombre) VALUES(' Monitorear y disminuir el índice de severidad LTISR')
INSERT INTO objetivo_especificos(nombre) VALUES(' Monitorear y reducir la cantidad de incidentes con y sin tiempo perdido (TIR)')

INSERT INTO objetivo_especificos(nombre) VALUES(' Generar el conocimineto del "Procedimiento de Respuesta Ante Emergencia"')
INSERT INTO objetivo_especificos(nombre) VALUES(' Entrenar al personal para el uso de los equipos de emergencia')
INSERT INTO objetivo_especificos(nombre) VALUES(' Asegurar el funcionamiento de los equipos de emergencia')

INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(1,1)
INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(1,2)
INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(1,3)

INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(2,4)
INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(2,5)
INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(2,6)

INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(3,7)
INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(3,8)
INSERT INTO objetivo_generales_objetivo_especifico_lista(objetivo_general_id,objetivo_especifico_lista_id) VALUES(3,9)


INSERT INTO programa_anuales(nombre,id_aprobado) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',1);
INSERT INTO programa_anuales(nombre,id_aprobado) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',2);
INSERT INTO programa_anuales(nombre,id_aprobado) VALUES('PROGRAMA ANUAL DE SEGURIDAD Y SALUD EN EL TRABAJO 2020 ECOBESA',3);

INSERT INTO programa_anuales_objetivo_general_lista(programa_anual_id,objetivo_general_lista_id) VALUES(1,1)
INSERT INTO programa_anuales_objetivo_general_lista(programa_anual_id,objetivo_general_lista_id) VALUES(1,2)
INSERT INTO programa_anuales_objetivo_general_lista(programa_anual_id,objetivo_general_lista_id) VALUES(1,3)