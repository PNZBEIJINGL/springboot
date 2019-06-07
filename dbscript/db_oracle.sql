-- Create table
create table USEREN
(
  ID       NUMBER not null,
  CODE     VARCHAR2(50),
  NAME     VARCHAR2(50),
  CREATEDT DATE
)
tablespace USERS
