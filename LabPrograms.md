1)Make user define method to reverse the string
--------------------------------------------------
    import java.util.Scanner;

    public class StringReversal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Input the string from the user
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            
            // Call the reverseString method and print the result
            String reversedString = reverseString(inputString);
            System.out.println("Reversed String: " + reversedString);
            
            scanner.close();
        }

        // Method to reverse a string
        private static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }
    }


2)make user define method to find the length of the string
-----------------------------------------------------------
    import java.util.Scanner;

    public class StringLength {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the string from the user
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Call the findLength method and print the result
            int length = findLength(inputString);
            System.out.println("Length of the String: " + length);

            scanner.close();
        }

        // Method to find the length of a string
        private static int findLength(String str) {
            return str.length();
        }
    }

1)write a java program to find the minimum and maximum occuring character in a string
----------------------------------------------------------
    import java.util.Scanner;

    public class MinMaxOccurringCharacter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the string from the user
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Call the findMinMaxOccurringCharacter method and print the result
            char minChar = findMinMaxOccurringCharacter(inputString, true);
            char maxChar = findMinMaxOccurringCharacter(inputString, false);

            System.out.println("Minimum Occurring Character: " + minChar);
            System.out.println("Maximum Occurring Character: " + maxChar);

            scanner.close();
        }

        // Method to find the minimum or maximum occurring character in a string
        private static char findMinMaxOccurringCharacter(String str, boolean isMin) {
            int[] charCount = new int[256];

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                charCount[currentChar]++;
            }

            char resultChar = 0;
            int count = isMin ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            for (int i = 0; i < charCount.length; i++) {
                if ((isMin && charCount[i] > 0 && charCount[i] < count) ||
                    (!isMin && charCount[i] > count)) {
                    resultChar = (char) i;
                    count = charCount[i];
                }
            }

            return resultChar;
        }
    }


2)write a java program to check whether a given number is a peterson number or not
Ex. 145, 1!+4!+5! =145
**(without using inbuilt methods)
------------------------------------------------------------
    import java.util.Scanner;

    public class PetersonNumberCheck {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the number from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Call the isPetersonNumber method and print the result
            boolean isPeterson = isPetersonNumber(number);

            if (isPeterson) {
                System.out.println(number + " is a Peterson Number.");
            } else {
                System.out.println(number + " is not a Peterson Number.");
            }

            scanner.close();
        }

        // Method to check if a number is a Peterson Number
        private static boolean isPetersonNumber(int num) {
            int originalNum = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += factorial(digit);
                num /= 10;
            }

            return sum == originalNum;
        }

        // Method to calculate the factorial of a number
        private static int factorial(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }


1.
Write a java program to create a simple calculator. This calculator should perform +, -, *, /,
%.
----------------------------------------------------------------
    import java.util.Scanner;

    public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input two numbers and the operation from the user
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operation (+, -, *, /, %): ");
            char operation = scanner.next().charAt(0);

            // Call the performOperation method and print the result
            double result = performOperation(num1, num2, operation);
            System.out.println("Result: " + result);

            scanner.close();
        }

        // Method to perform the calculator operation
        private static double performOperation(double num1, double num2, char operation) {
            switch (operation) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        System.exit(0);
                    }
                case '%':
                    if (num2 != 0) {
                        return num1 % num2;
                    } else {
                        System.out.println("Cannot find modulus with zero.");
                        System.exit(0);
                    }
                default:
                    System.out.println("Invalid operation.");
                    System.exit(0);
                    return 0;
            }
        }
    }


2.
Write any program to create a matric class. Define a constructor to create a 3x3 matric
object. Also, defi ne a method to find the maximum elements in a given matrix and assemble
its position in the matrix.
note - position of element means its location in terms of row and column.
--------------------------------------------------------------

    public class Matrix {
        private int[][] matrix;

        // Constructor to create a 3x3 matrix
        public Matrix(int[][] values) {
            if (values.length == 3 && values[0].length == 3 &&
                values[1].length == 3 && values[2].length == 3) {
                matrix = values;
            } else {
                System.out.println("Invalid matrix dimensions. Matrix must be 3x3.");
                System.exit(0);
            }
        }

        // Method to find the maximum element and its position in the matrix
        public void findMaxElement() {
            int maxElement = matrix[0][0];
            int row = 0;
            int col = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > maxElement) {
                        maxElement = matrix[i][j];
                        row = i;
                        col = j;
                    }
                }
            }

            System.out.println("Maximum Element: " + maxElement);
            System.out.println("Position (Row, Column): (" + row + ", " + col + ")");
        }

        public static void main(String[] args) {
            int[][] matrixValues = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            Matrix matrix = new Matrix(matrixValues);
            matrix.findMaxElement();
        }
    }

