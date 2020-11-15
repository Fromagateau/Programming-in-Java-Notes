**Friday Morning Notes 9/11/2020**

Different types of programming languages:

1. Procedural (imperative)
2. Object-oriented
3. Declarative
4. Functional

**Procedural Languages**

- Relies on a "linear or top-down approach"
- relies on procedures or subroutines to perform computations
- A.K.A. **imperative programming**
  - however, a language **can be imperative without being procedural. A procedural language is just a subset of imperative programming. You are using procedures, or functions, to tell the computer how to complete a task**
- Divided a program into a set of functions
  - Data stored in a bunch of variables and functions that operate on the data
- Very simple... but as your programs grow, you will find you have functions all over the place and you will find yourself pasting lines of code over and over. We should avoid this since it's like **spaghetti-code**
- The solution of this is **Object-oriented programming, or OOP**
  - in **OOP**, related functions and variables are grouped into an **OBJECT** 
- **example: cars have properties like color, model, make, etc. **
- **they have functions like start(), stop(), move(), etc.**

- One of the *symptoms* of procedural programming is functions with **lots of parameters**. We can get rid of the parameters if we put all the properties needed for that function in an **object**

**Object-oriented Programming**

- Programming style associated with classes, objects, and other concepts like inheritance, polymorphism, abstraction, and encapsulation
- ex. **C++, Java, Python**

**INHERITANCE** - can eliminate redundant code since we don't need to redefine every single property and method for an instance of a class.

- **CLASS** - ex. human-being with body parts and actions, etc.
  - it's just a design where everything is defined... or a **type**. Human-being is a type. Thus, when we say we are human-beings, we mean we belong to that type or class
- **Male** and **Female** would both be classes, but they **inherit** from **Human-Being**. This is because both Male and Female have similar body-parts and actions (functions)

- **OBJECT** - **I** am an **object** of class **Male** or **Human**. An individual, specific person is an object





- **ABSTRACTION** - **Walk(), Talk(), See()**, etc. are all abstractions because we don't know what the inside mechanisms are. We just know the functions.

  - Using an object with functions that don't have many parameters makes it easier to read
    - It provides an *easier interface*

  





- **ENCAPSULATION** - Our **hands** help us **hold** things, our **eyes** help us **see** things. **This binding of properties with functions in a class is ENCAPSULATION**



- **POLYMORPHISM** - allows us to define more than one way to do thing
  - **Overriding** or **Overloading**
    - if we **walk** with our **hands**, we are **overloading** since we are using a **different argument**
    - If we **walk** **backwards**, we are **overriding** since we are changing the underlying mechanism of a function





**SQL** - declarative language... it is **non-procedural** because when you use it, you are interested on *what* you want to get done rather than *how* it is going to get done.

**Difference between procedural and declarative**

To fill a bucket in C or Java -

1. Open the door
2. Go outside
3. Pick up the bucket
4. Bring it back to me

In SQL -

1. Fill the bucket

Therefore, in a declarative language like SQL, you don't have to go through the process step-by-step. Algorithms are already build in. The *optimizer* separates your request into smaller steps and does it itself. 



