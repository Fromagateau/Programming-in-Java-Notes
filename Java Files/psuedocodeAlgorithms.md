### Java Homework - due on Friday, October 2nd at 1:00pm

---

<u>Sequential Search</u> 

1. Create loop to iterate over each item in array; begin with first element

   a. Check if item is matching item

   		- if element is a match, return element and end loop // **return**
		
   		- if element is *not* a match, move on to next element and repeat back to 1a

<u>Binary Search</u>

1. Check if first item is matching item

     - if element is a match, return element and end loop // **return**
  - if element is *not* a match, move on to step 2
   
2. Create variables start and end, and make start index 0, and end index *n*, where *n* is the number of elements in array minus 1

3. Find midpoint 

   - if end < start, end the loop as it is not found in the array // **return** 

   - midpoint = (end + start) / 2  
   - Go to midpoint

4. If current element is matching element, return element and end loop // **return**

   - else go to step 5.

5. If current element is less than element we're looking for

   - move left one element and make that the new *end*

   - **else**, if it's bigger, move right one element and make that the new *start*

6. Check if current element is matching element; if it is, return element and end loop // **return**

   - **else**, go back to step 3

