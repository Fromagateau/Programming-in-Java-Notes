9/16/20 Lecture No. 3 at 6:10pm

Compilation vs Interpretation **is a decision-making process**

- lots of considerations that we should be aware of to make this decision



----

**A byte is 8 bits**  

- a single byte can hold an ASCII character
- each bit can only be 0 (no electrical current flowing through) or 1 (small electrical current flowing through it)

Since we have 8 bits, we can store up to 256 values: 0 - 255

*The reason why we can store up to 256 values is because 2 to the eighth power is 256*

The number 5 in binary is 00000101

The character 5 in binary is 00110101

We have ASCII (UTF8) and Unicode (UTF16) because Unicode is a 16-bit character set (2 bytes). A unicode is two bytes.

In computer science there is nothing that is decimal. A kilobyte is 1,024 bytes, not 1,000 bytes

----

Octal system has 8 values

---

There are a couple obvious reasons why hexadecimal is preferable to the standard binary that computers store at the low level.

1. Readability. Hexadecimal uses digits that more closely resemble our usual base-10 counting system and it’s therefore easier to decide at a glance how big a number like e7 is as opposed to 11100111.
2. Higher information density. With 2 hexadecimal digits, we can express any number from 0 to 255. To do the same in binary, we need 8 digits. As we get bigger and bigger numbers, we start needing more and more digits and it becomes harder to deal with.

Colors are represented on a computer using **RGB** 

1 byte for red, 1 byte for green, 1 byte for blue

**FF FF FF** = full red, full green, full blue

10 in hexadecimal is **16**...00 01 02 03...0A 0B 0C 0D 0E 0F 10 11 12 13 14...

10 in binary is **2** 

---

**Numeric vs Character**

The value of 1 is not the same as '1'. They are different entities as far as computers are concerned

---

**ASCII vs EBCDIC vs Unicode**

EBCDIC character set is another codification system are used on large machines or mainframe computers

**Unicode**

- universal character encoding standard

- **based on two bytes per character**

  - allows the representation of all characters in different languages

    ​	

    ​      v ASCII set

0000 0000  0000 0000

​		^foreign characters

- The consequence of using Unicode is that the file size will double, since every character is now **two bytes**

---

In compiled languages including Java, **literals are important**. They are containers in memory, just without names. So they are not variables.

- literal examples: "apple", "Hello World", "3.14"

---

**Control Flow**

The **Sequence of execution of program statements** 