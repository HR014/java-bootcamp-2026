Welcome to **Day 4** of your **Java Zero to Expert Bootcamp**.

Today is one of the **most important days** because you'll learn **Object-Oriented Programming (OOP)**. Nearly every Java interview and enterprise application relies on these concepts.

---

# 📖 Day 4 – Object-Oriented Programming (OOP)

## 🎯 Objectives

By the end of today, you'll understand:

* What OOP is
* Classes & Objects
* Constructors
* The `this` keyword
* Encapsulation
* Getters & Setters
* Static members
* Object arrays
* Building a real-world console application

---

# 🤔 Why OOP?

Imagine you're developing software for a company.

Without OOP:

```
Employee 1
Employee 2
Employee 3
Employee 4

Thousands of variables...
```

It becomes difficult to manage.

Instead, we create a **blueprint**.

```
Employee
    ↓
Employee 1
Employee 2
Employee 3
Employee 4
```

One blueprint can create thousands of employees.

That blueprint is called a **Class**.

---

# 🏗 Real-Life Example

Think about a car.

Every car has:

Properties

* Brand
* Color
* Speed
* Price

Actions

* Start
* Stop
* Accelerate
* Brake

In Java,

Car = Class

Your BMW = Object

---

# 📚 Class

A class is a blueprint.

```java
public class Student {

    String name;
    int age;

}
```

Nothing happens yet.

It only defines what a student looks like.

---

# 🎯 Object

Now create a real student.

```java
public class Main {

    public static void main(String[] args){

        Student s1 = new Student();

        s1.name = "Harsh";
        s1.age = 24;

        System.out.println(s1.name);
        System.out.println(s1.age);

    }

}
```

Output

```
Harsh
24
```

---

# 🧠 Memory Visualization

```
Student Class
---------------------
name
age

↓

Student Object

name = Harsh
age = 24
```

---

# ⚙ Constructors

A constructor automatically initializes objects.

Without constructor

```java
Student s = new Student();

s.name = "Harsh";
```

With constructor

```java
public class Student{

    String name;
    int age;

    Student(String name,int age){

        this.name = name;
        this.age = age;

    }

}
```

Create object

```java
Student s = new Student("Harsh",24);
```

Much cleaner.

---

# 🧠 The `this` Keyword

Look carefully.

```java
this.name = name;
```

Left side

```
Object variable
```

Right side

```
Parameter
```

`this` means

> "Use this object's variable."

---

# 🔒 Encapsulation

Never allow anyone to directly change important data.

Bad

```java
student.age = -100;
```

Instead

```java
private int age;
```

Use methods

```java
public void setAge(int age){

    if(age > 0){

        this.age = age;

    }

}
```

Read data

```java
public int getAge(){

    return age;

}
```

---

# 🔥 Static Keyword

Normal variable

Every object has its own copy.

Static variable

One copy for everyone.

Example

```java
class Student{

    static String college = "ABC College";

}
```

All students share the same college name.

---

# 📦 Object Array

Store multiple students.

```java
Student[] students = new Student[3];
```

Create objects

```java
students[0] = new Student("Harsh",24);
students[1] = new Student("Rahul",23);
students[2] = new Student("Ankit",22);
```

Loop

```java
for(Student s : students){

    System.out.println(s.name);

}
```

---

# 🏗 Mini Project 1

## Student Management

Features

```
Add Student

↓

Display Student

↓

Total Students
```

Concepts Used

* Class
* Object
* Constructor
* Array

---

# 🏗 Mini Project 2

Employee Management

Employee

```
ID

Name

Department

Salary
```

Operations

* Add Employee
* Display Employees
* Search Employee

---

# 🏗 Mini Project 3

Bank Account

Properties

```
Account Number

Name

Balance
```

Methods

```
Deposit()

Withdraw()

CheckBalance()
```

---

# 🎯 Challenge Project

## Library Management System (Version 1)

Book

```
Title

Author

Price

Book ID
```

Operations

```
Add Book

View Books

Search Book
```

This project combines everything from Days 1–4 and is a great milestone for your GitHub.

---

# 📝 Homework

Build these programs:

* Car Class
* Mobile Class
* Laptop Class
* Bank Account
* Employee Management
* Student Management
* Library Management

---

# 📂 GitHub Structure

```text
Day-04-OOP/
│
├── Student.java
├── Main.java
├── Car.java
├── Employee.java
├── BankAccount.java
├── Library.java
├── StudentManagement.java
└── README.md
```

---

# 📌 Git Commit

```bash
git add .
git commit -m "Day 4: Object-Oriented Programming - Classes, Objects, Constructors and Encapsulation"
git push origin main
```

---

# 🧠 Interview Questions

1. What is Object-Oriented Programming?
2. What is the difference between a class and an object?
3. What is a constructor?
4. Why do we use the `this` keyword?
5. What is encapsulation?
6. What is a static variable?
7. What is object initialization?
8. What are getters and setters?
9. Can a class have multiple constructors?
10. Why is Java called an object-oriented language?

---

## 🚀 Coming Tomorrow (Day 5)

We'll cover the **four pillars of OOP**, which are essential for enterprise Java development:

* Inheritance
* Polymorphism
* Abstraction
* Interfaces

We'll also build a larger **Hospital Management System** that uses these concepts together.

---

### 📘 Handbook Update

From tomorrow onward, I'll continue expanding the handbook with:

* Detailed explanations (not just summaries)
* High-quality diagrams
* Fully commented code
* Expected output for every example
* Practice exercises with solutions
* Professional formatting suitable for long-term reference

By the end of the complete course, you'll have a polished Java handbook and a GitHub repository that clearly demonstrates your progression from beginner to job-ready Java developer.
