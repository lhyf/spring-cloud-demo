/*
 Navicat Premium Data Transfer

 Source Server         : 本机MySQL
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : 127.0.0.1:3306
 Source Schema         : admin-cloud

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 04/05/2019 22:52:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept`  (
  `dept_no` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `d_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `db_source` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`dept_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES (1, '开发部', 'admin-cloud');
INSERT INTO `t_dept` VALUES (2, '财务部', 'admin-cloud');
INSERT INTO `t_dept` VALUES (3, '人事部', 'admin-cloud');
INSERT INTO `t_dept` VALUES (4, '市场部', 'admin-cloud');
INSERT INTO `t_dept` VALUES (5, '运营部', 'admin-cloud');

SET FOREIGN_KEY_CHECKS = 1;
