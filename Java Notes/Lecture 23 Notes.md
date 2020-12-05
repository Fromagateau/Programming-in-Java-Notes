Lecture 23 at 6:12pm on December 4th, 2020

---

- in Java, you can only extend from **one class**. However, you are able to implement **multiple classes**. One must be a parent (superclass)class, and the others must be interfaces (comma delimited)
- 

Abstract Method

```java
public abstract class Employee
{
  abstract int getWeekPay(); //no code in this function
}
```

- you don't know what this code will do and **you're hoping one of your subclasses will complete the job**
  - subclasses must override abstract methods (to complete the job)

## Java Interfaces

- an abstract class can have abstract and non-abstract methods, and any fields

- an interface can **only** have abstract methods, and **only static final fields** (constant)

  - therefore, you don't necessarily need to type in
  - The fields of interfaces are static and final by default

  ```java
  public interface Person
  {
    /*public static final*/ String PLACE = "Planet Earth";
    /*public abstract*/ String earnMoney();
    
    //the stuff comment out is what you don't need, since interfaces can only have abstract methods and only static final fields
  }
  ```

  - Interfaces can’t have constructors

- An interface is considered **a contract**. All classes that implement the interface must at some point implement all methods that were envisioned by the class designer and defined as abstract in the interface. 
  - this forces a **consistent** client interface for all subclasses that implmenet an interface

 ### "Final" keyword

- basically makes that field **a constant**
  - you can do this on any field; **it doesn't necessarily need to be within an interface**
    - **but for interfaces, they need to be static final fields**

- if you want to make a change to a static field, you need to do this in a method

### Final keyword for methods

- you can prohibit subclasses from overriding your method
  - like your mother's cookie recipe!

### Final keyword for classes

- prohibit any further subclassing of this class



## Identifying Objects

Java provides an operator called **instanceof**. This operator gives us a way to identify an object as belonging to a certain class or superclass. 

- **THIS IS NOT A FUNCTION**

```java
if (name instanceof String)
  System.out.println("name is a String"); //yes -> name is a String
```

## The "Object" Superclass

Java provides a class called "Object". It is the **Top of the Class**

The Object class, which is stored in the **java**. lang package, is the ultimate superclass of all **Java** classes (except for Object ). Also, **arrays** extend Object .

```java
toString() //This method returns a string representation of the object
  /*The Object class*/ Pu
```



**Deep vs Shallow**

**Shallow** is actually cloning, **but anything that is not a primitive data type, you're only get a reference to it**

- does not "go deep" into that

