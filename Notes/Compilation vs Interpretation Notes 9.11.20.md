**4:37pm on 9/11/2020 Notes**

Bits and Bytes -

True (1) and False (0)

A bit is **1 or 0**

A **package of bits** is a **byte**. A **byte** is **8 bits** (think 8 on or off switches). 2^8 is 256. So we have 256 different packages to form. 



**Compiling vs. Interpreting** a Programming Language

- languages are **independent** of whether they are compiled or interpreted

Picture this scenario:

​	You want to take your coded application and send it to someone.

**1. First thing you can do is use a compiler which will take your human-made source code and compile it into machine code. You will end up with two files: your original source code file and an executable file written in binary**

**2. You can use an interpreter instead. So you would send the *source code* to someone, and they would download an interpreter that would interpret it on the fly**

In No. 1, the compiling scenario, the entire source code is already translated into its binary form, readable by the computer and ready to be executed. 

In No. 2, the interpreting scenario, the interpreter goes through the code **one line at a time** and executing that line immediately before moving on.

If speed is the concern, you'll probably want to compile it. Compiling it means that the source code is also kept private. During development, compilation requries an extra step: **compilation**. This may add a significant amount of time to a program's development.

Interpretation is cross-platform, so the programmer only needs to distribute basically one file. There's no extra step of compilation as well. However, the source code is public and it may be slower to interpret a program since it's going **line-by-line**. This does make it easier to debug, however.

**C# and Java** might use an intermediate language, or Bytecode (IL), or JIT.

1. The programmer no longer needs to send over original source code.
2. This new intermediate code is optimized and slightly closer to machine code.
3. Then it can be converted to machine code by the JIT compiler since it can further optimize the Bytecode.

**C, C++, and Objective-C are typically compiled.** (middle level i.e. more systems-level language... more challenging to use)

**PHP, Javascript, Java, C#, Python are typically interpreted** (highest level i.e. easier to use)

Assembly languages examples are x86, ARM, MIPS

Machine code is usually written in binary code. It's the lowest level of software. 

------

8:47pm  on 9/12/2020 Notes

- In compiling scenario, the source code is hidden from users since all that the user gets is the binary code.
- If you compile a program, one downside is that you **must recompile the program for specific platforms**. This takes a long time... **and then you'd have to create CPU-specific binaries within those platform-specific builds**

- For **interpretation**, there only needs to be one version. It's **cross-platform**
- It's easier to debug since there's no extra step of compilation every time you want to check the code

**Computer engineers have been trying to figure out techniques to speed up interpretation process**



C# and Java use an intermediate language, or **Bytecode**

- programmer compiles first into **Bytecode**, or IL, and send that over to consumer
  - 1. No source code available to public
    2. New intermediate code (bytecode) is slightly optimized, so turning that into binary is easier
- JIT compiler optimizes code even further and converts it into machine code



**JavaScript is an interpreted language because it needs to be reinterpreted every single time you want to run a webpage. A compiled language only needs to go through this process once... and it's good to go**

-----

**Java Program Execution Process**

**COMPILATION PROCESS**

- 1. Write the Java Code --------> becomes *abc.java*
  2. Invoke the Java compiler using *javac* command ------> if no error, it becomes **Bytecode** which is in the form of a **.class** file... *abc.class*

**using the Java Virtual Machine**

- 1. **Class loader** - another program that loads *abc.class* 
  2. **Bytecode verifier** - verifies that Bytecode is valid

----

**Either go to Interpreter or JIT (Just In Time Compiler)**

----

**If JIT Compiler is invoked**...

1. Analyzes the entire code for the interpreter, **first**. Not line-by-line.
   - if there's a copy of a line of code, the **JIT Compiler** gets rid of the copy. It's efficient!
2. ***Then*** it goes to the interpretation process

----

**INTERPRETATION PROCESS**

- 1. The interpreter goes **line-by-line** to interpret it for the CPU to execute each line of code.
     - if there's a copy of a line of code, the interpreter **still** interprets it. It's not smart enough to get rid of it. This is why we need the JIT compiler if possible.

 