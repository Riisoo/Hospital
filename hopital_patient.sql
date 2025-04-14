-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: hopital
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `idP` varchar(20) NOT NULL,
  `NomP` varchar(20) DEFAULT NULL,
  `Tel` varchar(10) DEFAULT NULL,
  `Age` varchar(10) DEFAULT NULL,
  `Sexe` varchar(20) DEFAULT NULL,
  `Adresse` varchar(30) DEFAULT NULL,
  `GroupeSanguin` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES ('1','Sofia Motai','0657483926','19','Femelle','IRCH,KENITRA','O+'),('11','Sara Samir','0786954537','21','Femelle','Kenitra','O+'),('2','Ahmed Karime','07123456','26','Male','AGDAL,Rabat','A+'),('3','Safae Said','0781394530','18','Femelle','La City,Kenitra','A+'),('4','Sara Kamil','0689563426','30','Femelle','Maarif,CASA','O-'),('5','Samir samkra','0768953421','35','Male','la ville haut, KENTRA','B-'),('6','Imad  Sbaii ','0634296752','25','Male','LE VALLANT,KENITRA','B+'),('7','Karima Salim','0693826120','32','Femelle','LA VILLE,KENITRA','O-'),('8','Fatima Bassim','0612788900','50','Femelle','Casablanca','O+'),('9','Siham Ben Amour','0612788900','27','Femelle','Casablanca','O+');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-10  9:43:47
