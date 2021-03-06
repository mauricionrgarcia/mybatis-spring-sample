CREATE SEQUENCE  SQ_CUST MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 10 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;

CREATE TABLE TB_CUST 
(
  ID_CUST NUMBER    (10) DEFAULT SQ_CUST.NEXTVAL
, NM_CUST VARCHAR2  (50) 
, ID_CATG NUMBER    (10)
) 
;

COMMENT ON COLUMN TB_CUST.ID_CUST IS 'Identificador do cliente';
COMMENT ON COLUMN TB_CUST.NM_CUST IS 'Nome do cliente';
COMMENT ON COLUMN TB_CUST.ID_CATG IS 'Identificador da categoria';


ALTER TABLE TB_CUST ADD CONSTRAINT TB_CUST_PK PRIMARY KEY (ID_CUST);
ALTER TABLE TB_CUST ADD CONSTRAINT TB_CUST_FK_01 FOREIGN KEY (ID_CATG) REFERENCES TB_CATG(ID_CATG);
