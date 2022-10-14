CREATE DATABASE IT114_ESGUERRA;

CREATE TABLE PUBLISHER
(NAME varchar(20),
PHONE integer,
ADDRESS varchar(20),
primary key(NAME)
);

CREATE TABLE BOOK(
BOOK_ID integer,
TITLE varchar(20),
PUB_YEAR varchar(20),
PUBLISHER_NAME varchar(20),
primary key(BOOK_ID)
);

CREATE TABLE LIBRARY_BRANCH(
BRANCH_ID integer,
BRANCH_NAME varchar(50),
ADDRESS varchar(50),
primary key(BRANCH_ID)
);

CREATE TABLE BOOK_COPIES(
NO_OF_COPIES integer,
BOOK_ID integer,
BRANCH_ID integer,
foreign key (BRANCH_ID) references LIBRARY_BRANCH (BRANCH_ID)
);

CREATE TABLE CARD(
CARD_NO integer,
primary key(CARD_NO)
);

CREATE TABLE BOOK_LENDING(
DATE_OUT date,
DUE_OUT date,
BOOK_ID integer,
BRANCH_ID integer,
CARD_NO integer,
foreign key (BOOK_ID) references BOOK (BOOK_ID),
foreign key (BRANCH_ID) references LIBRARY_BRANCH (BRANCH_ID),
foreign key (CARD_NO) references CARD (CARD_NO)
);

create table BOOK_AUTHORS(
AUTHOR_NAME varchar(50),
BOOK_ID int,
foreign key (BOOK_ID) references BOOK (BOOK_ID) 
);

ALTER TABLE BOOK ADD ISBN varchar(10);
ALTER TABLE BOOK ADD author varchar(100);
ALTER TABLE BOOK change column author bookauthor varchar(100);
ALTER TABLE BOOK MODIFY TITLE varchar(50);
ALTER TABLE BOOK ;

create table BOOK_AUTHORS(
AUTHOR_NAME varchar(50),
BOOK_ID int,
foreign key (BOOK_ID) references BOOK (BOOK_ID) 
);

INSERT INTO PUBLISHER
values('Course Technology',1,'USA'), 
('Delmar Learning',5,'PHILIPPINES'),
('Nelson Engineering',3,'INDIA');

INSERT INTO PUBLISHER (NAME,PHONE) values ('PEARSON',4),
('Technical Publisher',6);

INSERT INTO PUBLISHER 
values ('dsworth',2,'JAPAN');

insert into BOOK (BOOK_ID,TITLE,PUB_YEAR,PUBLISHER_NAME)
values (1,'Programming 1',2020,'Course Technology'),
(2,'Database System',2021,'Course Technology');

insert into BOOK (BOOK_ID,TITLE,PUB_YEAR,PUBLISHER_NAME)
values (3,'Introduction to Web development',2019,'Delmar training'),
(4,'System Analysis and Design',2018,'PEARSON'),
(5,'HTML CSS',2020,'Technical Publishers');

INSERT INTO book_authors 
values ('JAMES',1),('MICHAEL',2),
('NAP',3),('ESTRELLA',4),('NAP',5);

INSERT INTO library_branch 
VALUES (1,'CFL','MMSU-Batac City'),
(2,'CTE','MMSU-LAOAG'),
(3,'LHS','MMSU-Laoag');

INSERT INTO book_copies 
VALUES (5,1,2),(5,5,3);

INSERT INTO CARD VALUES (100),(101),(102),(103),(104);

UPDATE publisher SET ADDRESS = '"Netherlands"' WHERE NAME = 'PEARSON';

UPDATE publisher SET ADDRESS = 'United Kingdom' WHERE NAME = 'Technical Publihers';

UPDATE publisher SET NAME = 'Technical Publishers' WHERE NAME = 'Technical Publihers';
