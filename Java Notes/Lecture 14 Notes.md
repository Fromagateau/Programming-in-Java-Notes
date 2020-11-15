Lecture 14 at 6:14pm on October 28th

---

## Review on Object-Oriented Programming

- when we use **new**, we are creating a new object of a class
- when you create a new string, **you ask Java, or the JVM, to get dynamic memory from the heap**

- fields are like variables that hold data, but slightly more complex
  - defined outside of all methods
  - difference between fields and variables is **location**. It's a subtle difference
- when we ccreate a new object of a class, **the constructor gets called**

---

Static fields are used to create common variables

**You can access static fields before you create any objects**

### vs.

Instance field is a unique variable -- **unique to that object**

- if you don't say **static**, it's automatically **instance**

---

## Static Method

- provides functionality when none of the objects have been created

- **instance methods do not exist until you create that instance**

- **use class name**

- if it's an **instance method, you don't use the class name** i.e. 

  ```java
  x.length(); //instance method
  ```

  

---

## Constructor

- the JVM creates a **default constructor**
- we call the **constructor** whenever we request a new object

### PURPOSE

1. Allocates new memory from the heap (performed by JVM)
2. Creates object and its instance fields
3. Initialize the instance fields

### YOU CAN DEFINE MORE THAN ONE CONSTRUCTOR

- if you're passing in different types, it's using different constructors

- there are 16 different constructors for strings, for example

- **String constructors** are used for creating and initializing **string** objects

  

  - ex. **THESE ARE DIFFERENT CONSTRUCTORS BEING CALLED**

    ``` java
    String x = new String();
    String y = new String("sam");
    
    String a = "";
    String b = "sam";
    ```

    

- the string constructor that's called in the second line of the example is 

  - ```String (String Original)```

  ---

  Every object **should** have a **toString()** method, so when it's used in a string context, this method can automatically get called

```java
String x; // will just give you the reference and no arrow to a value!
```

---

## OOP vs. Procedural

- bottom to top is how we think of it in OOP



- preserving value of data
- reusability

