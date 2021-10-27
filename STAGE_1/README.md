___
**Questions**
* What is used for auditing?  - Hive?

___ 
**Reading Topics**
* Spring uses EVCache
  * UIDs within a set expiry time window are only processed once in that period
___

**Stack to implement**
___

* Microservice - Spring Boot - Netflix OSS
  * https://www.pentalog.com/blog/it-development-technology/microservices-spring-boot-netflix-oss
* Dockerise to run locally
  * Add Graphite + Grafana containers

* Kafka
  * Netflix embraces Apache Kafka® as the de-facto standard for its eventing, messaging, and stream processing
  * https://www.confluent.co.uk/blog/how-kafka-is-used-by-netflix/
  * https://www.meritdata-tech.com/resources/blog/digital-engineering-solutions/netflix-apache-kafka-business-intelligence/
* RESTful API
* Ribbon
  * Primarily provides client-side load balancing algorithms.
  * https://www.baeldung.com/spring-cloud-rest-client-with-netflix-ribbon
  * https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-ribbon.html
* Feign
  * https://www.baeldung.com/intro-to-feign
* Hystrix 
  * Spring Cloud Netflix Hystrix – the fault tolerance library
  * Implement the Circuit Breaker enterprise pattern, which is describing a strategy against failure cascading at different levels in an application.
  * https://www.baeldung.com/spring-cloud-netflix-hystrix
* ElasticSearch
  * for keyword search
* Docker
* TDD
* JUnit
* Mockito
  * Mocking responses
* Gradle
  * Perf testing framework
* Kibana
* Grafana 
  * Dashboard / Alerting tool
* Graphite
  * https://grafana.com/docs/grafana/latest/datasources/graphite/
* GitOps

___

**Microservices Pros/Cons**

**Microservices’ Advantages**
* Reduced complexity of an application by dividing it into smaller problems. (Divide et Impera)
* Calls for independent, flexible teams free to choose the best technology stack that best suits them and the product.
* Easily integrated with CI/CD environments.
* Can be scaled independently. So, if the business needs just one feature to be scaled, microservices can scale just that part – not the entire monolith.
* When a bug occurs, it will affect just one or a few systems – instead of the entire application.

**Microservices’ Disadvantages:**
* Added complexity with inter-service communication, separated database pattern & testing.
* Harder Database transactions, because changes need to be made in databases owned by multiple services.
  * The transaction of generating invoice to storing it, and recording the invoice highlights the issue raised in the app feedback  
  * **2021-09-01** : Complained that a sent invoice was deleted by the app, only discovered when incoming invoice was not matched
    * Needs to save the invoice, confirm invoice is saved successfully before attempting sending out the invoice
* Testing can be more difficult.
* Harder to implement changes across multiple modules because of coordination across multiple teams.
* Deploying is harder because there are multiple binaries, but this process is made easier with modern cloud infrastructures.



LinkedIn Tech Stacks Mentioned
<HR>

* Liam McAllister - Product Owner at Mettle
  * on-boarding funnel
  * OKR framework
    * What's OKR?

* Abolade Omole - Quality Assurance Engineer at Mettle
  * Tools:
    JIRA / Confluence, Postman, Git, Webdriver-IO, Docker, IntelliJ Idea, Visual Studio, Android Studio, X-Code, SQL

* Richard George - Developer at Mettle
  * Java 11, Micronaut, Kafka, CQRS, Event Sourcing, Kubernetes
  - BO - Kotlin, Java 11, http4k, Ratpack, jOOQ, Kubernetes


* Vladimir ṖȦṘṠḢÌḲỌṾ
  * Responsible for leading the cross-functional product team focused on onboarding customers Areas of focus include the customer lifecycle and onboarding, across web and mobile (iOS and Android).
  * The system uses event-sourced Spring Boot microservices on top of Kafka, deployed to Kubernetes with Docker, using Concourse for Continuous Deployment and is entirely GitOps based.
  * Notable aspects of the system include:
    - Quality assured continuous deployment - code merged to master is deployed through to production without manual intervention.
    - Contract / Performance testing in the pipeline with Pact / Gatling
    - CQRS event-sourced microservice design
  * Technical environment: 
    * Java 11 
    * SpringBoot
    * Spring Cloud 
    * Netflix stack   
      * https://www.zype.com/blog/netflix-tech-stack
      * https://netflix.github.io/
      * https://spring.io/projects/spring-cloud-netflix
      * https://github.com/spring-cloud/spring-cloud-netflix#contributing
      * https://cloud.spring.io/spring-cloud-netflix/2.0.x/single/spring-cloud-netflix.html
      * https://dzone.com/articles/the-netflix-stack-using-spring-boot-part-3-feign
    * Kafka
    * RESTful API
    * Ribbon
    * Feign => 
    * Hystrix => 
    * ElasticSearch
    * Docker
    * TDD
    * JUnit
    * Mockito
    * Gradle
    * Git
    * IntelliJ
    * Kibana
    * Jira
    * Grafana
    * Graphite
    * GitOps