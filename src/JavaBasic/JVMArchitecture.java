package JavaBasic;

public class JVMArchitecture {
    /*
    JVM (Java Virtual Machine) is an abstract machine.
    It is a specification that provides a runtime environment in which Java bytecode can be executed.

    1) Classloader
    Classloader is a subsystem of JVM which is used to load class files.
    Whenever we run the Java program, it is loaded first by the classloader. There are three built-in classloaders in Java.

    | Loader                               | Description                                                           |
| ------------------------------------ | --------------------------------------------------------------------- |
| **Bootstrap ClassLoader**            | Loads core Java classes (`java.lang.*`, `java.util.*`) from the JDK   |
| **Extension ClassLoader**            | Loads classes from `lib/ext` directory                                |
| **Application (System) ClassLoader** | Loads classes from your project’s classpath (e.g., `/target/classes`) |



           ┌────────────────────────────┐
           │        Method Area         │ ← Class structure, static vars
           └────────────────────────────┘
                     ▲
                     │ Shared
           ┌────────────────────────────┐
           │           Heap             │ ← Objects, arrays
           └────────────────────────────┘
                     ▲
                     │ Shared
   ┌──────────────────────────────────────────────┐
   │ Each Thread Has:                             │
   │                                              │
   │ ┌────────────────────┐   ┌─────────────────┐ │
   │ │     JVM Stack      │   │  PC Register    │ │
   │ └────────────────────┘   └─────────────────┘ │
   │ │Native Method Stack │                       │
   │ └────────────────────┘                       │
   └──────────────────────────────────────────────┘
    1. Method Area (Part of Metaspace in Java 8+)
    🧩 Purpose:
    Stores class-level data used during execution:
    Class structure (fields, methods, constructors)
    Static variables
    Method code
    Constant pool

    ✅ Shared across all threads


    2. Heap Area
    🧩 Purpose:
    Stores all objects created at runtime, including arrays and their instance variables.

    ✅ Shared across all threads

    📂 Heap Subdivisions:

    ➤ A. Young Generation (Young Gen)
    Where new objects are created.
    Contains:
    Eden Space (most objects created here)
    Survivor Spaces (S0 & S1) (temporary hold for objects that "survive" GC)

    ➤ B. Old Generation (Tenured Gen)
    Stores long-lived objects, i.e., those that survived multiple GC cycles.

    ➤ C. Metaspace (Java 8+)
    Stores class metadata (replaces PermGen)

    ♻️ Managed by: Garbage Collector




    🔹 3. JVM Stack (Thread-Private)
    🧩 Purpose:
    Holds method frames for each method call.

    Used for:
    Local variables
    Operand stack (intermediate results)
    Return values

    ❗ Not shared between threads

    🧵 Each Java thread has its own stack, and each method call creates a new frame on that stack.
    A new frame is created each time a method is invoked. A frame is destroyed when its method invocation completes.


    PC (program counter) register contains the address of the Java virtual machine instruction currently being executed.

    The Program Counter (PC) register is a special register within the JVM that
    contains the memory address of the currently executing instruction.

    The PC register keeps track of the currently executing JVM instruction
    📌 Every thread has its own PC Register.
    ✅ Required for multithreading, since different threads may be executing different methods.


    5. Native Method Stack
    🧩 Purpose:
    Supports native (non-Java) method execution via JNI (Java Native Interface).
    Holds native method call frames and their local variables.





    Execution Engine: The execution engine is responsible for executing the compiled Java bytecode.
    It consists of two components: the interpreter and the just-in-time (JIT) compiler.
    The interpreter reads and executes bytecode instructions one by one,
    while the JIT compiler compiles frequently executed bytecode sequences into native machine code for improved performance.



     */
}
