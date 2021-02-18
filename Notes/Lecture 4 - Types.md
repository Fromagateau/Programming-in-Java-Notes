Lecture 4 at 6:15pm on September 18th, 2020

**Java is a strongly-typed language**

- requires precise declarations whereas weak-typed don't

*Primitive Data-types*

- built-in, simple types: int, byte, short, long
  - a **float** holds less precision than a **double**

---

- A literal doesn't have an address or a name. **VS.** a variable which does have these

**The size of an integer literal depends on its value**

- *An integer literal larger than two billion needs **an 'L'** for 'Long'

----

Decimal Literals

- *a decimal literal **is a double unless explicitly declared as float at end of variable**

- float x = 3.14 **IS INVALID**
  - must be: float x = 3.14**F**

----

**WHEN WORKING WITH INTEGERS, IT IS BEST TO USE INT**

**WHEN WORKING WITH DECIMALS, IT IS BEST TO USE THE TYPE DOUBLE**

- unless you require many thousands of them (*memory usage*)

----

**Char**

A variable that can hold 1 single text character. It will **be stored in Unicode character representation** 

---

**Bool**

- Comes from **George Boole**

true or false 

-----

**The other data-types in Java are not primitive...they are object data-types**

ex. String or StringBuffer **are classes/objects** i.e. someone built them up!

- the String class is **used** to manipulate character strings that cannot be changed.

- StringBuffer is a safe, mutable sequence of chars

----

System.out.print() **vs.** System.out.println() vs. System.out.printf()

Look at Math commands