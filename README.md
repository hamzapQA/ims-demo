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
 
 When the program is started, it will ask for a username and password. These are the credentials for your SQL database. 
 
Once logged in, you will be provided with options such as Customer, Order, Orderline and Stop.
 
When selecting any of the options, you will be provided with (Create/Read/Update/Delete) options. These can be selected by typing the corresponding command.

Download the JAR, and change to the working directory and run the following command:

```
java -jar HamzaIMS-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

Once the program loads it will ask for a username and password, these are your MySQL database credentials.

```
What is your username
> root
What is your password
> root
```
After the credentials have been entered, the menu will appear:

```
Welcome to IMS! Please type an option?
CUSTOMER: Information about customers
ITEM: Individual Items
ORDER: Generate an Order
ORDERLINE: Add items and total order
STOP: To close the application 
```
## Running the tests

The project comes with automated tests which make use of JUnit and Mockito. Tests are organised into classes to test functionality. Test files are stored in src/test/java instead of an individual test class.

### Unit Tests 

Unit tests are used to ensure code works correctly and to protect against bugs. This makes use of JUnit and tests the functionality of the  Customer, Item and Order classes as well as functionality of some of the DAO classes. 

Here is an example of a Unit Test:

	@Test
	public void setFirstNameTest() {
		Customer customer = new Customer("John", "Jones");
		customer.setFirstName("John");
		assertTrue(customer.getFirstName().equals("John"));
	}

To run the tests, right click on the project folder - "Run As JUnit Test"


### Integration Tests 
Integration Tests make use of Mockito and aure used to test functionality of classes and controllers, domain and actions. Here is an example of a integration test to test the functionality of the create() method in CustomerController:
```	
	@Test
	public void testCreate() {
		final String F_NAME = "john", L_NAME = "jones";
		final Customer created = new Customer(F_NAME, L_NAME);

		Mockito.when(utils.getString()).thenReturn(F_NAME, L_NAME);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}
```

## Deployment

To deploy this project on a live system, you can use the included jar file "HamzaIMS-0.0.1-SNAPSHOT-jar-with-dependencies.jar".

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
