/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : youyoudb

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2012-01-30 11:51:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `theme`
-- ----------------------------
DROP TABLE IF EXISTS `theme`;
CREATE TABLE `theme` (
`themeId`  int(11) NOT NULL DEFAULT 0 ,
`name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
PRIMARY KEY (`themeId`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of theme
-- ----------------------------
BEGIN;
INSERT INTO `theme` VALUES ('0', 'default'), ('1', 'red');
COMMIT;

-- ----------------------------
-- Table structure for `twitter`
-- ----------------------------
DROP TABLE IF EXISTS `twitter`;
CREATE TABLE `twitter` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`userId`  int(11) NOT NULL ,
`content`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`cTime`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
PRIMARY KEY (`id`),
FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `user_twitter` (`userId`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=117

;

-- ----------------------------
-- Records of twitter
-- ----------------------------
BEGIN;
INSERT INTO `twitter` VALUES ('113', '7', 'hello  i am a dream', '2012-01-30 00:22:17'), ('114', '7', ' 你好吗  我向您', '2012-01-29 12:42:45'), ('115', '7', 'hello', '2012-01-29 12:50:50'), ('116', '7', 'a twitter from dream', '2012-01-29 13:44:40');
COMMIT;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
`id`  int(20) NOT NULL AUTO_INCREMENT ,
`email`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`name`  varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pwd`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`man`  bit(1) NOT NULL ,
`cTime`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
`themeId`  int(11) NOT NULL DEFAULT 0 ,
`concernMeNum`  int(11) NOT NULL DEFAULT 0 ,
`twitterNumIPublish`  int(11) NOT NULL DEFAULT 0 ,
PRIMARY KEY (`id`),
FOREIGN KEY (`themeId`) REFERENCES `theme` (`themeId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
UNIQUE INDEX `email_unique` (`email`) USING BTREE ,
INDEX `user_theme` (`themeId`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=9

;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('7', 'dream@gmail.com', 'dreamdream', '71dab208dde4aa3f0eeba0684249f5c3', '', '2012-01-29 13:47:46', '0', '0', '0'), ('8', 'woshishagua@gmail.com', 'woshishagua', '7ed75c4dc70dd777db7d0589202743c5', '', '2012-01-30 07:53:34', '0', '0', '0');
COMMIT;

-- ----------------------------
-- Table structure for `userrelation`
-- ----------------------------
DROP TABLE IF EXISTS `userrelation`;
CREATE TABLE `userrelation` (
`publisherId`  int(11) NOT NULL ,
`observerId`  int(11) NOT NULL ,
`cTime`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
PRIMARY KEY (`publisherId`, `observerId`),
FOREIGN KEY (`publisherId`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`observerId`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `observerId` (`observerId`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of userrelation
-- ----------------------------
BEGIN;
INSERT INTO `userrelation` VALUES ('7', '7', '2012-01-29 13:48:51'), ('7', '8', '2012-01-30 07:54:22');
COMMIT;

-- ----------------------------
-- Auto increment value for `twitter`
-- ----------------------------
ALTER TABLE `twitter` AUTO_INCREMENT=117;

-- ----------------------------
-- Auto increment value for `user`
-- ----------------------------
ALTER TABLE `user` AUTO_INCREMENT=9;
