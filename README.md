# LearningJava
This portfolio showcases the Java projects that I have developed while learning 

## Projects

### first_steps
Collection of topics and examples of the basic Java syntax

### bytebank
Small application to emulate a bank environment. It contains both the bank internal system and external systems. Here, I applied my knowledge of Object Oriented Programming, Heritage, Composition, Interfaces and Exceptions.
**Stack:**
- IDE: Eclipse 2023-03
- Java: 17

### mongodb_java
Project to interact with MongoDB. Actions performed:
- Connect with DB;
- List all documents inside a collection;
- Include document in a collection;
- Remove document from colletion;
- Update document inside a collection;
- Disconnect from DB.
**Stack:**
- Maven
- IDE: Eclipse 2023-03
- Java: 17
- MongoDB: 6.0
**Requirements:**
Add MongoDB driver and BSON dependencies to Maven pom.xml file, as bellow:
``` xml
<project>
	[...]
<dependencies>
    <dependency>
        <groupId>org.mongodb</groupId>
        <artifactId>mongodb-driver-sync</artifactId>
        <version>4.9.1</version>
    </dependency>
    
    <dependency>
	<groupId>org.mongodb</groupId>
	<artifactId>bson</artifactId>
	<version>4.9.1</version>
</dependency>
</dependencies>
</project>
```
