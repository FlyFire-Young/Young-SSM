CREATE TABLE user(
    id int primary key not null auto_increment,
    name char(20) default '1',
    customerid int not null default 0,
    age int not null default 0
);