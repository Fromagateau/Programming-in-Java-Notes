Lecture 19 at 6:17pm on November 13th

---

- in Java, a *char* is **2 bytes**

## Exceptions Review

- each exception *is its own class!*
  - you can create instances of that class
- you can create custom messages by instantiating an exception object and creating its toString() method within its class

---

## Input and Output

```java
import java.io.*
```

- **Java IO** is an API that comes with **Java** which is targeted at reading and writing data (input and output)
- Java stores and retrieves data from a file (or console) by connecting the file to a stream of data

### Three Objects

Java creates three standard streams that are automatically available to you when you run your Java program

- InputStream, PrintStream, PrintStream
  - *InputStream* reads from keyboard
  - *OutputStream* prints output to screen
  - *OutputStream* prints error messages to screen

---

**When you type in**

```java
System.out.print("Hello"); 
//instead of//
System.print("Hello");

```

This is because -

- there's a field called out *that is a reference* to a static field called **PrintStream**. In the **PrintStream**, there's a method called **Print**

`out` is a static member in the `System` class, being an instance of `PrintStream`. And `println` is a normal (overloaded) method of the `PrintStream` class.

### Stream

- is a sequence of bytes (it's an abstract representation)

### Buffer

- is simply a block of memory space that batches the input or output process
- like a bucket
  - A container for data of a specific primitive type. A **buffer** is a linear, finite sequence of elements of a specific primitive type. Aside from its content, the essential properties of a **buffer** are its capacity, limit, and position

---

All I/O is broken up into

​	**Byte I/O**

	- Input
	- Output

**Char I/O**

- Input
- Output

## Input and Output Streams

- deal with *byte* data - used for ASCII Data (i.e. 8 bit) or for binary data

## Readers and Writers

- deal with *char* data - used for processing Unicode char type of data (i.e. 16 bits)

---

```java
System.out.print("");
```

is buffered

---

