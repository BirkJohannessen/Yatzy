DROP SCHEMA IF EXISTS yatzy CASCADE;
CREATE SCHEMA yatzy;
SET search_path = yatzy;

CREATE type mobilType
(
	mobil CHARACTER VARYING (20)
);

CREATE TABLE spill
(
    spillID CHARACTER VARYING (20) NOT NULL,
    mobil mobilType NOT NULL,
);

CREATE TABLE spiller_spill_m2m
(
    mobil CHARACTER VARYING (20) NOT NULL,
    spillID CHARACTER VARYING (20) NOT NULL,
    PRIMARY KEY(mobil, spillID)
    CONSTRAINT fk_mobil FOREIGN KEY(mobil) REFERENCES spiller(mobil)
    CONSTRAINT fk_spillID FOREIGN KEY(spillID) REFERENCES spill(spillID)
);

CREATE TABLE spiller
(
    mobil CHARACTER VARYING (20) NOT NULL,
    fornavn CHARACTER VARYING (20) NOT NULL,
    etternavn CHARACTER VARYING (20) NOT NULL,
    passord CHARACTER VARYING (256) NOT NULL,
    email CHARACTER VARYING (50) NOT NULL,
    adminAccess Boolean NOT NULL,
	spillID CHARACTER VARYING (20) NOT NULL,
);
CREATE TABLE spillverdier
(
	spill_values_id CHARACTER VARYING (20) NOT NULL,
	spillID CHARACTER VARYING (20) NOT NULL,
	mobil CHARACTER VARYING (20) NOT NULL,
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
    CONSTRAINT pk_spill_values_id primary key(spill_values_id)
	CONSTRAINT fk_spillID foreign key(spillID) REFERENCES spill(spillID)
);


insert into
spill(spillID, mobil)
VALUES
 ('123456',95772111,95772333,95772444)

insert into
 spiller(mobil, fornavn, etternavn, passord, email, adminAccess)
 VALUES
 ('95772111','Birk','Johannessen','123','Birk.johannessen@hotmail.com',true),
 ('95772333', 'Anine', 'Hammersborg', '123','anine.hammersborg@hotmail.com',false),
 ('95772444','AM','Gjerdalen','123','am.gjerdalen@hotmail.com',false),
 ('95772555','Simen','hauge', '123','simen.hauge@hotmail.com',false);