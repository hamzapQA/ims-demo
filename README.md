Coverage: 63%

# IMS - Inventory Management System

IMS is an application developed in Java/MySQL which provides CRUD (Create/Read/Update/Delete) functionalities relating to an ordering system.
This application allows the user to perform a variety of tasks with Customers, Products and Orders.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

In order to succesfully execute this program, there are a number of dependencies which will need to be installed. These are:

```
1. Programming IDE (this is developed in Eclipse)
2. JDK version 14
3. MySQL database running on localhost
4. Maven Dependency (if not using Eclipse as IDE)
```

### Installing



This is a step by step guide on how to get the project up and running on your local machine for development and testing. 

1. Navigate to the folder in which you would like to set up the project.
2. Clone the repository using this command:

```
git clone https://github.com/hamzapQA/ims-demo.git
```

3. Import the project into your IDE. For Eclipse, 
```
 a) Select File, then Import
 b) When the Import window appears, select Maven then Existing Maven Projects
 c) Now select Browse and navigate to the folder the repo has been cloned.
 d) Click finish, done!
 ```
 ## Project Functionality
 
 This section provides a brief description on the functionality of the application.
 
 When the program is started, it will ask for a username and password. These are the credentials for your localhost SQL database. 
 
 Once logged in, you will be provided with options such as Customer, Order, Orderline and Stop.
 
 When selecting any of the options, you will be provided with (Create/Read/Update/Delete) options. These can be selected by typing the corresponding command.

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Unit tests make use of JUnit and test the functionality of the  Customer, Item and Order classes as well as functionality of some of the DAO classes. 

Explain what these tests test, why and how to run them

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them


mockito

Give an example
```


## Deployment

To deploy this project on a live system, you can use the included jar file "HamzaIMS-0.0.1-SNAPSHOT-jar-with-dependencies.

### And coding style tests

Explain what these tests test and why

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Hamza Pervez** - *Project Completion* - [hamzapQA](https://github.com/hamzapQA)

* **RafSobolQAC** - *Initial work* - [RafSobolQAC](https://github.com/RafSobolQAC/ims-demo)

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments


* Nick, Aswene and Vinesh for amazing Java concepts, help and support.
* QA-Community
* Team Trap
* GitHub
* Hat tip to anyone whose code was used
