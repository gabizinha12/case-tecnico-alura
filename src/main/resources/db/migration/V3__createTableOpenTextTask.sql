CREATE TABLE  OpenTextTask(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    description varchar(255) NOT NULL,
    type enum('OPEN_TEXT', 'MULTIPLE_CHOICE','SINGLE_CHOICE') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT 'OPEN_TEXT',
    task_order int NOT NULL,
    courseId int NOT NULL,
    PRIMARY KEY (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;