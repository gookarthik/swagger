create table employee (
emp_id serial,
name varchar(50),
hierarchy varchar(50),
location varchar(50),
badge varchar(50),
time_off TIMESTAMP NOT NULL  DEFAULT (NOW() at time zone 'UTC'),
dispatched_date DATE,
leave varchar(255),
primary key(emp_id)
);

CREATE UNIQUE INDEX XPKemployee ON employee
(
  emp_id
);

create table pto(
pto_id serial,
start_date DATE,
end_date DATE,
hours TIMESTAMP NOT NULL  DEFAULT (NOW() at time zone 'UTC'),
type varchar(255),
status varchar(255),
emp_id INTEGER,
primary key(pto_id ),
CONSTRAINT R_1 FOREIGN KEY (emp_id) REFERENCES employee(emp_id)
);

CREATE UNIQUE INDEX XPKpto ON pto
(
  pto_id
);