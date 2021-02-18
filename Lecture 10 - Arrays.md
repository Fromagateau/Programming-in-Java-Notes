Lecture 10 at 7:25pm continued:

---

### Arrays

- in Python lists are mutable, **tuples are not mutable**

## What is an array?

- allows you to store multiple values in same container
- once declared, a Java array cannot grow in size
  - use **Java Collection Types** if you need to grow in size (and to store heterogenous datatypes)
  - The keyword "**New**"creates a **Java** object and allocates memory for it on the heap. **new** is also used for array creation, as arrays are also objects.
- **In Java, arrays automatically get initialized**; i.e. if you initialize an array of ints without providing the values, they all **become 0s**

- in **Java**, not Python, if you try to just print an array, it'll print the address of it
  - you would need to use a loop and iterate over each element to print