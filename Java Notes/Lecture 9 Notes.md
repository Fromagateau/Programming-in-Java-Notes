Lecture 9 at 6:17pm on October 6th

## Strings

---

- in Java, strings **are not primitive data types**
  - they are **object data types**
  - in most languages, a list is called an array
  - in Java, we don't have pointers, we have **references**
    - **Java** doesn't have **pointers**; **Java** has **references**. **Reference**: A **reference** is a variable that refers to something else and can be used as an alias for that something else. So, a **pointer** is a **reference**, but a **reference** is not necessarily a **pointer**.
    - The fundamental concepts in **Java** are "values" **vs**"**references**". A **reference** is a **pointer** that you can't normally see the value of (i.e., the memory address). The only operations allowed are to set it (from another **reference**) and to **reference** through it to the referred-to object.
    - Java is safer in terms of memory than C and C++

---

String myText = "This is a string";

String myText = new String("This is a string");

- `new String("text");` explicitly creates a new and referentially distinct instance of a `String`object; `String s = "text";` may reuse an instance from the **string constant pool** if one is available.

- ```java
   String s1 = "foobar";
      String s2 = "foobar";
  
      System.out.println(s1 == s2);      // true
  
      s2 = new String("foobar");
      System.out.println(s1 == s2);      // false
      System.out.println(s1.equals(s2)); // true
  ```

- **Java strings are immutable**, like in Python

  ---

  A **static method** (or **static** function) is a **method defined** as a member of an object but is **accessible directly** from an API object's constructor, rather than from an object instance created via the constructor.

---

