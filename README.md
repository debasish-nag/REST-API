# REST-API

 ## dated 30-8-2019   ##
new requested URL for delte, create , update and rest of otehrs are same

--delete--

http://localhost:8080/employee/delete/{employeeID}

-- create--

http://localhost:8080/employee/create

Body : { "name": "avi", "age" : "38", "salary": "34567" }

--update --

http://localhost:8080/employee/update

Body : { "id": 4, "name": "svii", "age": "38", "salary": 34567 }




###################################################################


clone the repositery in your local drive

from the repositary local drive please run the  below command from command promt.

--To build the project

mvn clean package

--To run the application

java -jar ./target/rest-api-0.0.1-SNAPSHOT.jar


for payment API 

AUTHENTICATION is not enabled 

http://localhost:8080/payment

PUT - > 
    {
        "paymentID": 1,
        "marchenCode": "MC001",
        "payementType": "Deposit",
        "paymentMethod": "VISA",
        "transcationAmount": 234
    }
POST ->

 {
        "marchenCode": "MC001",
        "payementType": "Deposit",
        "paymentMethod": "VISA",
        "transcationAmount": 234
    }


rest of the application will work as the employee does

Http : GET

http://localhost:8080/payment/{paymentID}

http://localhost:8080/payment/1


Http : DELETE

http://localhost:8080/payment/{paymentID}

http://localhost:8080/payment/4



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


