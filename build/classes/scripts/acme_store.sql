drop database if exists acme_store;
create database if not exists acme_store;
use acme_store;

/*Tabla de usuarios: */
create table if not exists usuarios (
    nombre varchar(30) not null primary key,
    usuario varchar(30) not null unique,
    contrasena varchar(20) not null,
    nivel varchar(20) not null,
    estado varchar(20) not null
)  engine=InnoDB default charset=utf8;

/*Tabla de proveedores: */
create table if not exists proveedores (
    id_proveedor smallint(5) not null auto_increment primary key,
    nombre varchar(50) not null,
    rfc varchar(20) not null unique,
    calle varchar(30) not null,
    numero smallint(5) not null,
    colonia varchar(30) not null,
    ciudad varchar(30) not null,
    estado varchar(30) not null,
    nombre_contacto varchar(50) not null unique,
    telefono varchar(15) not null,
    email varchar(30) not null
)  engine=InnoDB default charset=utf8;

/*Tabla de productos: */
create table if not exists productos (
    id_producto smallint(5) not null auto_increment primary key,
    producto varchar(50) not null,
    descripcion varchar(90) not null,
    precio_compra float(6) not null,
    precio_venta float(6) not null,
    existencias smallint(5) not null
)  engine=InnoDB default charset=utf8;

/*Tabla de clientes: */
create table if not exists clientes (
    id_cliente smallint(5) not null auto_increment primary key,
    nombre varchar(50) not null,
    ap_paterno varchar(30) not null,
    ap_materno varchar(30) not null,
    telefono varchar(15) not null,
    email varchar(30) not null,
    rfc varchar(20) not null unique,
    calle varchar(30) not null,
    numero smallint(5) not null,
    colonia varchar(30) not null,
    ciudad varchar(30) not null,
    estado varchar(30) not null
)  engine=InnoDB default charset=utf8;

/*Tabla de detalle de ventas: */
create table if not exists detalleVentas (
    id_detalleVenta smallint(3) not null auto_increment primary key,
    id_venta smallint(5) not null,
    producto varchar(30) not null references productos (producto),
    cantidad smallint(3) not null,
    precio_venta float(6) not null references productos (precio_venta),
    total_producto float(8) not null
)  engine=InnoDB default charset=utf8;

/*Tabla de ventas: */
create table if not exists ventas (
    id_venta smallint(5) not null auto_increment primary key references detalleVentas,
    nombre varchar(50) not null references clientes (nombre),
    fecha varchar(30) not null,
    total_venta float(6) not null
)  engine=InnoDB default charset=utf8;

/*Tabla de detalle de compras: */
create table if not exists detalleCompras (
    id_detalleCompra smallint(5) not null auto_increment primary key,
    id_compra smallint(5) not null,
    producto varchar(50) not null references productos (producto),
    cantidad int(10) not null,
    precio_compra float(6) not null references productos(precio_compra),
    total_producto float(6) not null
)  engine=InnoDB default charset=utf8;

/*Tabla de compras: */
create table if not exists compras (
    id_compra smallint(5) not null auto_increment primary key references detalleCompras,
    nombre varchar(50) not null references proveedores (nombre),
    fecha varchar(30) not null,
    total_compra float(6) not null
)  engine=InnoDB default charset=utf8;


/*Registro de usuarios: */
insert into usuarios (nombre, usuario, contrasena, nivel, estado)
values ('Calamardo', 'spongebob', 'sammy', 'Admin', 'Activo');
insert into usuarios (nombre, usuario, contrasena, nivel, estado)
values ('Alejandro', 'Cangreburger66', '1234', 'Cliente', 'Activo');

/*Registro de proveedores: */
insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Luis Ángel', '10893787', 'Alamos', '320', 'Colobires', 'Pachuca', 'Hidalgo', 'wicho', '157900334', 'wicho69_es@live.com');
insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Zenen Abdi ', '39393773', 'Almeida', '106', 'Insurgentes', 'San Luis Potosi', 'San Luis Potosi', 'AbdiSen', '183636383', 'Zen_Abdi6@live.com');
insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Prisca', '7383938373', 'Lomas', '666', 'San Juan', 'Apizaco', 'Hidalgo', 'Prisc', '5507838363', 'SEIOP@live.com');

/*Registro de productos: */
insert into productos(producto, descripcion, precio_compra, precio_venta, existencias)
values('Chocolate pancho pantera', 'Chocolate en polvo', 11.50, 22.00, 55), ('Cereal korn', 'Cereal de hojuelas de maíz ', 16.50, 33.00, 32),	
('Galletas de salami', 'Galletas importadas de  India', 18.50, 35.00, 28), ('Pasta', 'Pasta  Italiana para sopa', 3.50, 8.00, 50),
('Sardinas', 'Sardinas en lata importadas', 5.50, 11.00, 44); 

/*Registro de clientes: */
insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Mayra', 'Vargas', 'Cruz', '7759571638', 'cuau5@hotmail.com', 'tte456', 'Nogales', '210', 'Estrella', 'Tulancingo', 'Hidalgo');
insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Elias', 'Pujol', 'Rodriguez', '7751545506', 'eliaspr1@hotmail.com', 'efeo3456', 'Independencia', '414', 'Morena', 'Tulancingo', 'Hidalgo');
insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Senyat', 'Olvera', 'Calderon', '7753035417', 'senyat69@hotmail.com', 'pta4566', 'Reforma', '624', 'Juarez', 'Pachuca', 'Hidalgo');

