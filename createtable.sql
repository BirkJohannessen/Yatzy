DROP SCHEMA IF EXISTS yatzy CASCADE;
CREATE SCHEMA yatzy;
SET search_path = yatzy;
 
 CREATE TABLE spill
(
    spillID VARCHAR(20) NOT NULL,
    spillere VARCHAR(48) NOT NULL,
    constraint pk_spillID primary key(spillID)
);

CREATE TABLE spiller
(
    mobil VARCHAR(20) NOT NULL,
    fornavn VARCHAR(20) NOT NULL,
    etternavn VARCHAR(20) NOT NULL,
    passord VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    adminAccess Boolean NOT NULL
);

CREATE TABLE spillverdier
(
	spillID VARCHAR(20) NOT NULL,
	mobil VARCHAR(20) NOT NULL,
	index0 INT,
	index1 INT,
	index2 INT,
	index3 INT,
	index4 INT,
	index5 INT,
	index6 INT,
	index7 INT,
	index8 INT,
	index9 INT,
	index10 INT,
	index11 INT,
	index12 INT,
	index13 INT,
	index14 INT,
    CONSTRAINT pk_spill_values_id primary key(spill_values_id),
	CONSTRAINT fk_spillID foreign key(spillID) REFERENCES spill(spillID)
);

insert into
 spiller(mobil, fornavn, etternavn, passord, email, adminAccess)
 VALUES
 ('95772111','Birk','Johannessen','123','Birk.johannessen@hotmail.com',true),
 ('95772333', 'Anine', 'Hammersborg', '123','anine.hammersborg@hotmail.com',false),
 ('95772444','AM','Gjerdalen','123','am.gjerdalen@hotmail.com',false),
 ('95772555','Simen','hauge', '123','simen.hauge@hotmail.com',false);


insert into
spill(spillID, spillere)
VALUES
('1234567','9577211195772333')

insert into
spillverdier(spillID,mobil)
VALUES
('1234567','9572111'),
('1234567','9572333')

 