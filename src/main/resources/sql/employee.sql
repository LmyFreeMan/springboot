

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------

CREATE TABLE if not exists  `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `employee` VALUES ('1', '张三', '2@it.com', '1', '2', '2020-03-01 00:00:00');
INSERT INTO `employee` VALUES ('2', '李四', '3@it.com', '1', '3', '2020-03-03 00:00:00');
INSERT INTO `employee` VALUES ('3', '王五', '3@qq.com', '1', '4', '2020-03-05 00:00:00');
INSERT INTO `employee` VALUES ('4', '赵六', '2515946609@qq.com', '0', '5', '2020-03-05 00:00:00');