3.
Write a java program to create ACCOUNT class and define constructor (s) and method for it.
Derive saving -ACCOUNT class from Account class and provide constructor of Account
class.
Make necessary assumption where required.
--------------------------------------------------
4.
Write a java program which create a class named Account and derive saving Account and
Fixed - Account access from it. Define appropriate Constructors and methods to access
account details.
----------------------------------------------------------
---------------------------------------------------------------
  
    import java.util.Scanner;

    class Account {
        private String accountNumber;
        private double balance;

        // Constructor for the Account class
        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Method to display account details
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    class SavingAccount extends Account {
        private double interestRate;

        // Constructor for the SavingAccount class
        public SavingAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        // Method to display saving account details
        public void displaySavingAccountDetails() {
            displayAccountDetails();
            System.out.println("Interest Rate: " + interestRate);
        }
    }

    class FixedAccount extends Account {
        private int tenure;

        // Constructor for the FixedAccount class
        public FixedAccount(String accountNumber, double balance, int tenure) {
            super(accountNumber, balance);
            this.tenure = tenure;
        }

        // Method to display fixed account details
        public void displayFixedAccountDetails() {
            displayAccountDetails();
            System.out.println("Tenure: " + tenure + " years");
        }
    }

    public class AccountTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input details for the account
            System.out.print("Enter Account Number: ");
            String accountNumber = scanner.next();

            System.out.print("Enter Initial Balance: ");
            double balance = scanner.nextDouble();

            // Create an Account object and display details
            Account account = new Account(accountNumber, balance);
            System.out.println("\nAccount Details:");
            account.displayAccountDetails();

            // Input details for the saving account
            System.out.print("\nEnter Interest Rate for Saving Account: ");
            double interestRate = scanner.nextDouble();

            // Create a SavingAccount object and display details
            SavingAccount savingAccount = new SavingAccount(accountNumber, balance, interestRate);
            System.out.println("\nSaving Account Details:");
            savingAccount.displaySavingAccountDetails();

            // Input details for the fixed account
            System.out.print("\nEnter Tenure for Fixed Account (in years): ");
            int tenure = scanner.nextInt();

            // Create a FixedAccount object and display details
            FixedAccount fixedAccount = new FixedAccount(accountNumber, balance, tenure);
            System.out.println("\nFixed Account Details:");
            fixedAccount.displayFixedAccountDetails();

            scanner.close();
        }
    }




1.
Write a java class with a private instance variable and a method that takes a parameter with
the same name as the instance variable. use the "this" keyword to differentiate between the
instance variable and the parameter.
------------------------------------------------------

    public class ExampleClass {
        private int variable;

        public void setVariable(int variable) {
            // Use "this" to differentiate between instance variable and parameter
            this.variable = variable;
        }

        public void displayVariable() {
            System.out.println("Instance Variable: " + this.variable);
        }

        public static void main(String[] args) {
            ExampleClass obj = new ExampleClass();
            obj.setVariable(42);
            obj.displayVariable();
        }
    }

2.
Create a java class with multiple constructors. Use ’this’ keyword to implement constructor
chaining, where one constructor calls another constructor with different parameter.
------------------------------------------------------

    public class ConstructorChaining {
        private int value;

        // Constructor with one parameter
        public ConstructorChaining(int value) {
            this.value = value;
        }

        // Constructor with two parameters, chaining to the first constructor
        public ConstructorChaining(int value1, int value2) {
            this(value1 + value2);
        }

        public void displayValue() {
            System.out.println("Value: " + this.value);
        }

        public static void main(String[] args) {
            ConstructorChaining obj1 = new ConstructorChaining(10);
            obj1.displayValue();

            ConstructorChaining obj2 = new ConstructorChaining(5, 7);
            obj2.displayValue();
        }
    }


