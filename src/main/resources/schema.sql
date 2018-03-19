/**
 * Author:  Norrey Okumu <okumu.norrey@gmail.com>
 * Created: Mar 19, 2018
 */

CREATE SCHEMA IF NOT EXISTS test_db_norrey /*!40100 DEFAULT CHARACTER SET latin1 */;


-- SET MODE MYSQL;


DROP TABLE IF EXISTS meal;
DROP TABLE IF EXISTS child;
DROP TABLE IF EXISTS person;
DROP TABLE IF EXISTS parent_summary;
DROP TABLE IF EXISTS house;

CREATE TABLE `house` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `house_type` int(2) DEFAULT NULL,
  `zip_code` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;


CREATE TABLE `parent_summary` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `num_children` int(4) DEFAULT NULL,
  `num_parents` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;


CREATE TABLE `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `name` varchar(80) DEFAULT NULL,
  `house_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6fe2v09hiovxvythi1tpg0igb` (`house_id`),
  CONSTRAINT `FK6fe2v09hiovxvythi1tpg0igb` FOREIGN KEY (`house_id`) REFERENCES `house` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;



CREATE TABLE `child` (
  `child_type` int(2) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(3) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `bicycle_color` varchar(40) DEFAULT NULL,
  `hair_color` varchar(40) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo11vo1p67t0u4wb7q7jtayng6` (`parent_id`),
  CONSTRAINT `FKo11vo1p67t0u4wb7q7jtayng6` FOREIGN KEY (`parent_id`) REFERENCES `person` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;



CREATE TABLE `meal` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `invented` datetime DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `priority` int(3) NOT NULL,
  `child_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKd0sxs4nsl4453i1w45rayufex` (`child_id`),
  CONSTRAINT `FKd0sxs4nsl4453i1w45rayufex` FOREIGN KEY (`child_id`) REFERENCES `child` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

