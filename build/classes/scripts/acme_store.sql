drop database if exists acme_store;
create database if not exists acme_store;
use acme_store;

create table if not exists proveedores (
	id_proveedor smallint(5) not null auto_increment primary key,
	nombre varchar(50) not null,
	rfc varchar(20) not null,
	calle varchar(30) not null,
	numero smallint(5) not null,
	colonia varchar(30) not null,
	ciudad varchar(30) not null, 
	estado varchar(30) not null,
	nombre_contacto varchar(50) not null,
	telefono varchar(15) not null,
	email varchar(30) not null 
);

create table if not exists productos (
	id_producto smallint(5) not null auto_increment primary key,
	producto varchar(50) not null,
	descripcion varchar(90) not null,
	precio_compra float(6) not null,
	precio_venta float(6) not null,
	existencias smallint(5) not null 	
);

create table if not exists clientes (
	id_cliente smallint(5) not null auto_increment primary key,
	nombre varchar(50) not null,
	ap_paterno varchar(30) not null,
	ap_materno varchar(30) not null,
	telefono varchar(15) not null,
	email varchar(30) not null, 
	rfc varchar(20) not null,
	calle varchar(30) not null,
	numero smallint(5) not null,
	colonia varchar(30) not null,
	ciudad varchar(30) not null,
	estado varchar(30) not null		
);

create table if not exists ventas (
	id_venta smallint(5) not null auto_increment primary key,
	fecha date not null,
	id_cliente smallint(5) not null references clientes(id_cliente),
	subtotal float(6) not null,
	iva tinyint(4) not null,
	total float(6) not null 	
);

create table if not exists compras (
	id_compra smallint(5) not null auto_increment primary key,
	fecha date not null,
	id_proveedor smallint(5) not null references proveedores(id_proveedor),
	subtotal float(6) not null,
	iva tinyint(4) not null,
	total float(6) not null 	
);

create table if not exists detalleVentas (
	id_det_venta smallint(5) not null auto_increment primary key,
	id_venta smallint(5) not null references ventas(id_venta),
	id_producto smallint(5) not null references productos(id_producto),
	cantidad int(10) not null,
	total_produtos float(6) not null,
	precio float(6) not null 	
);

create table if not exists detalleCompras (
	id_det_compra smallint(5) not null auto_increment primary key,
	id_compra smallint(5) not null references compras(id_compra),
	id_producto smallint(5) not null references productos(id_producto),
	cantidad int(10) not null,
	total_productos float(6) not null,
	precio float(6) not null 	
);

create table if not exists login (
         nombre varchar(30) not null primary key,
         usuario varchar (30)not null,
         contrasena varchar(20) not null,
         nivel varchar (20)not null,
         estado varchar (20)not null

);


insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Mayra', 'Vargas', 'Cruz', '7759571638', 'cuau5@hotmail.com', '2394574103', 'Nogales', '210', 'Estrella', 'Tulancingo', 'Hidalgo');
insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Elias', 'Pujol', 'Rodriguez', '7751545506', 'eliaspr1@hotmail.com', '239444104', 'Independencia', '414', 'Morena', 'Tulancingo', 'Hidalgo');
insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Senyat', 'Olvera', 'Calderons', '7753035417', 'senyat69@hotmail.com', '2394574105', 'Reforma', '624', 'Juarez', 'Pachuca', 'Hidalgo');

insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Luis Ángel', '10893787', 'Alamos', '320', 'Colobires', 'Pachuca', 'Hidalgo', 'wicho', '157900334', 'wicho69_es@live.com');
insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Zenen Abdi ', '39393773', 'Almeida', '106', 'Insurgentes', 'San Luis Potosi', 'San Luis Potosi', 'AbdiSen', '183636383', 'Zen_Abdi6@live.com');
insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Prisca', '7383938373', 'Lomas', '666', 'San Juan', 'Apizaco', 'Hidalgo', 'Prisc', '5507838363', 'SEIOP@live.com');

insert into productos(producto, descripcion, precio_compra, precio_venta, existencias)
values('Chocolate pancho pantera', 'Chocolate en polvo', '10.50', '26.00', '69');
insert into productos(producto, descripcion, precio_compra, precio_venta, existencias)
values('Salsa catsup', 'Salsa de tomate la costena', '10.50', '21.50', '321');	
insert into productos(producto, descripcion, precio_compra, precio_venta, existencias)
values('Galletas amaranto', 'Galletas surtidas de amaranto con chocolate', '12.50', '36.50', '30');

insert into login (nombre, usuario, contrasena, nivel, estado)
values ('Calamardo', 'spongebob', 'sammy', 'Admin', 'Activo');