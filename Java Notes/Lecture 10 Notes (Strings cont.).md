Lecture 10 Notes at 6:14pm on October 9th

---

- in a compiled language, it doesn't really matter what the order of function definitions is as the compiler will read the code before execution anyways

- Java has **wrapper classes**

  - Wrapper classes provide a way to use primitive data types (`int`, `boolean`, etc..) as objects.
  - try/catch blocks are used to catch any errors

- try/catch in Java is **try/except** in Python

  ---

  ### String Buffer

  Mutable sequence of character; **a mutable string** 

  - if you need to **append** something to a string, you would need a string buffer!

  - when you create a StringBuffer, there is only 1 single memory allocation, so appending to this StringBuffer does not require many memory allocations

  - when you append to StringBuffer, you are not getting a new instance of that string; you're appending to the very same thing
  - Strings are easier to work with 
    - but less efficient than StringBuffers
    - if you're doing lots of text manipulation, use StringBuffers

  ---

  