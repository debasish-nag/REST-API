# REST-API


clone the repositery in your local drive

from the repositary local drive please run the  below command from command promt.

--To build the project

mvn clean package

--To run the application

java -jar ./target/rest-api-0.0.1-SNAPSHOT.jar


-- View all the employess --

Http : GET

http://localhost:8080/employee


-- view specific employee --

Http : GET

http://localhost:8080/employee/{employeeID}

http://localhost:8080/employee/4


-- add new employee --

Http: POST

http://localhost:8080/employee

Body :
{
    "name": "avi",
	"address" : "sego",
	"salary": "34567"
}

-- update employee --

Http: PUT

http://localhost:8080/employee

Body :
{
    "empId": 4,
    "name": "svii",
    "address": "nag",
    "salary": 34567
}

you can update name,address and salary .


-- delete specific employee -- 

Http : DELETE

http://localhost:8080/employee/{employeeID}

http://localhost:8080/employee/4
