-- auto Generated on 2019-02-27 15:23:17 
-- DROP TABLE IF EXISTS `silk_data_dist`; 
CREATE TABLE silk_data_dist(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `dict_key` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '����KEY',
    `dict_val` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '����VALUE',
    `remark` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '����',
    `sort` BIGINT NOT NULL DEFAULT -1 COMMENT '����',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'silk_data_dist';