3.
Design a class representing a geometric shape (e.g. Rectangle) with instance variables for
dimension
s. Implement a method that scales the dimensions by a factor and returns the current object
using the ’thi s’ keyword.
------------------------------------------------------

    public class GeometricShape {
        private double width;
        private double height;

        // Constructor
        public GeometricShape(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Method to scale dimensions by a factor using "this"
        public GeometricShape scaleDimensions(double factor) {
            this.width *= factor;
            this.height *= factor;
            return this;
        }

        public void displayDimensions() {
            System.out.println("Width: " + this.width);
            System.out.println("Height: " + this.height);
        }

        public static void main(String[] args) {
            GeometricShape rectangle = new GeometricShape(5.0, 8.0);
            System.out.println("Original Dimensions:");
            rectangle.displayDimensions();

            rectangle.scaleDimensions(1.5);
            System.out.println("\nScaled Dimensions:");
            rectangle.displayDimensions();
        }
    }

4.
Create a java class with both static and instance methods. Inside the instance method
demonstrate the use of ’this’ to access instance variable and invoke another instance
method.
------------------------------------------------------
    
    public class StaticInstanceMethods {
        private int instanceVariable;

        // Static method
        public static void staticMethod() {
            System.out.println("Static method");
        }

        // Instance method demonstrating the use of "this"
        public void instanceMethod(int value) {
            this.instanceVariable = value;
            System.out.println("Instance Variable: " + this.instanceVariable);
            this.anotherInstanceMethod();
        }

        // Another instance method invoked from the first instance method
        private void anotherInstanceMethod() {
            System.out.println("Another instance method");
        }

        public static void main(String[] args) {
            StaticInstanceMethods.staticMethod();

            StaticInstanceMethods obj = new StaticInstanceMethods();
            obj.instanceMethod(42);
        }
    }


5.
Define a class with a parameterized constructor and an instance method. Inside the method,
use ’this’ keyword to call the constructor and pass value. create an object of the class and
invoke the method.
------------------------------------------------------

    public class ConstructorWithMethod {
        private int value;

        // Parameterized constructor
        public ConstructorWithMethod(int value) {
            this.value = value;
        }

        // Instance method using "this" to call the constructor
        public void invokeMethod() {
            System.out.println("Instance Method - Value: " + this.value);
        }

        public static void main(String[] args) {
            ConstructorWithMethod obj = new ConstructorWithMethod(10);
            obj.invokeMethod();
        }
    }


4. Create a Java class with both static and instance methods. Inside the instance method,
demonstrate the use of this to access instance variables and invoke another instance
method.

------------------------------------------------------

    public class StaticInstanceMethods {
        private int instanceVariable;

        // Static method
        public static void staticMethod() {
            System.out.println("Static method");
        }

        // Instance method demonstrating the use of "this"
        public void instanceMethod(int value) {
            this.instanceVariable = value;
            System.out.println("Instance Variable: " + this.instanceVariable);
            this.anotherInstanceMethod();
        }

        // Another instance method invoked from the first instance method
        private void anotherInstanceMethod() {
            System.out.println("Another instance method");
        }

        public static void main(String[] args) {
            StaticInstanceMethods.staticMethod();

            StaticInstanceMethods obj = new StaticInstanceMethods();
            obj.instanceMethod(42);
        }
    }



5. Define a class with a parameterized constructor and an instance method. Inside the
method, use the this keyword to call the constructor and pass values. Create an object of the
class and invoke the method.
------------------------------------------------------

    public class ConstructorWithMethod {
        private int value;

        // Parameterized constructor
        public ConstructorWithMethod(int value) {
            this.value = value;
        }

        // Instance method using "this" to call the constructor and pass values
        public void invokeMethod(int newValue) {
            this.value = newValue;
            System.out.println("Updated Value: " + this.value);
        }

        public static void main(String[] args) {
            ConstructorWithMethod obj = new ConstructorWithMethod(10);
            obj.invokeMethod(20);
        }
    }


6. Define a class with an inner class. Inside the inner class, use the this keyword to refer to
the instance of the outer class. Demonstrate how this works in the context of inner classes.
A. Implement a copy constructor for a class that creates a new object with the same state as
another object. Use the this keyword to reference the current object and the passed object.
    
    public class OuterClass {
        private int outerVariable = 10;

        // Inner class
        class InnerClass {
            private int innerVariable = 20;

            // Method inside inner class using "this" to refer to the instance of the outer class
            public void displayOuterVariable() {
                System.out.println("Outer Variable from Inner Class: " + OuterClass.this.outerVariable);
            }
        }

        public static void main(String[] args) {
            OuterClass outerObj = new OuterClass();
            OuterClass.InnerClass innerObj = outerObj.new InnerClass();
            innerObj.displayOuterVariable();
        }
    }

8. Write a Java class with a static method and an instance method. Inside the instance
method, use the this keyword to refer to the current object. Discuss any observations or
errors that might
arise.
------------------------------------------------------

    public class CopyConstructorExample {
        private int value;

        // Parameterized constructor
        public CopyConstructorExample(int value) {
            this.value = value;
        }

        // Copy constructor using "this" to reference the current object and the passed object
        public CopyConstructorExample(CopyConstructorExample other) {
            this.value = other.value;
        }

        public void displayValue() {
            System.out.println("Value: " + this.value);
        }

        public static void main(String[] args) {
            CopyConstructorExample originalObj = new CopyConstructorExample(42);
            CopyConstructorExample copyObj = new CopyConstructorExample(originalObj);

            System.out.println("Original Object:");
            originalObj.displayValue();

            System.out.println("\nCopied Object:");
            copyObj.displayValue();
        }
    }


9. Write a recursive method in a class that uses the this keyword to call itself. The method
should perform an addition operation on the object's state
------------------------------------------------------


    public class RecursiveMethodExample {
        private int value;

        // Parameterized constructor
        public RecursiveMethodExample(int value) {
            this.value = value;
        }

        // Recursive method using "this" to call itself
        public void performAddition(int number) {
            this.value += number;

            if (number > 0) {
                // Recursive call
                this.performAddition(number - 1);
            }
        }

        public void displayValue() {
            System.out.println("Value: " + this.value);
        }

        public static void main(String[] args) {
            RecursiveMethodExample obj = new RecursiveMethodExample(0);
            obj.performAddition(5);
            obj.displayValue();
        }
    }

1. Demonstrate the use of the super keyword in Java, especially in a constructor.
------------------------------------------------------

    class Parent {
        int parentValue;

        // Parameterized constructor in the parent class
        Parent(int value) {
            this.parentValue = value;
        }
    }

    class Child extends Parent {
        int childValue;

        // Parameterized constructor in the child class using super to call the parent constructor
        Child(int parentValue, int childValue) {
            super(parentValue); // Calling the parameterized constructor of the parent class
            this.childValue = childValue;
        }

        public void displayValues() {
            System.out.println("Parent Value: " + parentValue);
            System.out.println("Child Value: " + childValue);
        }
    }

    public class SuperKeywordExample {
        public static void main(String[] args) {
            Child childObj = new Child(10, 20);
            childObj.displayValues();
        }
    }



2. Create a class hierarchy representing a university system with a base class Person and
subclasses Student and Professor. Add necessary attributes and methods.
------------------------------------------------------

    class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Other methods related to a person
    }

    class Student extends Person {
        int studentId;

        public Student(String name, int age, int studentId) {
            super(name, age);
            this.studentId = studentId;
        }

        // Other methods related to a student
    }

    class Professor extends Person {
        String department;

        public Professor(String name, int age, String department) {
            super(name, age);
            this.department = department;
        }

        // Other methods related to a professor
    }



