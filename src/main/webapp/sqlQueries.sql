drop table customers;
create table customers(
	customername varchar(255) not null,
	email varchar(255) not null,
	countrycode varchar(7) not null,
	mobilenumber varchar(15) not null,
	addressline1 varchar(255) not null,
	addressline2 varchar(255) ,
	landmark varchar(255),
	city varchar(100) not null,
	state_provience_region varchar(100) not null,
	zip_postal_code varchar(10) not null,
	country varchar(56) not null,
	userid varchar(20) primary key,
	password varchar(255) not null,
	mailoption boolean not null default false,
	notificationoption boolean NOT NULL default false,
	accountstatus varchar(8)  NOT NULL default 'active',
	addtimestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	updatetimstamp timestamp DEFAULT CURRENT_TIMESTAMP,
	
	constraint accountstatus_chk check(accountstatus in('active','inactive')),
	constraint password_length check(length(password) >5),
	constraint userid_length check(length(userid) >4),
	constraint zip_length check(length(zip_postal_code) >3)
	);
DROP TABLE OFFICERS;
create table Officers(
	officerid varchar(30) primary key,
	password varchar(255) not null,
	accountstatus varchar(8)  NOT NULL default 'active',
	addtimestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	updatetimstamp timestamp DEFAULT CURRENT_TIMESTAMP,
	
	constraint status_chk_office check(accountstatus in('active','inactive')),
	constraint office_password_length check(length(password) >5),
	constraint office_id_length check(length(officerid) >5)
);
drop table bookings;
CREATE TABLE bookings(
	bookingid bigint primary key,
	Rec_addressline1 varchar(255) not null,
	Rec_addressline2 varchar(255) ,
	Rec_landmark varchar(255),
	Rec_city varchar(100) not null,
	Rec_state_provience_region varchar(100) not null,
	Rec_zip_postal_code varchar(10) not null,
	Rec_country varchar(56) not null,
	Rec_mobilenumber varchar(15) not null,
	Par_weight double not null,
	Par_contents_Description varchar(255),
	Parcel_delivery_Type varchar(50) not null,
	Par_Packing_Preference varchar(50) not null,
	Par_PickupTime varchar(30) not null,
	Par_DropoffTime varchar(30) not null,
	Par_ServiceCost double not null,
	Par_PaymentTime timestamp not null,
	Par_status varchar(30) not null,
	userid varchar(20) references customers(userid),
	bookingtime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	updatetime timestamp DEFAULT CURRENT_TIMESTAMP,
	
	constraint Par_status check(Par_status in ('Booked','In Transit','Delivered','Returned')),
	constraint Par_DropoffTime check(Par_DropoffTime in	('8AM-11AM','11AM-2PM','2PM-5PM','5PM-8PM')),
	constraint Par_PickupTime check(Par_PickupTime in ('8AM-11AM','11AM-2PM','2PM-5PM','5PM-8PM')),
	constraint Par_Packing_Preference check(Par_Packing_Preference in ('Eco-friendly','Corrugagated Box','Padded',
	'Mailing Tube','Bubble Wrap','Foam Inserts','Oversized Box','Custom Printed Box','Inflatable Air Pillows')),
	constraint Par_delivery_type check(Parcel_Delivery_Type in('Checkin Freight','Local delivery or pickup',
			'International shipping','Overnight shipping','Priority Mail','Domestic shipping','Standard Delivery'))
);

SELECT * FROM CUSTOMERS;
select * from OFFICERS;
select * from bookings;