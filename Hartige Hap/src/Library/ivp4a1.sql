-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.17 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for ivp4a1
CREATE DATABASE IF NOT EXISTS `ivp4a1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ivp4a1`;


-- Dumping structure for table ivp4a1.dhh_allergy
CREATE TABLE IF NOT EXISTS `dhh_allergy` (
  `allergyName` varchar(50) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`allergyName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_allergyingredient
CREATE TABLE IF NOT EXISTS `dhh_allergyingredient` (
  `ALLERGYallergyName` varchar(50) NOT NULL,
  `INGREDIENTingredientName` varchar(50) NOT NULL,
  PRIMARY KEY (`ALLERGYallergyName`,`INGREDIENTingredientName`),
  KEY `ALLERGYallergyName` (`ALLERGYallergyName`),
  KEY `INGREDIENTingredientName` (`INGREDIENTingredientName`),
  CONSTRAINT `dhh_allergyingredient_ibfk_1` FOREIGN KEY (`INGREDIENTingredientName`) REFERENCES `dhh_ingredient` (`ingredientName`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dhh_allergyingredient_ibfk_2` FOREIGN KEY (`ALLERGYallergyName`) REFERENCES `dhh_allergy` (`allergyName`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_beverage
CREATE TABLE IF NOT EXISTS `dhh_beverage` (
  `ITEMitemName` varchar(50) NOT NULL,
  `alcoholPercentage` decimal(3,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`ITEMitemName`),
  KEY `ITEMitemName` (`ITEMitemName`),
  CONSTRAINT `dhh_beverage_ibfk_1` FOREIGN KEY (`ITEMitemName`) REFERENCES `dhh_item` (`itemName`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_course
CREATE TABLE IF NOT EXISTS `dhh_course` (
  `courseName` varchar(50) NOT NULL,
  PRIMARY KEY (`courseName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_customer
CREATE TABLE IF NOT EXISTS `dhh_customer` (
  `customerId` int(10) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `postalCode` varchar(10) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `discount` decimal(3,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_dish
CREATE TABLE IF NOT EXISTS `dhh_dish` (
  `ITEMitemName` varchar(50) NOT NULL,
  `preparation` time DEFAULT NULL,
  PRIMARY KEY (`ITEMitemName`),
  KEY `ITEMitemName` (`ITEMitemName`),
  CONSTRAINT `dhh_dish_ibfk_1` FOREIGN KEY (`ITEMitemName`) REFERENCES `dhh_item` (`itemName`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_employee
CREATE TABLE IF NOT EXISTS `dhh_employee` (
  `employeeId` int(10) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `birthday` date NOT NULL,
  `salary` decimal(10,2) NOT NULL,
  `address` varchar(50) NOT NULL,
  `postalCode` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phoneNo` varchar(20) NOT NULL,
  `password` varchar(100) NOT NULL,
  `joinDate` date NOT NULL,
  `EMPLOYEEFUNCTIONfunctionName` varchar(50) NOT NULL,
  PRIMARY KEY (`employeeId`),
  KEY `EMPLOYEEFUNCTIONfunctionName` (`EMPLOYEEFUNCTIONfunctionName`),
  CONSTRAINT `dhh_employee_ibfk_1` FOREIGN KEY (`EMPLOYEEFUNCTIONfunctionName`) REFERENCES `dhh_employeefunction` (`functionName`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_employeefunction
CREATE TABLE IF NOT EXISTS `dhh_employeefunction` (
  `functionName` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`functionName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_ingredient
CREATE TABLE IF NOT EXISTS `dhh_ingredient` (
  `ingredientName` varchar(50) NOT NULL,
  `currentStock` decimal(10,2) NOT NULL,
  `minStock` decimal(10,2) NOT NULL,
  `advicedStock` decimal(10,2) NOT NULL,
  `measurement` varchar(50) NOT NULL,
  PRIMARY KEY (`ingredientName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_inventory
CREATE TABLE IF NOT EXISTS `dhh_inventory` (
  `inventoryName` varchar(50) NOT NULL,
  `currentStock` decimal(10,2) NOT NULL,
  `minStock` decimal(10,2) NOT NULL,
  `advicedStock` decimal(10,2) NOT NULL,
  PRIMARY KEY (`inventoryName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_item
CREATE TABLE IF NOT EXISTS `dhh_item` (
  `itemName` varchar(50) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `COURSEcourseName` varchar(50) NOT NULL,
  `ITEMCATEGORYcategoryName` varchar(50) NOT NULL,
  PRIMARY KEY (`itemName`),
  KEY `COURSEcourseName` (`COURSEcourseName`),
  KEY `ITEMCATEGORYcategoryName` (`ITEMCATEGORYcategoryName`),
  CONSTRAINT `dhh_item_ibfk_1` FOREIGN KEY (`COURSEcourseName`) REFERENCES `dhh_course` (`courseName`) ON UPDATE CASCADE,
  CONSTRAINT `dhh_item_ibfk_2` FOREIGN KEY (`ITEMCATEGORYcategoryName`) REFERENCES `dhh_itemcategory` (`categoryName`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_itemcategory
CREATE TABLE IF NOT EXISTS `dhh_itemcategory` (
  `categoryName` varchar(50) NOT NULL,
  PRIMARY KEY (`categoryName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_itemingredient
CREATE TABLE IF NOT EXISTS `dhh_itemingredient` (
  `ITEMitemName` varchar(50) NOT NULL,
  `INGREDIENTingredientName` varchar(50) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  PRIMARY KEY (`ITEMitemName`,`INGREDIENTingredientName`),
  KEY `ITEMitemName` (`ITEMitemName`),
  KEY `INGREDIENTingredientName` (`INGREDIENTingredientName`),
  CONSTRAINT `dhh_itemingredient_ibfk_1` FOREIGN KEY (`ITEMitemName`) REFERENCES `dhh_item` (`itemName`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dhh_itemingredient_ibfk_2` FOREIGN KEY (`INGREDIENTingredientName`) REFERENCES `dhh_ingredient` (`ingredientName`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_order
CREATE TABLE IF NOT EXISTS `dhh_order` (
  `orderNo` int(10) NOT NULL AUTO_INCREMENT,
  `paymentStatus` varchar(50) NOT NULL,
  `orderDatetime` datetime NOT NULL,
  `CUSTOMERcustomerId` int(10) DEFAULT NULL,
  `TABLEtableNo` int(10) DEFAULT NULL,
  PRIMARY KEY (`orderNo`),
  KEY `CUSTOMERcustomerId` (`CUSTOMERcustomerId`),
  KEY `TABLEtableNo` (`TABLEtableNo`),
  CONSTRAINT `dhh_order_ibfk_1` FOREIGN KEY (`TABLEtableNo`) REFERENCES `dhh_table` (`tableNo`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `dhh_order_ibfk_2` FOREIGN KEY (`CUSTOMERcustomerId`) REFERENCES `dhh_customer` (`customerId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_orderitem
CREATE TABLE IF NOT EXISTS `dhh_orderitem` (
  `ORDERorderNo` int(10) NOT NULL,
  `ITEMitemName` varchar(50) NOT NULL,
  `EMPLOYEEemployeeId` int(10) NOT NULL,
  `ORDERSTATUSstatusName` varchar(50) NOT NULL,
  `amount` int(10) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ORDERorderNo`,`ITEMitemName`),
  KEY `ORDERorderNo` (`ORDERorderNo`),
  KEY `ITEMitemName` (`ITEMitemName`),
  KEY `EMPLOYEEemployeeId` (`EMPLOYEEemployeeId`),
  KEY `ORDERSTATUSstatusName` (`ORDERSTATUSstatusName`) USING BTREE,
  CONSTRAINT `dhh_orderitem_ibfk_1` FOREIGN KEY (`ORDERorderNo`) REFERENCES `dhh_order` (`orderNo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dhh_orderitem_ibfk_2` FOREIGN KEY (`ITEMitemName`) REFERENCES `dhh_item` (`itemName`) ON UPDATE CASCADE,
  CONSTRAINT `dhh_orderitem_ibfk_3` FOREIGN KEY (`EMPLOYEEemployeeId`) REFERENCES `dhh_employee` (`employeeId`) ON UPDATE CASCADE,
  CONSTRAINT `dhh_orderitem_ibfk_4` FOREIGN KEY (`ORDERSTATUSstatusName`) REFERENCES `dhh_orderstatus` (`statusName`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_orderstatus
CREATE TABLE IF NOT EXISTS `dhh_orderstatus` (
  `statusName` varchar(50) NOT NULL,
  PRIMARY KEY (`statusName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_purchaseorder
CREATE TABLE IF NOT EXISTS `dhh_purchaseorder` (
  `purchaseOrderNo` int(10) NOT NULL AUTO_INCREMENT,
  `orderDate` date NOT NULL,
  `deliveryDate` date NOT NULL,
  `status` varchar(50) NOT NULL,
  `SUPPLIERsupplierId` int(10) NOT NULL,
  PRIMARY KEY (`purchaseOrderNo`),
  KEY `SUPPLIERsupplierId` (`SUPPLIERsupplierId`),
  CONSTRAINT `dhh_purchaseorder_ibfk_1` FOREIGN KEY (`SUPPLIERsupplierId`) REFERENCES `dhh_supplier` (`supplierId`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_purchaseorderingredient
CREATE TABLE IF NOT EXISTS `dhh_purchaseorderingredient` (
  `PURCHASEpurchaseOrderNo` int(10) NOT NULL,
  `INGREDIENTingredientName` varchar(50) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `amount` int(10) NOT NULL,
  PRIMARY KEY (`PURCHASEpurchaseOrderNo`,`INGREDIENTingredientName`),
  KEY `PURCHASEpurchaseOrderNo` (`PURCHASEpurchaseOrderNo`),
  KEY `INGREDIENTingredientName` (`INGREDIENTingredientName`),
  CONSTRAINT `dhh_purchaseorderingredient_ibfk_1` FOREIGN KEY (`INGREDIENTingredientName`) REFERENCES `dhh_ingredient` (`ingredientName`),
  CONSTRAINT `dhh_purchaseorderingredient_ibfk_2` FOREIGN KEY (`PURCHASEpurchaseOrderNo`) REFERENCES `dhh_purchaseorder` (`purchaseOrderNo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_purchaseorderinventory
CREATE TABLE IF NOT EXISTS `dhh_purchaseorderinventory` (
  `PURCHASEpurchaseOrderNo` int(10) NOT NULL,
  `INVENTORYinventoryName` varchar(50) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `amount` int(10) NOT NULL,
  PRIMARY KEY (`PURCHASEpurchaseOrderNo`,`INVENTORYinventoryName`),
  KEY `PURCHASEpurchaseOrderNo` (`PURCHASEpurchaseOrderNo`),
  KEY `INVENTORYinventoryName` (`INVENTORYinventoryName`),
  CONSTRAINT `dhh_purchaseorderinventory_ibfk_1` FOREIGN KEY (`INVENTORYinventoryName`) REFERENCES `dhh_inventory` (`inventoryName`),
  CONSTRAINT `dhh_purchaseorderinventory_ibfk_2` FOREIGN KEY (`PURCHASEpurchaseOrderNo`) REFERENCES `dhh_purchaseorder` (`purchaseOrderNo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_supplier
CREATE TABLE IF NOT EXISTS `dhh_supplier` (
  `supplierId` int(10) NOT NULL AUTO_INCREMENT,
  `address` varchar(50) NOT NULL,
  `postalCode` varchar(10) NOT NULL,
  `contactName` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phoneNo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`supplierId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_supplieringredient
CREATE TABLE IF NOT EXISTS `dhh_supplieringredient` (
  `SUPPLIERsupplierId` int(10) NOT NULL,
  `INGREDIENTingredientName` varchar(50) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  PRIMARY KEY (`SUPPLIERsupplierId`,`INGREDIENTingredientName`),
  KEY `SUPPLIERsupplierId` (`SUPPLIERsupplierId`),
  KEY `INGREDIENTingredientName` (`INGREDIENTingredientName`),
  CONSTRAINT `dhh_supplieringredient_ibfk_1` FOREIGN KEY (`INGREDIENTingredientName`) REFERENCES `dhh_ingredient` (`ingredientName`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dhh_supplieringredient_ibfk_2` FOREIGN KEY (`SUPPLIERsupplierId`) REFERENCES `dhh_supplier` (`supplierId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_supplierinventory
CREATE TABLE IF NOT EXISTS `dhh_supplierinventory` (
  `SUPPLIERsupplierId` int(10) NOT NULL,
  `INVENTORYinventoryName` varchar(50) NOT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`SUPPLIERsupplierId`,`INVENTORYinventoryName`),
  KEY `SUPPLIERsupplierId` (`SUPPLIERsupplierId`),
  KEY `INVENTORYinventoryName` (`INVENTORYinventoryName`),
  CONSTRAINT `dhh_supplierinventory_ibfk_1` FOREIGN KEY (`INVENTORYinventoryName`) REFERENCES `dhh_inventory` (`inventoryName`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dhh_supplierinventory_ibfk_2` FOREIGN KEY (`SUPPLIERsupplierId`) REFERENCES `dhh_supplier` (`supplierId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_table
CREATE TABLE IF NOT EXISTS `dhh_table` (
  `tableNo` int(10) NOT NULL AUTO_INCREMENT,
  `seats` int(10) NOT NULL,
  PRIMARY KEY (`tableNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table ivp4a1.dhh_workschedule
CREATE TABLE IF NOT EXISTS `dhh_workschedule` (
  `scheduleId` int(10) NOT NULL AUTO_INCREMENT,
  `startDatetime` datetime NOT NULL,
  `endDatetime` datetime NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `EMPLOYEEemployeeId` int(10) NOT NULL,
  PRIMARY KEY (`scheduleId`),
  KEY `EMPLOYEEemployeeId` (`EMPLOYEEemployeeId`),
  CONSTRAINT `dhh_workschedule_ibfk_1` FOREIGN KEY (`EMPLOYEEemployeeId`) REFERENCES `dhh_employee` (`employeeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
