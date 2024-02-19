# java-programming
Java learning programming exercise and notes.
Topics
- [Basics of Java](#java-basics)
- Data Types 
- Conditions 
- Functions
- Loops
- Data Structures
- OOPs, Interfaces, Classes
- Packages
- Exception Handling 
- File Handling 
- Collection Framework
- Threads
- GUI
- [Naming Convention in Java](#naming-convention-in-java)

## Java Basics
let's Builds Some Basics Concept of Java.

What is Java ??
Java is High Level, General Purpose, Obejct Oriented Programming Language.

High Level Language - Similar to english language. Easy to understand and more readable.

General Purpose - It is free and open source programming language.

## Naming Convention in Java

- [Class](#classes-naming-conventions)
- [Variables](#variables-naming-conventions)
- [Packages](#packages-naming-conventions)

Classes naming conventions
------------------------------

Class names should be `nouns` in `UpperCamelCase` (in mixed case with the first letter of each internal word capitalized). Try to keep your class names simple and descriptive.

Example:

    class Employee
    class Student
    class EmployeeDao
    class CompanyService

Packages naming conventions
-----------------------------
A package should be named in lowercase characters. There should be only one English word after each dot.

The prefix of a `unique package name` is always written in all-lowercase ASCII letters and should be one of the top-level domain names, like com, edu, gov, mil, net, org.

Example:

    package org.springframework.core.convert;
    package org.hibernate.criterion;
    package org.springframework.boot.actuate.audit;
    package org.apache.tools.ant.dispatch;


Interfaces naming conventions
------------------------------

In Java, interfaces names, generally, should be `adjectives`. Interfaces should be in titlecase with the first letter of each separate word capitalized. 

In some cases, interfaces can be nouns as well when they present a family of classes e.g. List and Map.

    Runnable
    Remote
    ActionListener


Methods naming conventions
---------------------------
Methods always should be `verbs`. They represent action and the method name should clearly state the action they perform. The method name can be single or 2-3 words as needed to clearly represent the action. Words should be in camel case notation.
Examples:
    public List <Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
More Examples:

    getName()
    computeTotalWidth()
    actionPerformed()
    main()
    print()
    println()

Variables naming conventions
----------------------------
The variable name should start with a lowercase letter. Parameter names, member variable names, and local variable names should be written in `lowerCamelCase`.

Example:

    firstName
    orderNumber
    lastName
    phoneNo
    id
    counter
    temp


Constants naming conventions
-----------------------------
Constant variable names should be written in `upper characters` `separated by underscores`. These names should be semantically complete and clear.

Example:

    RED, YELLOW, MAX_PRIORITY, MAX_STOCK_COUNT

Abstract classes naming conventions
-----------------------------------
Abstract class is class name must start with Abstract or Base prefix. This naming convention can vary from organization to organization.

Example:

    AbstractHibernateDao
    AbstractCommonDao
    AbstractBase
Let's take an example from the Spring Framework:

    AbstractBean
    AbstractBeanDefinition
    AbstractUrlBasedView
    AbstractIdentifiable

Exception classes naming conventions
------------------------------------
the naming conventions used for custom Exception class is class name must end with Exception suffix. 

Example:
    TransactionException
    SQLDataException
    ResourceNotFountException
    ResourceAlreadyExistException

Java core packages.

    ArithmeticException
    ArrayIndexOutOfBoundsException
    ArrayIndexOutOfBoundsException


Enumeration naming conventions
------------------------------
Enum Class members should be spelled out in upper case words, separated by underlines. 

Example:

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY;
    }

Generic types naming conventions
----------------------------------
Generic type parameter names should be `uppercase` single letters. The letter 'T' for a type is typically recommended. In JDK classes, `E` is used for `collection` elements, `S` is used for `service` loaders, and `K` and `V` are used for map `keys` and `values`.

    public interface Map <K,V> {}
    
    public interface List<E> extends Collection<E> {}
    
    Iterator<E> iterator() {}
----------------------------------------------------------------

Some Content Credits : JavaTpoint, GFG, tutorialspoint, javaguides.net,mygreatlearning

Note : This is for educational purpose and copyright is belongs to its respective owner.

----------------------------------------------------------------