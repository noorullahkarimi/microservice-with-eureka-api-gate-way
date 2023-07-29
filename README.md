
# microservice-with-eureka-api-gate-way

## Project description

I  tried to create a project best practice, for microservice that uses from the git repository for configuration,
 it is very simple project and it is just nessessory configuration.
 testing the eureka, api gatway, configuration and so on.

##  Directory structure

-   `api-gateway`: The api gateway for the routing the project url.
-   `microservice-with-eureka-api-gate-way`: Folder of eureka project.
-   `service-posts`: Folder of the service posts.
-   `service-users-1`: Folder of the instance 1 of service users ( for load balancer ). 
-   `service-users-2`: Folder of the instance 2 of service users ( for load balancer ).

## How to run :

Open every Folder with intelij IDEA sepratly, and let them to downlaod the dependencies with maven, ( if you can not download, use VPN ) now run the projects.
the sort of running services is : eureka, services( is not important which is first instance users 1 or 2 or posts) at the last step api-gateway service.

###  Prerequisites

-   intelij IDEA
-   java version 17



### final discuse
As I said befor it is just a practice and for the learning, so do not use this for real project, of course in future I will put some real project in, 
actully microservice are configuration and all the other code will be like the before.
thanks for support :))

# update tag 2.0.0

## Project description(for update v2.0.0)

The project dockerized and you can run it on your system with docker . 
Also some feature like zipkin added to this project 

###  Prerequisites(for update v2.0.0)

-  Docker
-  Internet Connection ( somewhere need VPN also )

### How To Run on Docker

At the first clone the project. Next, open the cmd for every folder ( service ), then type the command 
"mvn clean verify -DskipTests". This command will create image for every service, the "-DskipTests" is ignore the tests, if you want to run test also, so remove it .
Then go to the root folder of this project and open the CMD and run the command "docker-compose up --build -d"
it run the project on docker and you can see the project. 

### Links

The link below shows you the zipkin service, this service track all request:
http://localhost:9411/zipkin/

The eureka link, it register all service: 
http://localhost:8761/dashboard

