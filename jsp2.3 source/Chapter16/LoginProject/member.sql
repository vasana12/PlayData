CREATE TABLE users(
     	id VARCHAR2(12) PRIMARY KEY,
     	passwd VARCHAR2(12),
     	addr VARCHAR2(50),
         age NUMBER,
     	email VARCHAR2(30),
         gender CHAR(1),
         name VARCHAR2(12),
     	nation VARCHAR2(16)
);
INSERT INTO users VALUES('java','java','�����',40,'aaa@aaa.com','M','������','���ѹα�');
COMMIT;
