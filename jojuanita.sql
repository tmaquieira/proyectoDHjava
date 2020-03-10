-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jojuanita
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `carrito`
--

LOCK TABLES `carrito` WRITE;
/*!40000 ALTER TABLE `carrito` DISABLE KEYS */;
INSERT INTO `carrito` VALUES (3,2),(3,2);
/*!40000 ALTER TABLE `carrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Billeteras'),(2,'Carteras'),(3,'Mochilas');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `colores`
--

LOCK TABLES `colores` WRITE;
/*!40000 ALTER TABLE `colores` DISABLE KEYS */;
INSERT INTO `colores` VALUES (1,'Amarillo'),(2,'Azul'),(3,'Blanco'),(4,'Celeste'),(5,'Fucsia'),(6,'Gris'),(7,'Marrón'),(8,'Naranja'),(9,'Negro'),(10,'Rojo'),(11,'Rosa'),(12,'Verde'),(13,'Violeta');
/*!40000 ALTER TABLE `colores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (15),(15),(15),(15);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Bella billeterita loca con detalles en dorado.','billetera1a.jpg','Billetera Cyan',1000,10,1,4),(2,'Más amarilla que tu canario.','billetera2a.jpg','Billetera Amarilla',1100,20,1,1),(3,'Ideal para tu abuela.','billetera3a.jpg','Billetera Lila',1200,50,1,13),(4,'Transparente y noventosa (?.','cartera1a.jpg','Cartera Celeste',2000,10,2,4),(5,'Para tirar facha en los meetings. ','cartera2a.jpg','Cartera Negra',2100,20,2,9),(6,'De playa y veraniega como Hawaii.','cartera3a.jpg','Cartera Roja',2200,50,2,10),(7,'Facha pero buena muchacha.','mochila1a.jpg','Mochila Negra',3000,10,3,9),(8,'Para ir a ver Daitona en Cali.','mochila2a.jpg','Mochila Roja',3100,25,3,10),(9,'Sesentosa y psicodélica. Como tu vieja.','mochila3a.jpg','Mochila Estampada',3200,99,3,11);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Benito','Argentina1','47888834','Calle 201 Nro 490 Depto 5, Berazategui. ','1995-02-04 00:00:00.000000','yesicamicaelabenito@gmail.com','arg','Yesica','5491159982660','541142372508'),(2,'Meza','Argentina1','24491397','Grecia 3856 Lanus, Buenos Aires.','1975-05-07 00:00:00.000000','vainilla797@gmail.com','arg','Vanina','5491136464799','541142624837'),(3,'Cusi','Argentina1','36791036','Llavalllol 364 depto 4d Lanus ','1992-03-22 00:00:00.000000','cusi.mercedes@live.com','arg','Mercedes','5491166950552','541142424979'),(4,'Maquieira','Argentina1','34389681','Paraguay 478 Avellaneda Piñeyro Bs As','1989-01-29 00:00:00.000000','tmaquieira@hotmail.com','arg','Tatiana','5491165516183','541142285303'),(14,'Maquieira','Argentina1','14070104','Paraguay 478 Avellaneda Piñeyro Bs As','1960-06-17 00:00:00.000000','omaquieira@gmail.com','arg','Oscar Ruben','5491141778287','541142285303');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-10 13:26:21
