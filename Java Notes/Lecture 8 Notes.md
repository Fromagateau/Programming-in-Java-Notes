Lecture No. 8 at 6:21pm

### More Program Flow and Logic

---

- while loops

- do while() loops

  - will execute at *once* before checking condition

- for loop

  - you can initialize a variable in declaration of for loop, whereas in while loop, you need to declare variable *before* declaration of while loop
  - the placement of items are just slightly different

  ---

  ### Nested Loops

  - think of a clock (has 3 loops going on--hours, minutes, seconds)

  ---

  - break statements: gets out of entire loop
  - continue statements: gets out of single iteration

  - infinite loops: *while (true)*

    ---

    ### Variable Scope

    - if a programming language does not have the concept of a variable scope
      - it is doomed to die
    - the area of a program where a variable is available or accessible to you
    - without variable scope, we cannot borrow code from others!

    ---

    ### Creating and Calling Methods

    - isolated code that can be called multiple times

    - **static means that the variable or method marked as such is available at the class level. In other words, you don't need to create an instance of the class to access it**

      - So, instead of creating an instance of Foo and then calling `doStuff` like this:

        ```java
        Foo f = new Foo();
        f.doStuff();
        ```

        You just call the method directly against the class, like so:

        ```java
        Foo.doStuff();
        ```

    - **invoking** and **calling** can be used interchangeably

      - arguments vs parameters
        - a method accepts **parameters**
        - when you pass variables *into* the parameters, it's an **argument**

