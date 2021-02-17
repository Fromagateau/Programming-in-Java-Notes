## Object-Oriented Programming

---

- object is an **encapsulation** (inside of a shell is the data and functionality)
  - every entity is an object if it is **not a primitive data type**
  - instance variables (fields or data members)

---

- class is the type of object
- dog is a class (**not a specific item**)
- instantiation == creating an instance of an object
- **in Java, you use the *new* operator to enable you to create a new object of a class**
- in Java, a program unit is a class

---

### Service Classes vs. User Classes

- we use service classes such as System, Math, String, Etc.
- functions in service classes **do not run themselves**
- *fields vs. local variables*
- fields are automatically initialized
- Java will automatically initialize all fields to 0 if they are numeric, false is bool, and a few others

---

## Static Field vs. Instance Field

- when defining a class field, you *must* use the Java keyword **static** => **BELONGS TO THE CLASS**
  - if you don't use the word **static**, it's implicitly called **instance field** => **BELONGS TO EACH OBJECT**
  - when you create an instance field, you **do not get any of the non-static fields until you create an object** of it
  - purpose of an instance field: to store **unique data**

---

## Defining Methods

### Static Method vs. Instance Method

- A static method belongs to entire class as a whole; there's only a **single method for that class**
  - **you can also use a static method before an object has been created**
- An instance method (*belongs to each object*) 
  - purpose is to manipulate specific instance fields of that object

---

## Public

- **public is** a **Java** keyword which declares a member's access as **public**. **Public**members are visible to all other classes. This means that any other class can access a **public** field or method. Further, other classes can modify **public** fields unless the field **is** declared as final .

---

## Constructor (A METHOD)

- a special method you define within the class

- it has **the same name as the class** 

  - helps initialize objects if you give parameters in the constructor

- The **purpose of constructor** is to initialize the object of a class while the **purpose** of a method is to perform a task by executing **java** code.

- ### behind the scenes it -

  - 1. allocates memory for the new object from the heap
  - 2. creates the object and its instance fields
  - 3. initializes the instance fields

- **if a class doesn't have a constructor, the compiler automatically creates one itself**

  - this "empty constructor" gives you the ability to create an object... you can't create an object without a constructor