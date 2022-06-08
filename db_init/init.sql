CREATE DATABASE spring_mvc_example;

\c spring_mvc_example

CREATE TABLE users
(
    user_id VARCHAR(50) primary key,
    user_name TEXT,
    birthday TEXT,
    email TEXT
);

INSERT INTO users VALUES ('1', 'user1', '2000/01/01', 'user1@example.com');
INSERT INTO users VALUES ('2', 'user2', '2000/02/01', 'user2@example.com');