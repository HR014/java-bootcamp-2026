
**📄 [Java_Bootcamp_2026_Days_1_to_3.docx]**

---

# ☕ Day 3 – Methods & Arrays

## 🎯 Today's Goals

By the end of Day 3, you'll understand:

* What methods (functions) are
* Method parameters
* Return values
* Method overloading
* Arrays
* Enhanced `for` loop
* Linear search
* Building larger programs by splitting code into methods

---

## 📂 Folder Structure

```text
Day-03-Methods-Arrays/
│
├── MethodsDemo.java
├── CalculatorMethods.java
├── GreetingMethod.java
├── ReturnExample.java
├── MethodOverloading.java
├── ArraysDemo.java
├── StudentMarks.java
├── MaximumNumber.java
├── LinearSearch.java
├── ContactBook.java
└── README.md
```

---

## 1. Methods

A **method** is a reusable block of code.

Example:

```java
public static void greet() {
    System.out.println("Welcome to Java!");
}
```

Calling it:

```java
greet();
```

---

## 2. Methods with Parameters

```java
public static void greet(String name) {
    System.out.println("Welcome " + name);
}
```

Call:

```java
greet("Harsh");
```

---

## 3. Return Values

```java
public static int add(int a, int b) {
    return a + b;
}
```

Use it:

```java
int answer = add(20, 10);
System.out.println(answer);
```

---

## 4. Method Overloading

```java
add(int a, int b)
add(double a, double b)
```

Java chooses the correct method based on the arguments.

---

## 5. Arrays

Store multiple values in one variable.

```java
int[] marks = {85, 90, 78, 95, 88};
```

Access:

```java
System.out.println(marks[0]);
```

---

## 6. Loop Through an Array

```java
for(int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

Enhanced `for` loop:

```java
for(int mark : marks) {
    System.out.println(mark);
}
```

---

## 7. Find the Maximum Number

```java
int max = marks[0];

for(int mark : marks) {
    if(mark > max) {
        max = mark;
    }
}

System.out.println(max);
```

---

## 8. Linear Search

Search for a value in an array.

```java
int target = 95;

for(int mark : marks) {
    if(mark == target) {
        System.out.println("Found");
    }
}
```

---

# 🛠 Mini Projects

* Greeting Application using methods
* Calculator using methods
* Student Marks Analyzer
* Maximum & Minimum Finder
* Contact Book using arrays

---

# 📝 Homework

1. Reverse an array
2. Find the average of array elements
3. Count even and odd numbers
4. Find the largest and smallest number
5. Search for a student by roll number
6. Build a contact list using arrays

---

# 📌 GitHub Commit

```bash
git add .
git commit -m "Day 3: Methods, Arrays and Practice Projects"
git push origin main
```

## Our Long-Term Plan

After Day 3, we'll continue with:

* **Day 4:** Object-Oriented Programming (Classes, Objects, Constructors)
* **Day 5:** Inheritance, Polymorphism, Abstraction, Interfaces
* **Day 6:** Collections Framework & Exception Handling
* **Day 7:** File Handling, JDBC, MySQL, and a complete console application

After the 7-day bootcamp, we'll continue into **Spring Boot, REST APIs, Maven, Git, DSA, multithreading, and advanced Java** to make you interview-ready for software engineering roles.
