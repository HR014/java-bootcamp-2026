# ☕ Day 2 – Conditions, Loops & User Input

## 🎯 Today's Goal

By the end of today, you'll be able to:

* Take input from the user
* Make decisions using `if`, `else`, and `switch`
* Repeat tasks using loops
* Build simple console applications
* Push today's work to GitHub

---

# 📂 Folder Structure

```text
Day-02-Conditions-Loops/
│
├── UserInput.java
├── IfElse.java
├── SwitchCase.java
├── ForLoop.java
├── WhileLoop.java
├── MultiplicationTable.java
├── EvenOdd.java
├── NumberGuessGame.java
├── ATM.java
└── README.md
```

---

# 1. User Input

Java uses the `Scanner` class to read input from the keyboard.

```java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Welcome " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
```

### Practice

* Ask for name
* Ask for age
* Ask for city
* Print all the information

---

# 2. `if` and `else`

```java
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible");
        }

        sc.close();
    }
}
```

### Practice

Create programs to check:

* Even or Odd
* Positive or Negative
* Pass or Fail (35 marks)
* Largest of two numbers

---

# 3. `switch`

```java
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose (1-3): ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Pizza");
                break;

            case 2:
                System.out.println("Burger");
                break;

            case 3:
                System.out.println("Sandwich");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
```

---

# 4. `for` Loop

```java
public class ForLoop {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            System.out.println(i);

        }

    }

}
```

### Practice

* Print 1–100
* Print 100–1
* Print even numbers
* Print odd numbers

---

# 5. `while` Loop

```java
public class WhileLoop {

    public static void main(String[] args) {

        int i = 1;

        while(i <= 5){

            System.out.println(i);

            i++;

        }

    }

}
```

---

# Mini Project 1 – Multiplication Table

```java
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + (num * i));

        }

        sc.close();
    }

}
```

---

# Mini Project 2 – Even or Odd Checker

```java
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        if(number % 2 == 0){

            System.out.println("Even");

        }else{

            System.out.println("Odd");

        }

        sc.close();
    }

}
```

---

# Mini Project 3 – Number Guessing Game

```java
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 25;

        System.out.print("Guess the number: ");

        int guess = sc.nextInt();

        if(guess == secret){

            System.out.println("Correct!");

        }else{

            System.out.println("Wrong! The correct number is " + secret);

        }

        sc.close();
    }

}
```

---

# Mini Project 4 – ATM Menu

```java
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Choose an option: ");

        int choice = sc.nextInt();

        switch(choice){

            case 1:
                System.out.println("Balance: ₹" + balance);
                break;

            case 2:
                System.out.print("Enter amount: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("New Balance: ₹" + balance);
                break;

            case 3:
                System.out.print("Enter amount: ");
                double withdraw = sc.nextDouble();

                if(withdraw <= balance){
                    balance -= withdraw;
                    System.out.println("Remaining Balance: ₹" + balance);
                }else{
                    System.out.println("Insufficient Balance");
                }

                break;

            default:
                System.out.println("Invalid Option");

        }

        sc.close();

    }

}
```

---

# 📝 Homework

Complete these programs on your own:

1. Grade Calculator (A, B, C, D, F)
2. Leap Year Checker
3. Simple Login System (username & password)
4. Sum of first `N` numbers
5. Factorial of a number
6. Reverse a number
7. Check if a number is a palindrome
8. Print star patterns:

   * Square
   * Right triangle
   * Pyramid

---

# 📌 GitHub Commit

```bash
git add .
git commit -m "Day 2: User Input, Conditions, Loops and Console Projects"
git push origin main
```

## 🎯 Challenge (Optional)

Build a **Student Result System** that:

* Accepts a student's name and marks for 5 subjects.
* Calculates the total and percentage.
* Displays the grade.
* Prints whether the student passed or failed.

This combines everything you've learned in Days 1 and 2 and is a great portfolio project for your GitHub repository.
