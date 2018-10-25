CREATE SEQUENCE  SQ_CATG MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 10 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;

CREATE TABLE TB_CATG 
(
  ID_CATG NUMBER    (10) DEFAULT SQ_CATG.NEXTVAL NOT NULL 
, SG_CATG VARCHAR2  ( 5) NOT NULL 
, DS_CATG VARCHAR2  (20) 
, CONSTRAINT PK_TB_CATG_01 PRIMARY KEY ( ID_CATG ) ENABLE 
, CONSTRAINT UC_TB_CATG_01 UNIQUE ( SG_CATG ) ENABLE
);

COMMENT ON COLUMN TB_CATG.ID_CATG IS 'Identificador da categoria';
COMMENT ON COLUMN TB_CATG.SG_CATG IS 'Sigla da categoria';
COMMENT ON COLUMN TB_CATG.DS_CATG IS 'Descrição da categoria';
