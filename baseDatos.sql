-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: colegajdbc
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `colega`
--

DROP TABLE IF EXISTS `colega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `colega` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colega`
--

LOCK TABLES `colega` WRITE;
/*!40000 ALTER TABLE `colega` DISABLE KEYS */;
INSERT INTO `colega` VALUES (1,'Svetlana','Madrid','1979-12-13'),(2,'Silvia','Fuenlabrada','2002-02-21'),(3,'Ivan','Leganes','2006-02-02'),(4,'3inrbp0b8f52j8s23krh0jtp4t','kel9i5mqdmbb7ls8sksfbh20e2','2016-02-23'),(5,'8hvmslmo33p5nchp0ri029k7qq','phnjo9273pe304domv6mnd6f9n','2016-02-23'),(6,'t5da5u2ro9noedaaqpfvn70i5o','onre68cs7aknhbfb7ttssbsb1t','2016-02-23'),(7,'a794lgep3gpjhpbpco3bjfo50j','jt23fp1qi2hi491vo3toh8vuu','2016-02-23'),(8,'sd9ffesa8os47sf6f2e6hhskkf','2gpao2tiq1gtls73cucq4j8ts5','2016-02-23'),(9,'p0ll40r5cp1br5ibqgnhrqmejr','i2u1g43rp24dhuhk8lsf6pn53n','2016-02-23'),(10,'cnih0sa32aa8df9ssqnbcno69u','oktou8df70ec6e8l3d62ncj4tm','2016-02-23'),(11,'2j1rt5nmvhaankq0mikh9gdp3e','9v3ll4cfb2ohm3gke75p9er2jp','2016-02-23'),(12,'3jk6bhi1t7t9dpbao0fv8vbn6k','gav7e7ofjgeq526srqtk3ni9e7','2016-02-23'),(13,'mqn7h3v9ffv40fcj9l33dtl967','gdbtacvli1pg0fc9jfk616srme','2016-02-23'),(14,'u6vsnb1vp3ktrquj7bkq4hv062','mt7hbqqaeukv7ch46uh2fhqc5n','2016-02-23'),(15,'mk2h3hkum78h7np3nf6i2flt21','phf05fo2ees2tkg7ffpiro0rms','2016-02-23'),(16,'m2kojs79usba1825k4c2p855hr','8es1jlljvr918jbtgg4qv40p7q','2016-02-23'),(17,'ehd6l019eofi095ehfv7p4de1m','h04h8gp0cdfka21td1rp3acli1','2016-02-23');
/*!40000 ALTER TABLE `colega` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-23 13:09:21
