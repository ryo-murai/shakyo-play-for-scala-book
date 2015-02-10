CREATE TABLE Product (
  ean bigserial not null primary key,
  name varchar(64) not null,
  description varchar(128)
);
