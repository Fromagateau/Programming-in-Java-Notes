Lecture 17 at 6:17pm on November 5th

## OOP Notes

### Multiple Constructors

- you might want different parameters (*different ways to call a class*)

**Self is the same thing as This**

- most languages uses This

  - **"This"** refers to the current object

  - ### Java will store the reference to "**This**" (i.e. the current object's address) <-***IMPORTANT

---

### "New" Keyword

- if you want a true copy, use the word **new**

- **you can create a Copy Constructor**
  - it takes an object and makes a copy of it
  - memory gets allocated for this new object
- i.e. **String (String original)** <------ THIS IS A COPY CONSTRUCTOR

---

## Class Reuse

- you can build a class from another class, which is called **class reuse**
- this is a huge benefit of OOP

### PATH VARIABLE

The UNIX path is an environment variable which is a list of directories in which to look for programs that you're trying to run. It allows you to avoid having to use the complete pathname for running things like `/bin/ls` (for example by putting `/bin` in the path).

### CLASSPATH VARIABLE

The `CLASSPATH` variable is one way to tell applications, including the JDK tools, where to look for user classes. (Classes that are part of the JRE, JDK platform, and extensions should be defined through other means, such as the bootstrap class path or the extensions directory.)

## Packages

What is a package??

- a directory
  - A package in Java is used to group related classes. Think of it as **a folder in a file directory**. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

```java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```

- when the Java IDE asks you for a package name, it creates a directory for you
- name of package must match name of directory