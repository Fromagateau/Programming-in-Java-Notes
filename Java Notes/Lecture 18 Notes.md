Lecture 18 at 6:15pm on November 11th

---

## OOP

- at least one class needs to be public
- fields and methods are at the same level (look at indentation for example)

## Error Handling

- **Try and Catch**

- ### Exception

  A creation of an object of the Exception Class (more simply, an error)

  Either you trigger an Exception, or the JVM does it

### vs. 

### Old Way of Catching Errors Without "Try" and "Catch"

- checking error codes or values
  - error and processing is intermixed with the regular processing

---

- **Exceptions** are classes
- **Throw** is used for your custom exceptions
- methods will exit immediately if error occures
  - JVM then looks for Try/Catch block
  - **main() exits immediately as well if there's an error and no Try/Catch block**
- An **Exception class** is a class that is raised when errors are not severe and your application should catch and handle those

## Throw Block

```java
throw new Exception("");
```

*equivalent to*

```java
Exception x = new Exception("");

throw x;
```



You can throw an exception without using Try/Catch Block, but you have to declare it

You would do this if you just want to give an error without handling it

- You <u>handle</u> the exception
- You <u>declare</u> that you won't handle it and let your caller beware <------- **THIS IS A WARNING, LIKE ON A CIGAR BOX**

```java
double calcItemAvg(double total, int count) throws Exception
{
 //code
}
```



## Finally Block

- execute regardless of outcome