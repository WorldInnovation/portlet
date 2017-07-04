create table Department (
	Department_id LONG not null primary key,
	Department_name VARCHAR(75) null
);

create table Employee (
	Employee_id LONG not null primary key,
	birthday DATE null,
	eMail VARCHAR(75) null,
	firstName VARCHAR(75) null,
	secondName VARCHAR(75) null,
	grade INTEGER,
	depID LONG
);