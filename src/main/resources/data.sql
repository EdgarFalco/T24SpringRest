DROP table IF EXISTS empleado;

create table empleado(
    id int auto_increment,
    nombre varchar(250),
    apellido varchar(250),
    direccion varchar(250),
    dni integer,
    fecha date,
    trabajo varchar(250)
);

insert into empleado (nombre, apellido,direccion,dni,fecha, trabajo)values('Jose','Marin','calle imaginaria 1',123456789, NOW(), 'Secretario');
insert into empleado (nombre, apellido,direccion,dni,fecha, trabajo)values('Juan','Lopez','calle imaginaria 2',122222222, NOW(), 'Conserje');
insert into empleado (nombre, apellido,direccion,dni,fecha, trabajo)values('Pedro','Guillem','calle imaginaria 3',123333333, NOW(), 'Professor');
insert into empleado (nombre, apellido,direccion,dni,fecha, trabajo)values('Jordi','Martin','calle imaginaria 4',123444444, NOW(), 'Alumno');
insert into empleado (nombre, apellido,direccion,dni,fecha, trabajo)values('Jonatan','Vicente','calle imaginaria 5',123455555, NOW(), 'Paro');