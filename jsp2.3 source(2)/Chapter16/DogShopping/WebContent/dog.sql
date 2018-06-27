CREATE TABLE dog(
	id NUMBER PRIMARY KEY,
	kind VARCHAR2(12) NOT NULL,
	price NUMBER NOT NULL,
	image VARCHAR2(20) NOT NULL,
	country VARCHAR2(12) NOT NULL,
	height NUMBER,
	weight NUMBER,
	content VARCHAR2(400),
	readcount NUMBER
);
CREATE SEQUENCE dog_seq;

INSERT INTO dog VALUES(dog_seq.nextval,'Ǫ��',1000,'pu.jpg','������',1,20,'�и���',0);
INSERT INTO dog VALUES(dog_seq.nextval,'�ҵ�',2000,'bul.jpg','����',1,20,'�������',0);
INSERT INTO dog VALUES(dog_seq.nextval,'������',3000,'jin.jpg','���ѹα�',1,20,'�ְ��',0);
INSERT INTO dog VALUES(dog_seq.nextval,'�㽺Ű',4000,'h.jpg','�ϱ�',1,20,'������',0);
COMMIT

