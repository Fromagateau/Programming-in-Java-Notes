Lecture 21 at 6:16pm on November 20th

---

if you compile the user class, it'll also compile the service class

## Extending Classes and *Inheritance*

Extending a class = **subclassing**

Parent Class = Super Class

Child Class = Sub Class

To create a subclass from a superclass, you use the keyword **extends**

```java
public class partTimer extends Employee
```

you can add additional fields in the subclass

### Constructors

- never inherited no matter what
- **If a superclass has a constructor (and no empty constructor), your subclass must create a constructor**
- A subclass constructor must **always** call the parent class' constructor
  - I.e. you'd need a **Canine** class before you call the **Dog** class' constructor

---

### Overloading vs. Overriding

- **Overloading** is when two or more methods have the same name but have different parameters

---

- **Overriding** means having two methods with the same method name and parameters (i.e., method signature)
  - two methods having the same signature
  -  **Overriding** is all about giving a specific implementation to the inherited method of parent class

### Polymorphism

Method **overloading** is an example of static **polymorphism**, while method overriding is an example of dynamic **polymorphism**

---

You cannot assign weaker access privileges