# Waga Speed Test
Spring Boot, Hibernate, MySQL



# Getting started

* You need java 8, maven >3.2, MySQL >5.6 to run this project. The example instructions therefore assume you have them on your classpath and that you have MySQL running
* The default mysql user is "root" with password "root" .
* You can change the mysql user in src/main/resources/application.properties
* The default port is set to 8080. You can also change this in the properties file mentioned above



# Example Running Jar File Directly with embedded tomcat
```
$ mvn clean install
$ ./target/waga_norrey-0.0.1-SNAPSHOT.jar 

```


# Endpoints
```
/persons/{person_id}/house      ->  Retrieve the house of the specified person
/children/{child_id}/info     -> Retrieve the information about the given child
/children/{child_id}/color     -> Retrieve the color of the child
/persons/children       -> Retrieve the summary statistics

```

#Accessing Jacoco Test Coverage

* After clean install above, test coverage can be found in target/site/jacoco/index.html

#Accessing Management Endpoints

* You can access actuator endpoits /metrics, /env, /trace, /auditevents, /health, etc. Security for these endpoints is disabled for tests


# Todo

* Reduce complexity of summarizing scheduler to use Spring Batch
* Rest Docs  - Add rest docs api and connect with integration tests to provide up to date documentation of the api's
