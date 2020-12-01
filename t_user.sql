/*
Navicat MySQL Data Transfer

Source Server         : daji
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : smbms

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-04-11 14:06:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(60) DEFAULT NULL,
  `password` varchar(150) DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', 'df655ad8d3229f3269fad2a8bab59b6c', '2017-09-13');
INSERT INTO `t_user` VALUES ('2', 'leng', '86db41fd79d23a9f6e7e31d0b3f95712', '2017-09-14');
INSERT INTO `t_user` VALUES ('4', 'adidas', '123456', '2018-01-27');
INSERT INTO `t_user` VALUES ('6', 'lining', '123456', '2018-01-24');
INSERT INTO `t_user` VALUES ('7', 'peak', '123456', '2018-01-20');
INSERT INTO `t_user` VALUES ('9', 'nike333', '123456', '2020-04-10');
INSERT INTO `t_user` VALUES ('18', '李邦', '123456', '2020-04-10');
