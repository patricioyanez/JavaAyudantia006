CREATE TABLE Producto6(
    id					INT 			PRIMARY KEY AUTO_INCREMENT,
    codigo 				INT				NOT NULL,
    descripcion 		VARCHAR(200)	NOT NULL,
    precio				INT				NOT NULL,
    UNIQUE(codigo)
);


INSERT INTO producto6 (id, codigo, descripcion, precio) VALUES (NULL, '1000', 'bebida 2lt', '1500');
INSERT INTO producto6 (id, codigo, descripcion, precio) VALUES (NULL, '1001', 'bebida 3lt', '2300');