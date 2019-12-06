CREATE DATABASE service_emulaton;
use service_emulaton;

drop table if exists weather;
create table weather (
     city_code varchar(3) primary key not null,
     temperature varchar(3)
);

drop table if exists location ;
create table location (
      zipCode varchar(2) primary key not null,
      local_time varchar(5)
);