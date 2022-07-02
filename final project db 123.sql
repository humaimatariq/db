create database OnlineHouseHoldService;
use  OnlineHouseHoldService;
create table Services(idServices INT primary key not null auto_increment ,name varchar(1000),description varchar(2000));
create table Register(idUser INT primary Key not null auto_increment,firstname varchar(45),lastname varchar(45),location varchar(45),username varchar(45)
,email varchar(45),password varchar(45),confirmpassword varchar(45));
create table Worker(idWorker INT primary key not null auto_increment,idUser int ,idServices Int ,name varchar(45),contactNo INT ,rating INT ,
CONSTRAINT 	Worker_FK1 FOREIGN KEY auto_increment(idServices) REFERENCES Services(idServices),
CONSTRAINT 	Worker_FK2 FOREIGN KEY auto_increment(idUser) REFERENCES Register(idUser));
create table Request(idRequest int primary key not null auto_increment,idUser int,urgent varchar(45),
constraint Request_fk foreign key(idUser) references Register(idUser));
create table Booking(idBook int primary key not null auto_increment,idRequest int ,idWorker int,reportTime varchar(45),payment int,
constraint Booking_fk1 foreign key(idWorker) references Worker(idWorker),constraint Booking_fk2 foreign key(idRequest) references Request(idRequest));
create table PaymentDetails(idBook int,transactionDetails varchar(45),
constraint PaymentDetails_fk foreign key(idBook) references Booking(idBook));
insert into Services(name,description)values("plumbing","Cut, assemble and install pipes and tubes with attention to existing infrastructure (e.g. electrical wiring)
 Install and maintain water supply systems. Locate and repair issues with water supply lines (e.g. leaks) 
 Repair or replace broken drainage lines, clogged drains, faucets etc."),
("Electrician","Installs and repairs electrical wiring, systems, and fixtures in buildings. 
Installs conduits and pipes to house electrical wires and cables. Ensures piping complies with electrical codes.
 Installs circuit breakers and other electrical hardware and connects wiring to them."),("Painting","applying paint on the interior and exterior surfaces,
 removing old paint, selecting materials, mixing colors, filling holes, sealing corners, 
 consulting with clients or customers, and leaving the work site clean."),("Tailor","Tailors are responsible for constructing
 , altering, repairing, or modifying garments for customers
 based on their specifications, needs, and preferences. 
 They take customers' measurements, 
 assist in fabric selection, and 
 arrange fittings to determine whether additional adjustments are needed."),("Cleaning","Cleaning, stocking and supplying designated facility areas
 (dusting, sweeping, vacuuming, mopping, cleaning ceiling vents, restroom cleaning etc) Performing and documenting routine inspection and maintenance activities.
 Carry out heavy cleaning tasks and special projects.");
select * from services;
insert into Register(name,contactNo,location)values('Ali',0312,'abc colony'),('Ahmed',0345,'def colony'),('Ayesha',099,'sabz colony'),('Kainat',0456,'banda colony'),('zunaira',086374,"xyz colony");
select * from register;
insert into Worker (idUser,idServices,name,contactNo,rating)values(1,2,"salfaraz",08937,4),(2,1,"usman",08367,3),(3,5,"rehman",09273747,5),(4,4,"Bukhtayar",0312667387,4),(5,3,"Saif",0345267498,0);
select * from worker;
insert into Request(idUser,urgent)values(1,"yes"),(2,"no"),(3,"yes"),(4,"no");
select * from request;
insert into Booking(idRequest,idWorker,reportTime,payment)values(1,1,curtime(),2000),(2,2,curtime(),1000),(3,3,current_time(),1500),(4,4,curtime(),5000),(4,4,curtime(),1200);
select * from booking;
insert into PaymentDetails(idBook,transactionDetails)values(1,"credit card"),(2,"credit card"),(3,"credit card"),(4,"credit card");
select * from PaymentDetails;