/*Registro de detalle de ventas: */
insert into detalleVentas(id_venta, producto, cantidad, precio_venta, total_producto) values(1, 'Pasta', 2, 8.00, 16.00),
(2, 'Cereal korn', 1, 33.00, 33.00), (2, 'Sardinas', 2, 11.00, 22.00), (3, 'Chocolate pancho pantera', 4, 22.00, 88.00), (4, 'Galletas de salami', 2, 35.00, 70.00),
(4, 'Pasta', 3, 8.00, 24.00), (5, 'Chocolate pancho pantera', 1, 22.00, 22.00), (6, 'Cereal korn', 3, 33.00, 99.00);

/*Registro de ventas: */
insert into ventas(nombre, fecha, total_venta) values('Elias', 'Octubre 26, 2016', 16.00), ('Senyat', 'Noviembre 27, 2016', 55.00),
('Elias', 'Diciembre 28, 2013', 88.00), ('Mayra', 'Noviembre 21, 2016', 94.00), ('Senyat', 'Noviembre 29, 2016', 22.00),
('Mayra', 'November 10, 2016', 99.00);

/*Registro de detalle de compras: */
insert into detalleCompras(id_compra, producto, cantidad, precio_compra, total_producto) values(1, 'Pasta', 2, 3.50, 7.00),
(2, 'Cereal korn', 1, 16.50, 16.50), (2, 'Sardinas', 2, 5.50, 11.00), (3, 'Chocolate pancho pantera', 4, 11.50, 46.00), (4, 'Galletas de salami', 2, 18.50, 37.00),
(4, 'Pasta', 3, 3.50, 10.50), (5, 'Chocolate pancho pantera', 1, 11.50, 11.50), (6, 'Cereal korn', 3, 16.50, 49.50);

/*Registro de compras: */
insert into compras(nombre, fecha, total_compra) values('Luis Ángel', 'Octubre 26, 2016', 7.00), ('Prisca', 'Noviembre 27, 2016', 27.50),
('Prisca', 'Diciembre 28, 2013', 46.00), ('Zenen Abdi', 'Noviembre 21, 2016', 47.50), ('Zenen Abdi', 'Noviembre 29, 2016', 11.50),
('Luis Ángel', 'Noviembre 10, 2016', 49.50);

/*Vista de todas las ventas: */
create view ventas_todos as select clientes.nombre, clientes.rfc, ventas.id_venta,
 productos.producto, detalleventas.cantidad, detalleventas.precio_venta,
 detalleventas.total_producto from acme_store.clientes, acme_store.productos, acme_store.ventas, acme_store.detalleventas
 where clientes.nombre = ventas.nombre and ventas.id_venta = detalleVentas.id_venta and
 productos.producto = detalleventas.producto order by detalleVentas.id_detalleVenta;
    
/*Vista de ventas por cliente: */
create view total_clientes as select ventas_todos.nombre, ventas_todos.rfc, sum(ventas_todos.total_producto)
from acme_store.ventas_todos where ventas_todos.id_venta = ventas_todos.id_venta group by ventas_todos.nombre;
    
/*Vista de ventas por producto: */
create view total_productos as select ventas_todos.producto, sum(ventas_todos.cantidad), sum(ventas_todos.total_producto)
from acme_store.ventas_todos where ventas_todos.producto = ventas_todos.producto group by ventas_todos.producto;
   
/*Ventas de un cliente  particular : */
select ventas_todos.nombre, ventas_todos.rfc, ventas_todos.producto, ventas_todos.precio_venta,
ventas_todos.cantidad ,ventas_todos.total_producto from acme_store.ventas_todos where
ventas_todos.nombre like 'Elias%' order by ventas_todos.id_venta;
    
 /*Ventas de un producto en particular: */   
 select ventas_todos.nombre, ventas_todos.rfc, ventas_todos.producto, ventas_todos.precio_venta,
 ventas_todos.cantidad, ventas_todos.total_producto from acme_store.ventas_todos where
 ventas_todos.producto like 'Cereal korn%' order by ventas_todos.id_venta;



/*Vista de todas las compras: */
create view compras_generales as select detalleCompras.id_detalleCompra, compras.id_compra, compras.fecha, proveedores.nombre,
proveedores.rfc, productos.producto, productos.precio_compra, detalleCompras.cantidad, detalleCompras.total_producto from
acme_store.compras, acme_store.proveedores, acme_store.productos, acme_store.detalleCompras where proveedores.nombre = compras.nombre and
detalleCompras.id_compra = compras.id_compra and productos.producto = detalleCompras.producto order by
detalleCompras.id_detalleCompra;

/*Vista de compras por proveedor: */
create view compras_clientes as select compras_generales.nombre, compras_generales.rfc, sum(compras_generales.total_producto)
from acme_store.compras_generales where compras_generales.id_compra = compras_generales.id_compra group by compras_generales.nombre;

/*Vista de compras por producto: */
create view compras_productos as select compras_generales.producto, compras_generales.precio_compra,
sum(compras_generales.cantidad), sum(compras_generales.total_producto) from acme_store.compras_generales where
compras_generales.producto = compras_generales.producto group by compras_generales.producto;

/*Compras de un proveedor en particular : */
select compras_generales.fecha, compras_generales.nombre, compras_generales.rfc, compras_generales.producto,
compras_generales.precio_compra, compras_generales.cantidad, compras_generales.total_producto from acme_store.compras_generales
where compras_generales.nombre like 'Zenen Abdi%' order by compras_generales.id_detalleCompra;

/*Compras de un producto en particular: */    		
select compras_generales.fecha, compras_generales.nombre, compras_generales.rfc, compras_generales.producto,
compras_generales.precio_compra, compras_generales.cantidad, compras_generales.total_producto from acme_store.compras_generales
where compras_generales.producto like 'Cereal korn%' order by compras_generales.id_detalleCompra;

