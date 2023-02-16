// for reference to use in MySQL DB

CREATE DATABASE hotel_db;
USE hotel;
DROP TABLE IF EXISTS `Hotel`;
CREATE TABLE `Hotel` (
`id` bigint NOT NULL AUTO_INCREMENT,
`hotel_name` varchar(255) DEFAULT NULL,
`city` varchar(255) DEFAULT NULL,
`price_per_night` bigint DEFAULT NULL,
 PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Hotel` (hotel_name, city, price_per_night) VALUES 
('La Quinta', 'Denver', 100),
('La Quinta', 'Las Vegas', 170),
('La Quinta', 'Tampa', 150),
('Hotel Sky', 'Tampa', 280),
('KingFisher Resort', 'Denver', 300),
('Triump Hotel', 'Las Vegas', 230),
('La Quinta', 'Las Vegas', 210),
('La Quinta', 'Tampa', 150),
('Doble tree', 'Edison', 120);

SELECT * FROM Hotel;
