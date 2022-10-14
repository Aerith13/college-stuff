/*CREATE database IT114_ESGUERRA;

CREATE TABLE publisher (
    NAME VARCHAR(20),
    PHONE INT NOT NULL,
    ADDRESS VARCHAR(20),
    PRIMARY KEY (NAME)
);

CREATE TABLE book (
    BOOK_ID INT,
    TITLE VARCHAR(20),
    PUB_YEAR VARCHAR(20),
    PUBLISHER_NAME VARCHAR(20),
    PRIMARY KEY (BOOK_ID)
);

CREATE TABLE library_branch (
    BRANCH_ID INT,
    BRANCH_NAME VARCHAR(50),
    address VARCHAR(50),
    PRIMARY KEY (BRANCH_ID)
);

CREATE TABLE bookcopies (
    NO_OF_COPIES INT,
    BRANCH_ID INT,
    BOOK_ID INT,
    FOREIGN KEY (BOOK_ID)
        REFERENCES BOOK (BOOK_ID),
    FOREIGN KEY (BRANCH_ID)
        REFERENCES library_branch (BRANCH_ID)
);

CREATE TABLE card (
    CARD_NO INT,
    PRIMARY KEY (CARD_NO)
);

CREATE TABLE BOOK_LENDING (
    DATE_OUT DATE,
    DUE_DATE DATE,
    BOOK_ID INT,
    CARD_NO INT,
    FOREIGN KEY (BOOK_ID)
        REFERENCES BOOK (BOOK_ID),
    FOREIGN KEY (BOOK_ID)
        REFERENCES library_branch (BRANCH_ID),
    FOREIGN KEY (CARD_NO)
        REFERENCES CARD (CARD_NO)
);
*/
ALTER TABLE book ADD ISBN VARCHAR(10);
ALTER TABLE book ADD author varchar(100);
ALTER TABLE book change COLUMN author bookAuthor varchar(100);
ALTER TABLE book MODIFY TITLE varchar(20);