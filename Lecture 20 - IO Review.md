Lecture 20 at 6:14pm 

## I/O

### What is an I/O stream?

An I/O **Stream** represents an input source or an output destination. A stream can represent many different kinds of sources and destinations, including disk files, devices, other programs, and memory arrays.

A stream is a method to sequentially access a file. I/O Stream means an input source or output destination representing different types of sources e.g. disk files.The java.io package provides classes that allow you to convert between Unicode character streams and byte streams of non-Unicode text.

### What is a character stream?

In Java, characters are stored using Unicode conventions (Refer [this](https://docs.oracle.com/javase/tutorial/java/data/characters.html) for details). Character stream automatically allows us to read/write data character by character. For example FileReader and FileWriter are character streams used to read from source and write to destination.

A **Buffer** is just simply memory - a storage space

- *Generally, it acts as a dam (like in water) to prevent overflowing.*

---

## The File Class

The File class is Java’s representation of a file or directory path name.

Because file and directory names have different formats on different platforms, a simple string is not adequate to name them. The File class contains several methods for working with the path name, deleting and renaming files, creating new directories, listing the contents of a directory, and determining several common attributes of files and directories.

- we can use file properties to check certain attributes about it

---

**Recursion** is made for solving problems that can be broken down into smaller, repetitive problems

- like going into directories and doing repetitive tasks (because **it's a tree**)

---

## Opening a File

To open a file for either **reading** or **writing**, we can choose either:

**FileInputStream** and **FileOutputStream** class to perform 8 bit byte I/O (ASCII or binary data)

```java
BufferedInputStream  kbdBuf  =  new BufferedInputStream(System.in);

byte[ ] array   =   new byte[100];			      //create a byte array
System.out.print("Enter:  ");
int numBytes =  kbdBuf.read(array);		      //read 8K of data, place first 100 bytes in array
String input   = new String(array, 0, numBytes);    //create a String out of a byte array

```

**or**

**FileReader** and **FileWriter** class to do 16 bit character (Unicode) input and output

```java
FileInputStream  inFile  =  new FileInputStream("data/temp.txt");	//open the file for reading 
BufferedInputStream  inBuf  = new BufferedInputStream(inFile);	//buffer the input process.

byte[ ] array   = new byte[1000];						//create a byte array
int bytesRead = inBuf.read(array);						//read from buffer to the array
String str        = new String(array, 0, bytesRead);				//convert array to a String

```

## Can we read and write to a file at the same time?

No, you can't read and write because you'd be doing two things at the same time which will mess up the data. You do one thing at a time.

 However, **you can do both in databases.**

## The Scanner Class

- part of **java.util package** (not java.io package)
- allows client to read data from keyboard or from an input file
- **works for reading, but not for writing**

