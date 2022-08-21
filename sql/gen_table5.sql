/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.28 : Database - front_end_hello
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`front_end_hello` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `front_end_hello`;

/*Table structure for table `api_record` */

CREATE TABLE `api_record` (
  `user_id` varchar(50) NOT NULL,
  `api_method` varchar(30) DEFAULT NULL,
  `api_url` varchar(300) DEFAULT NULL,
  `api_status` int DEFAULT NULL,
  `api_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `cors_err` */

CREATE TABLE `cors_err` (
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `err_msg` varchar(400) DEFAULT NULL,
  `err_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `http_err` */

CREATE TABLE `http_err` (
  `user_id` varchar(50) DEFAULT NULL,
  `err_url` varchar(300) DEFAULT NULL,
  `err_body` text,
  `err_status` int DEFAULT NULL,
  `err_time` datetime DEFAULT NULL,
  `err_response` text,
  `err_method` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `js_err` */

CREATE TABLE `js_err` (
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `err_msg` varchar(300) DEFAULT NULL,
  `err_type` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `page_view` */

CREATE TABLE `page_view` (
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `route_path` varchar(300) DEFAULT NULL,
  `page_duration` float DEFAULT NULL,
  `pv_time` datetime DEFAULT NULL,
  `user_ip` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `promise_error` */

CREATE TABLE `promise_error` (
  `user_id` varchar(50) DEFAULT NULL,
  `err_msg` varchar(500) DEFAULT NULL,
  `err_type` varchar(100) DEFAULT NULL,
  `err_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `res_err` */

CREATE TABLE `res_err` (
  `user_id` varchar(50) DEFAULT NULL,
  `err_src` varchar(300) DEFAULT NULL,
  `err_html` varchar(500) DEFAULT NULL,
  `err_type` varchar(100) DEFAULT NULL,
  `err_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `user_id_and_secret` */

CREATE TABLE `user_id_and_secret` (
  `device_id` varchar(50) DEFAULT NULL COMMENT '一个用户一个秘钥,一个秘钥对应多个appId',
  `user_id` varchar(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `user_mo` */

CREATE TABLE `user_mo` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `web_pref` */

CREATE TABLE `web_pref` (
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `pref_fp` float DEFAULT NULL,
  `pref_tti` float DEFAULT NULL,
  `pref_dom_ready` float DEFAULT NULL,
  `pref_load` float DEFAULT NULL,
  `pref_first_byte` float DEFAULT NULL,
  `pref_dns` float DEFAULT NULL,
  `pref_tcp` float DEFAULT NULL,
  `pref_ssl` float DEFAULT NULL,
  `pref_ttfb` float DEFAULT NULL,
  `pref_trans` float DEFAULT NULL,
  `pref_dom_parse` float DEFAULT NULL,
  `pref_res` float DEFAULT NULL,
  `pref_cls` float DEFAULT NULL,
  `pref_fcp` float DEFAULT NULL,
  `pref_fid` float DEFAULT NULL,
  `pref_lcp` float DEFAULT NULL,
  `report_time` datetime DEFAULT NULL,
  KEY `pref_FP` (`pref_fp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `web_resource` */

CREATE TABLE `web_resource` (
  `user_id` varchar(50) DEFAULT NULL,
  `res_src` varchar(300) DEFAULT NULL,
  `res_trans_size` int DEFAULT NULL,
  `res_type` varchar(40) DEFAULT NULL,
  `res_duration` int DEFAULT NULL,
  `res_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
