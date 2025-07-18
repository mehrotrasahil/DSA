# 🧠Java Basics for DSA

---

## 📘 Topics Covered:

1. Java Input and Output (Scanner)
2. Conditional Statements (`if-else`, `switch`)
3. Loops (`for`, `while`, `do-while`)
4. Writing Functions (Methods) in Java
5. Practice Problems

---

## 1️⃣ Java Input and Output

### ✅ What is `Scanner`?

The `Scanner` class is used to take input from the user in Java.

### 🔧 How to Use:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in); // Create Scanner object
int num = sc.nextInt();               // Read an integer
String str = sc.next();              // Read a word (no spaces)
String line = sc.nextLine();         // Read a full line
```

> **Note**: If you use `sc.nextInt()` followed by `sc.nextLine()`, add an extra `sc.nextLine()` to consume the leftover newline.

---

## 2️⃣ Conditional Statements

### ✅ `if-else` Statement

```java
int number = 10;
if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

### ✅ `switch` Statement

```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other Day");
}
```

---

## 3️⃣ Loops in Java

### ✅ `for` Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### ✅ `while` Loop

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### ✅ `do-while` Loop

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

> **Difference**: `do-while` runs at least once, `while` may run zero times if condition is false.

---

## 4️⃣ Writing Functions (Methods) in Java

### ✅ Basic Method

```java
public class Main {
    public static void main(String[] args) {
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
```

### ✅ Points to Remember

* Define methods inside the class.
* Use `static` keyword to call it from `main` directly.
* Can return any data type (e.g., `int`, `String`).

---

## ✅ Summary Checklist

* [x] Learned how to take input using Scanner
* [x] Practiced conditionals using `if-else` and `switch`
* [x] Looped using `for`, `while`, and `do-while`
* [x] Created and called basic functions

Next up: **Arrays in Java** – declaration, input/output, traversing, and basic problems!

---
