create database filehiderproject;
use filehiderproject;

create table users(
	id int primary key auto_increment, 
    name varchar(30), 
    email varchar(50) unique
);

desc users;

create table data(
	id int primary key auto_increment,
    name varchar(100),
    path varchar(255),
    email varchar(50), 
    bin_data blob
);

desc data;