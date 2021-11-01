# Spring-Boot-Microservices

“Microservices, in a nutshell, allows us to break our large system into a number of independent collaborating components.”

![](https://github.com/YashzAlphaGeek/Spring-Boot-Microservices/blob/main/images/Microservice_Architecture.png)

# Simple Microservice Application Procedure
![](https://github.com/YashzAlphaGeek/Spring-Boot-Microservices/blob/main/images/Procedure.png)

## Microservices

+ Microservices is a variant of the service-oriented architecture (SOA) architectural style that structures an application as a collection of loosely coupled services.
+ Each running in its own process and communicating with lightweight mechanisms, often an HTTP resource API.

## Service Registry

+ Clients of a service use either Client-side discovery or Server-side discovery to determine the location of a service instance to which to send requests.
+ Service instances are registered with the service registry on startup and deregistered on shutdown.

## API Gateway

+ API Gateway is a server that is the single-entry point into the system
+ API gateway availability requires a load balancer that can provide flexibility to cope with rapid changes in microservices, such as versioning and dynamically shifting scale.

## Hystrix Dashboard

+ A Hystrix system provides such data as a stream of JSON documents via HTTP. The Hystrix Dashboard can visualize the data in a web interface. The dashboard presents all Circuit Breakers along with the number of requests and their state (open/closed)

## Config Server

+ Central configuration server provides configurations (properties) to each micro service connected
+ With the Config Server you have a central place to manage external properties for applications across all environments.” Basically, a config server allows you to externally store variables your application will need to run in all environments, regardless of lifecycle, and update them in one, centralized place.

## Zipkin Server

+ Zipkin is very efficient tool for distributed tracing in microservices ecosystem.
+ It helps gather timing data needed to troubleshoot latency problems in service architectures

# Current Running Server Instance in Eureka
![](https://github.com/YashzAlphaGeek/Spring-Boot-Microservices/blob/main/images/Instances.png)

# Zipkin Server
![](https://github.com/YashzAlphaGeek/Spring-Boot-Microservices/blob/main/images/Zipkin_Server.png)


Notes:
How To Change Port of Tomcat in Eclipse : https://www.java67.com/2019/07/spring-boot-3-ways-to-change-port-of-tomcat.html
Running of Zipkin Server in CMD : java -jar zipkin-server-2.23.4-exec.jar












