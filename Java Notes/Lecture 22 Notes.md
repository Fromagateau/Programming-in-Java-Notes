Lecture 22 on December 2nd, 2020 at 6:14pm

---

### Class Extending

- you can access fields and methods from the super class as though they belong to you
- **Overriding fields is called data hiding**
  - it's best practice to make all fields private

## Polymorphism

**Polymorphism** is one of the core concepts in **OOP** languages. It describes the concept that different classes can be used with the same interface. Each of these classes can provide its own implementation of the interface. Java supports two kinds of **polymorphism**. You can overload a method with different sets of parameters.



## make Polymorphism happen:

### In the Service Class

1. Define a superclass with **two or more subclasses**
2. Define a method in the superclass and **override it in both subclasses**

- No. 2 might seem useless, but **it's required to make polymorphism work**

### In the User Class

1. Create objects from those 2 subclasses
2. **Assign the objects to variables of the <u>superclass type</u>**
3. **Call the method ** on the superclass method

## Abstract Classes

An **abstract class** is a **class** that is declared **abstract** — it may or may not include **abstract** methods. **Abstract classes** cannot be instantiated, but they can be subclassed. An **abstract class** may have static fields and static methods.



## Interfaces

Another way to achieve [abstraction](https://www.w3schools.com/java/java_abstract.asp) in Java, is with interfaces.

An `interface` is a completely "**abstract class**" that is used to group related methods with empty bodies:

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the `implements` keyword (instead of `extends`). The body of the interface method is provided by the "implement" class:

```java
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

