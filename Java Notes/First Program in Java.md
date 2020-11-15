9:25pm on 9/12/2020

---

public class Main {

​	public static void main(String[] args) {

​		System.out.printIn("This will be printed")

​	}

}



----

1. **public class Main** -- defines a class called Main
   - in *Java*, every line of code that can actually run needs to be inside a class. Since it's *public*, any other class can access it.
     - **NOTICE: when we declare a public class, we must declare it inside a file with the same name (Main.java)**
2. **public static void main (String[] args) {** 
   - Main entry point of our Java program. It *must* have this exact signature in order to run
     - **public** means anyone can access
     - **static** means that you can run this method without creating an instance of **Main**
     - **void** means this method doesn't return any value
     - **main** is the name of the method
3. **System.out.printIn("This will be printed");** 
   - **System** is a pre-defined class that Java provides us and it holds all of the functions and variables we would want to use
   - **out** is a static variable within **System** which represents the output of your program (stdout).
   - **printIn** is a method of **out** use to print a line