3. Create a class hierarchy for geometric shapes. Define a base class Shape with
methods to calculate area and perimeter. Create subclasses for Circle, Rectangle, and
Triangle.
------------------------------------------------------

    abstract class Shape {
        abstract double calculateArea();
        abstract double calculatePerimeter();
    }

    class Circle extends Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    class Rectangle extends Shape {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double calculateArea() {
            return length * width;
        }

        @Override
        double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    class Triangle extends Shape {
        double side1;
        double side2;
        double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        double calculateArea() {
            // Implement the area calculation for a triangle
            return 0.0;
        }

        @Override
        double calculatePerimeter() {
            return side1 + side2 + side3;
        }
    }



4. Explain the concept of method overriding in Java with an example.
------------------------------------------------------

    class Animal {
        void makeSound() {
            System.out.println("Generic Animal Sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Bark");
        }
    }

    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow");
        }
    }

    public class MethodOverridingExample {
        public static void main(String[] args) {
            Animal animal1 = new Dog();
            Animal animal2 = new Cat();

            animal1.makeSound(); // Outputs "Bark" - method overridden in Dog class
            animal2.makeSound(); // Outputs "Meow" - method overridden in Cat class
        }
    }


5. Define a base class Animal with a method makeSound(). Create two subclasses Dog
and Cat that override the makeSound() method to print a specific sound.
------------------------------------------------------
    
    class Animal {
        void makeSound() {
            System.out.println("Generic Animal Sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Bark");
        }
    }

    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow");
        }
    }



6. Create a simulation of a transportation system with a base class Vehicle and
subclasses Car, Bus, and Bicycle. Implement methods for calculating fuel consumption,
capacity, and routes.
------------------------------------------------------

    class Vehicle {
        void calculateFuelConsumption() {
            System.out.println("Calculating fuel consumption for a generic vehicle");
        }

        void calculateCapacity() {
            System.out.println("Calculating capacity for a generic vehicle");
        }

        void planRoutes() {
            System.out.println("Planning routes for a generic vehicle");
        }
    }

    class Car extends Vehicle {
        // Additional methods or attributes specific to a Car
    }

    class Bus extends Vehicle {
        // Additional methods or attributes specific to a Bus
    }

    class Bicycle extends Vehicle {
        // Additional methods or attributes specific to a Bicycle
    }


7. Design a class hierarchy for a zoo management system. Include classes for Animal,
Mammal, Bird, and Reptile. Implement methods for feeding, breeding, and habitat
management.
------------------------------------------------------
    class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        void feed() {
            System.out.println("Feeding " + name);
        }
    }

    class Mammal extends Animal {
        Mammal(String name) {
            super(name);
        }

        void breed() {
            System.out.println("Mammal breeding");
        }
    }

    class Bird extends Animal {
        Bird(String name) {
            super(name);
        }

        void breed() {
            System.out.println("Bird nesting");
        }
    }

    class Reptile extends Animal {
        Reptile(String name) {
            super(name);
        }

        void breed() {
            System.out.println("Reptile egg-laying");
        }
    }
