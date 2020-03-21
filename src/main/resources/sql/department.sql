

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
CREATE TABLE if not exists  `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `department` VALUES ('2', '新媒体');
INSERT INTO `department` VALUES ('3', '技术部');
INSERT INTO `department` VALUES ('4', '传媒部');
INSERT INTO `department` VALUES ('5', '研发部');
INSERT INTO `department` VALUES ('6', '产品部');
INSERT INTO `department` VALUES ('7', '文化部');
INSERT INTO `department` VALUES ('9', '测试部');
