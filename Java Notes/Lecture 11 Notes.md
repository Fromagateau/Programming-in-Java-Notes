Lecture 11 at 6:12pm on October 14th, 2020

---

- can't make string longer because it's already in memory (already occupied by someone else!)
  - can't just push that data out of the way
  - **move it to a different place** 
  - that's why strings are immutable

---

- What are the advantages of an array?
  - can index

---

## Foreach Loops

- no indices

```
for (type var : array) 
{ 
    statements using var;
}
```

**is equivalent to:**

```
for (int i=0; i<arr.length; i++) 
{ 
    type var = arr[i];
    statements using var;
}
```

## Multi Dimensional Arrays

- an array of arrays
- rows before columns
- each array in array can be a unique size 

---

matrix.length will give you the amount of arrays in it, and matrix[1].length is what you use to get the length of one of them

---

### Initializing a string with no value creates a reference* to a future string with a value

i.e. String word;

## Passing Arguments from Command Line

---

java pgmName arg1 arg2 arg3 arg4

##  



