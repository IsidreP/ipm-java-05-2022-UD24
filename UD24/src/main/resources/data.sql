DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario int(10)
);

insert into empleado (nombre, trabajo, salario)values('Jose', 'administrativo', 2000);
insert into empleado (nombre, trabajo, salario)values('Manuel', 'comercial', 3000);
insert into empleado (nombre, trabajo, salario)values('Ana', 'gerente', 4000);
insert into empleado (nombre, trabajo, salario)values('Jordi', 'encargado', 2500);
insert into empleado (nombre, trabajo, salario)values('Eva', 'becario', 1000);
