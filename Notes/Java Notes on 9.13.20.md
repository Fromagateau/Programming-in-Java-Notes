10:40pm Notes on JVM vs JRE vs JDK

**Java Development Kit, or JDK**

- tools that take your source code and converts it to a format that the JRE and the JVM can execute
  - **includes** debuggers, Java compiler
  - nowadays includes **JRE**

**Java Runtime Environment, or JRE**

- actually includes **JVM**, libraries, and Java launcher
- **any person who wants to run Java code needs JRE**
  - you can't develop with the JRE. You just use it to run Java programs

**Java Virtual Machine, JVM**

- a C++ compiler compiles it into code that the hardware can work with (machine code). It'll **create a version that can only execute on a certain hardware, like an intel-platform computer**. You end up needing to recompile it on different hardwares

  

- Using the **JVM**, we can execute Java code in *.class* format.

