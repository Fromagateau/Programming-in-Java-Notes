November 4th at 6:12pm

---

 ## Notes on OOP

**Static blocks**

In a Java class, a **static block** is a set of instructions that is run only once when a class is loaded into memory. A **static block** is also called a **static**initialization **block**. This is because it is an option for initializing or setting up the class at run-time.

**Constructor**

A way to assign values to instance fields

---

## Combining Service Classes with User Classes into one file

- you can absolutely do this, but maybe not the best practice

---

## Public Modifier

A .java file can only have one public class and it should be named as same as the .java file.

- A public class has "public" visibility, which means that it is accessible to any class in any package, while a class has "default" or "package" visibility, i.e. the class is accessible only to classes inside the same package.
  - A class may be declared with the modifier public, in which case that class is visible to all classes everywhere. If a class has no modifier (the default, also known as *package-private*), it is visible only within its own package (packages are named groups of related classes).

---

## Data Encapsulation

- **means hiding your data fields using the word "private"**
  - if you need to access it outside the class, you create 2 mthods:
    - **getter()** method and **setter() (or modifer method)**

i.e. (getter() and setter() respectively)

```java
String getLastname()
{
  return (lastname);
}

void setLastname(String last)
{
  lastname = last;
}
```

- In most cases, IDEs including **Eclipse** can automatically generate all getters and setters.

**public** means you can access it anywhere while **private** means you can only access it inside its own class. Just to note all **private**, protected or **public** modifier are not applicable to local variables in **Java**. a local variable can only be final in **java**

### There are four levels of *Access Modifiers*

1. **Private** (least access), where fields and methods can only be accessed from within the **same class**

2. **No Access Attribute**, where fields and methods can only be accessed from within the **same class** or **from any other class within the same package**

3. **Protected**, where fields and methods can only be accessed from within the **same class** or **from any other class within the same package** or **from any other subclass**

4. **Public**, where fields and methods can be accessed from **anywhere**

   

---

- *Javadoc* is a documentation generator 

---

### Calling Methods with Arguments

- "sending messages" -> passing arguments

---

### Signature of a Method

What makes a method unique?

In the Java programming language, **a method signature** is the **method** name and the number, type and order of its parameters. Return types and thrown exceptions are not considered to be a part of the **method signature**.

---

### Multiple Constructors

