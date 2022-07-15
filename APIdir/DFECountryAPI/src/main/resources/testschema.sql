DROP TABLE IF EXISTS `Country`;

CREATE TABLE `Country` (
	`id` BIGINT AUTO_INCREMENT,
	`country_name` VARCHAR(255) NOT NULL, 
	`capital_city` VARCHAR(255) NOT NULL,
	`official_language` VARCHAR(255) NOT NULL,
	`population_size` INT NOT NULL,
	`gross_domestic_product` VARCHAR(255) NOT NULL,
	PRIMARY KEY(`id`)
	
); 