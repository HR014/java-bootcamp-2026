# ☕ Java Bootcamp 2026

# 📖 Day 5 – The Four Pillars of OOP (Enterprise Java)

Welcome to **Day 5**.

Today you'll learn the concepts that make Java one of the most powerful programming languages for enterprise software. Companies like banks, ERP providers, and large organizations use these ideas every day.

By the end of today, you'll understand:

* Inheritance
* Method Overriding
* Polymorphism
* Abstraction
* Interfaces
* Abstract Classes
* The `super` keyword
* `final` keyword
* Real-world enterprise design

---

# 🏢 Why OOP Exists

Imagine you're building software for a company.

The company has:

```
Employee

↓

Manager

↓

Developer

↓

Tester
```

All employees have:

* Name
* ID
* Salary

But every role also has unique responsibilities.

Instead of writing the same code again and again, Java lets us reuse it.

This is called **Inheritance**.

---

# 1️⃣ Inheritance

## What is Inheritance?

Inheritance means

> One class acquires properties and methods of another class.

Think about your family.

```
Father

↓

Son
```

The son inherits many characteristics.

Java works the same way.

---

## Example

```java
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

}
```

Child class

```java
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }

}
```

Main class

```java
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();

        dog.bark();

    }

}
```

Output

```
Animal is eating

Dog is barking
```

Notice:

Dog can use

* bark()
* eat()

because it inherited from Animal.

---

# Types of Inheritance

```
Single

Animal
   ↓
 Dog
```

```
Multilevel

Animal
   ↓
 Dog
   ↓
 Puppy
```

```
Hierarchical

          Animal
         /      \
      Dog      Cat
```

(Java doesn't support multiple inheritance using classes.)

---

# 2️⃣ Method Overriding

Suppose every employee works differently.

Parent

```java
class Employee {

    void work() {

        System.out.println("Employee works");

    }

}
```

Child

```java
class Developer extends Employee {

    @Override
    void work() {

        System.out.println("Developer writes code");

    }

}
```

Now

```
Developer writes code
```

instead of

```
Employee works
```

This is called **Method Overriding**.

---

# 3️⃣ Polymorphism

Meaning

> One thing can have many forms.

Example

You tell different people

```
Work()
```

Developer

↓

Writes Code

Tester

↓

Tests Software

Manager

↓

Manages Team

Same method.

Different behavior.

---

Example

```java
Employee emp;

emp = new Developer();

emp.work();

emp = new Tester();

emp.work();
```

Same variable.

Different outputs.

---

# 4️⃣ The `super` Keyword

Sometimes we want to use the parent class constructor.

Parent

```java
class Animal {

    Animal() {

        System.out.println("Animal Created");

    }

}
```

Child

```java
class Dog extends Animal {

    Dog() {

        super();

        System.out.println("Dog Created");

    }

}
```

Output

```
Animal Created

Dog Created
```

---

# 5️⃣ Abstract Class

Suppose every vehicle must start.

But every vehicle starts differently.

Car

↓

Bike

↓

Truck

Parent

```java
abstract class Vehicle {

    abstract void start();

}
```

Child

```java
class Car extends Vehicle {

    void start() {

        System.out.println("Car starts with key");

    }

}
```

You cannot create an object of an abstract class.

---

# 6️⃣ Interface

An interface is like a contract.

Imagine you're building payment software.

Every payment system must implement:

```
Pay()

Refund()

Cancel()
```

Interface

```java
interface Payment {

    void pay();

}
```

Implementation

```java
class UPI implements Payment {

    public void pay() {

        System.out.println("Paid using UPI");

    }

}
```

Another

```java
class CreditCard implements Payment {

    public void pay() {

        System.out.println("Paid using Credit Card");

    }

}
```

Same interface.

Different implementation.

---

# Abstract Class vs Interface

| Abstract Class               | Interface                                         |
| ---------------------------- | ------------------------------------------------- |
| Can have implemented methods | Methods are typically declared for implementation |
| Uses `extends`               | Uses `implements`                                 |
| Supports constructors        | No constructors                                   |
| Single inheritance           | A class can implement multiple interfaces         |

---

# The `final` Keyword

```java
final int AGE = 24;
```

Cannot change.

```
AGE = 25 ❌
```

Final method

Cannot override.

Final class

Cannot inherit.

---

# 🏗 Mini Project 1

## Hospital Management System

Classes

```
Person

↓

Doctor

↓

Patient

↓

Receptionist
```

Features

* Name

* Age

* Department

* Appointment

* Display Details

---

# 🏗 Mini Project 2

## Payment Gateway

Interface

```
Payment
```

Implementations

```
UPI

Credit Card

Net Banking

Wallet
```

Method

```
pay()
```

---

# 🏗 Mini Project 3

## Employee Management

Parent

```
Employee
```

Child

```
Developer

Tester

Manager
```

Method

```
work()
```

Each class prints different work.

---

# 🏗 Challenge Project

## Online Shopping System

Classes

```
Product

Customer

Order
```

Inheritance

```
Product

↓

Electronics

↓

Mobile

↓

Laptop
```

Interface

```
Payment
```

Implement

```
UPI

Card

Wallet
```

---

# 📂 GitHub Structure

```text
Day-05-OOP-Advanced/

├── Animal.java
├── Dog.java
├── Employee.java
├── Developer.java
├── Tester.java
├── Vehicle.java
├── Car.java
├── Payment.java
├── UPI.java
├── CreditCard.java
├── HospitalManagement.java
├── OnlineShoppingSystem.java
└── README.md
```

---

# 📝 Homework

Build these programs:

1. Animal Inheritance
2. Employee Management
3. Hospital Management
4. Online Shopping System
5. Payment Gateway
6. Banking System using Interfaces
7. Vehicle Management using Abstract Classes

---

# 💡 Interview Questions

1. What is inheritance?
2. What is the difference between inheritance and composition?
3. What is method overriding?
4. What is polymorphism?
5. What is runtime polymorphism?
6. What is compile-time polymorphism?
7. What is an abstract class?
8. What is an interface?
9. Difference between abstract class and interface?
10. What is the `super` keyword?
11. What is the `final` keyword?
12. Why is Java called an object-oriented language?

---

# 📌 Git Commit

```bash
git add .
git commit -m "Day 5: Inheritance, Polymorphism, Abstraction and Interfaces"
git push origin main
```

# 🎯 End of Day 5 Milestone

At this point, you have learned:

* ✅ Java Basics
* ✅ Variables & Data Types
* ✅ User Input
* ✅ Conditions & Loops
* ✅ Methods
* ✅ Arrays
* ✅ Classes & Objects
* ✅ Constructors
* ✅ Encapsulation
* ✅ Inheritance
* ✅ Polymorphism
* ✅ Abstraction
* ✅ Interfaces

These are the core concepts expected from an entry-level Java developer.

## 📘 Handbook Improvement

From **Day 6 onward**, I'll make the handbook much richer. Instead of concise notes, each chapter will include:

* Detailed explanations for every concept.
* Step-by-step code walkthroughs explaining each line.
* Memory diagrams and object-flow illustrations.
* Common errors and debugging tips.
* Interview insights and best practices.
* Real-world enterprise examples.
* Exercises with solutions.

The goal is to make it a professional Java handbook you can continue using even after you start your software engineering career.
