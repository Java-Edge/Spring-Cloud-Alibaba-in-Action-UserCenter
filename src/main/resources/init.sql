create database user_center;

use user_center;
USE `user_center`;

-- -----------------------------------------------------
-- Table `user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `user` (
                                      `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Id',
                                      `wx_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '微信id',
                                      `wx_nickname` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '微信昵称',
                                      `roles` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '角色',
                                      `avatar_url` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '头像地址',
                                      `create_time` DATETIME NOT NULL COMMENT '创建时间',
                                      `update_time` DATETIME NOT NULL COMMENT '修改时间',
                                      `bonus` INT NOT NULL DEFAULT 300 COMMENT '积分',
                                      PRIMARY KEY (`id`))
    COMMENT = '分享';


-- -----------------------------------------------------
-- Table `bonus_event_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bonus_event_log` (
                                                 `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Id',
                                                 `user_id` INT NULL COMMENT 'user.id',
                                                 `value` INT NULL COMMENT '积分操作值',
                                                 `event` VARCHAR(20) NULL COMMENT '发生的事件',
                                                 `create_time` DATETIME NULL COMMENT '创建时间',
                                                 `description` VARCHAR(100) NULL COMMENT '描述',
                                                 PRIMARY KEY (`id`),
                                                 INDEX `fk_bonus_event_log_user1_idx` (`user_id` ASC) )
    ENGINE = InnoDB
    COMMENT = '积分变更记录表';