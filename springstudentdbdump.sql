CREATE DATABASE `springstudents` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;


CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NOT NULL,
  `course_instructor` varchar(255) DEFAULT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `springstudents`.`student`
(`id`,
`course_id`,
`course_instructor`,
`course_name`,
`email_address`,
`name`,
`phone`)
VALUES (5, 115, 'Mr. Ramsey', 'Artificial Intelligence','Tony.Rachford@gmail.com', 'Tony Rachford', '515-345-8976');


