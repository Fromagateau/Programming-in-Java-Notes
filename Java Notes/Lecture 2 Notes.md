**Lecture No. 2 9/11/20**

**Compilation vs Interpretation** (notes taken from lecture)

What are the pros and cons of each?

**Compiled Languages**

- ex. languages: C and C++

  - code is transformed into a binary executable form by the compiler (it parses the code) and **adds unique operating system instructions** 

    - each compiler understands **different languages** and it *needs to know the target machine** i.e. PC, Unix, Linux, Mac?

    - the compiler generates binary-level executable code (machine code) and *this* is distributed to the consumer/user

    - it is *the responsibility* of the developer to procure the **compiler**

    - it's a *long process* to compile...run...test...start over...

    - even though it takes long to compile, it has a **fast execution** since it's already in binary executable form

    - *hides* intellectual property

      

**Interpreted Languages**

- ex. JavaScript -> you are asking it to reinterpret the pages every time you run it

- Programmed code **is not transformed into binary executable format**
  - The interpreter takes the English-level language instructions, translates the code, adds unique operating system instructions, and **runs the code in one step** (compared to compilers which creates the binary-level code)
  - Single-step process-->interprets the code and runs it **in one step**
  - **consumer's responsibility to make sure the consumer/user has the interpreter to run the program** 
  - Interpreter is **specific to a source language** and to a **specific target operating system**
  - **cross-platform** and can **run on any operating system**
  - Distributed to consumers/users via the original English-like code... **NOT THE BINARY CODE** 
    - do not need to compile program for every operating system
  - **The source code is open**, so if you are a Google or Microsoft, you **probably would not want to have your source code open...**
  - fast-development cycle: edit program, run, test results, start over
    - **slow execution** since the interpreter has to re-parse the code every time you run the program

**Java** 

- compiled first (from English-level code) into an **intermediary format** known as Java **Bytecode**

  - **Bytecode** is like binary but it doesn't have specific operating system instructions (for printing screen, etc.)
    - it has the equivalent instructions but in a **standard format**... it's **OWN FORMAT CALLED JAVA BYTECODE** 
      - creates a .class file (after it's compiled)

- **Compiling step is done**. Now it **goes to the interpreter**. But now, it does **not have to be interpreted from English-level code**. It is interpreted from **JAVA BYTECODE**

- Java Virtual Machine or JVM interprets code and runs it. It is the **user's responsibility to have the interpreter** 

  - typically interpreter needs to parse the code and then add the OP instructions, but it does not have to do that here

  - **The Java Interpreter, JVM, reads the intermediate level Java byte code**

    

**We basically took the first part of compiler and took second part of interpreter in Java**



**Analogy**

Compilation: Waiting for the gun to shoot to sprint on track in a race

Interpretation: In the gym... gotta put on shoes and get ready and then we're done

**Java**: Starts at a bench on the track... the middle between the track and the gym

**In Java, the consumer/user needs the compiler in addition to the interpreter**



--------

**Java** is meant to be portable. The slogan is **write once, run anywhere** 

We can combine the compilation and interpretation into a *single step*

- Save Java program: *pgmName.java*
- Run it through the interpreter: **java**.*pgmName*.**java**
- Your program internally compiles and runs

When JVM detects a .java file, it internally compiles the code and **immediately runs it**

**Single step process doesn't work if you already have a .class file of your program**

----------

- **Java Development Kit** or **Standard Development Kit** includes both the **compiler** and the **Java Runtime Environment** (**JRE**)
  - A **JRE** includes the interpreter, **Java Virtual Machine**, as well as all other run-time libraries

The consumers only really need the **JRE**, since they aren't writing code.

--------

**Some tips**

- **In Java, the internal name of the program must be the same when you're saving it**

- Usually class names are **capitalized** 

  

  **IMPORTANT COMMAND**

- *echo $PATH* (Mac)

  - **output** /Library/Frameworks/Python.framework/Versions/3.8/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Library/Apple/usr/bin:/Library/Frameworks/Mono.framework/Versions/Current/Commands
    - this command **lists all the directories in the path system variable** (whatever that variable is at the moment)



-------

**Object-Oriented Concepts**

- What is an object?
  - Anything can be thought as of an object. Objects are all around us. A **car** is an object; a **tree** is an object
    - an object can have behavior and characteristics
- The whole idea behind OOP is **trusting the objects and all of the code that exists internally**
  - we aren't worried about the internals of it... we trust it
  - in encapsulation, complex objects can contain other objects
- **OOPS I ate A PIE** 
  - Abstraction, Polymorphism, Inheritance, Encapsulation
- A **class** is a **type** of object, or a **classification** of objects, or a **TEMPLATE**