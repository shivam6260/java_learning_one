package JavaBasic;

public class HowJavaExecutesCode {
    /*
    Java Source Code (.java file)
        ↓
    Java Compiler (javac)
        ↓
    Java Bytecode (.class file)
        ↓
    Java Virtual Machine (JVM: Interpreter + JIT Compiler)
        ↓
    Machine Code (Executed by CPU)

    1. Java Source Code (.java)
       This is the code you write using the Java programming language.

    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    File extension: .java
    High-level and platform-independent.


    2. Java Compiler (javac)
    The Java Compiler (javac) takes the .java source file and compiles it.
    It translates human-readable Java code into an intermediate representation called Java Bytecode.
    This compilation is platform-independent, which means the same bytecode runs on any machine with a compatible JVM.
    Output: .class file (bytecode)

    3. Java Bytecode (.class)
    Platform-independent intermediate code.
    Cannot be run directly by the CPU.
    Designed to be executed by the Java Virtual Machine (JVM).
    Think of it like a portable instruction set.


    4. Java Virtual Machine (JVM)
    Java 21, like earlier versions, runs the .class files inside the JVM, which is a software-based engine.

    The JVM does two main things:
    A. Interpreter:
    Reads the bytecode line by line and executes it.
    Easy to implement, but slower since it reinterprets each instruction every time.

    B. JIT Compiler (Just-In-Time Compiler):
    Compiles frequently-used parts of the bytecode into native machine code at runtime.
    Boosts performance significantly by avoiding repeated interpretation.

    Java 21 heavily uses the JIT compiler, especially for long-running apps (e.g., backend servers).

    5. Machine Code
    Once the JIT compiler generates the native code, it's executed directly by the CPU.
    This is what your computer actually understands (specific to your CPU architecture).








     */
}
