Lecture 15 on October 30th at 6:12pm

---

## Sorting Algorithm

- you'll want to use a loop for most or all of them

- you can have **recursive** algorithms (calls itself with a subset of the data)
  - ex. factorial functions

---

## Object-Oriented Programming

- use building blocks
- you use the class name when calling static methods or fields from another class
  - Math.random(), for example
  - you can't reference **instance fields in a static method**. You can only reference static fields
  - in an **instance method/field, you can access both static and instance fields**
  - **Within an instance method or a constructor, `this` is a reference to the *current object* — the object whose method or constructor is being called. You can refer to any member of the current object from within an instance method or a constructor by using `this`.**
  - before instantiating an object, you can only access static fields
  - if you want to initialize a static field with a value, you have to **do it right then and there**
  - **static block** - used for static initializations of a class. The code inside a static block is executed only once: the first time the class is loaded into memory.
  - always create a **toString**() method so you can print things without just getting the reference

