package JavaBasic;

public class whatIsJava {
	public static void main(String[] args) {
		/*
		 * 
		 * Java is a high level, robust, object-oriented and secure programming
		 * language. Platform Independent and Multi-Threaded
		 * 
		 * 
		 * 1 - Java uses both compiler and interpreter. Java source code is converted
		 * into bytecode at compilation time. The interpreter executes this bytecode at
		 * runtime and produces output. Java is interpreted that is why it is
		 * platform-independent.
		 * 
		 * JAVA is platform-independent language, the JVM is platform-dependent.
		 * Different JVM is designed for different OS and byte code is able to run on
		 * different OS.
		 * 
		 * JAVA Program -> Java Compiler -> Java ByteCode -> Java Intrepreter -> Machine
		 * Code
		 *
		 *
		 *  Java Source Code (.java file)
       	 *		 ↓
		 *	Java Compiler (javac)
         *		 ↓
		 *	Java Bytecode (.class file)
         *		 ↓
		 *	Java Virtual Machine (JVM: Interpreter + JIT Compiler)
       	 *		 ↓
		 *	Machine Code (Executed by CPU)
		 *
		 *
		 *
		 *
		 *
		 * 
		 * 2 - Java supports call by value only. There is no call by reference in java.
		 * 
		 * 3 - Java is also an object-oriented language. However, everything (except
		 * fundamental types) is an object in Java. It is a single root hierarchy as
		 * everything gets derived from java.lang.Object.
		 * 
		 * 4 - Java does not support header files like C++. Java uses the import keyword
		 * to include different classes and methods.
		 * 
		 * Compilation Flow:
		 * 
		 * When we compile Java program using javac tool, the Java compiler converts the
		 * source code into byte code.
		 * 
		 * System.out.println() is used to print statement. Here, System is a class, out
		 * is an object of the PrintStream class, println() is a method of the
		 * PrintStream class.
		 */

		/*
		 * Difference between JDK, JRE, and JVM
		 * 
		 * JVM (Java Virtual Machine) is an abstract machine. It is called a virtual
		 * machine because it doesn't physically exist. It is a specification that
		 * provides a runtime environment in which Java bytecode can be executed.
		 * 
		 * JVM, JRE, and JDK are platform dependent because the configuration of each OS
		 * is different from each other. However, Java is platform independent.
		 * 
		 * The JVM performs the following main tasks:
		 * 
		 * Loads code Verifies code Executes code
		 * 
		 * 
		 * JRE is an acronym for Java Runtime Environment. The Java Runtime Environment
		 * is a set of software tools which are used for developing Java applications.
		 * It is used to provide the runtime environment. It is the implementation of
		 * JVM. It physically exists. It contains a set of libraries + other files that
		 * JVM uses at runtime.
		 * 
		 * JRE = JVM + Set of Libraries
		 * 
		 * The Java Development Kit (JDK) is a software development environment which is
		 * used to develop Java applications and applets. It physically exists. It
		 * contains JRE + development tools.
		 * 
		 * JDK = JRE(JVM + Set of Libraries ) + Development Tools
		 * 
		 * Byte code is an intermediate code between the source code and machine code.
		 * It is a low-level code that is the result of the compilation of a source code
		 * which is written in a high-level language. It is processed by a virtual
		 * machine like Java Virtual Machine (JVM).
		 * 
		 * Machine code is a set of instructions that is directly machine-understandable
		 * and it is processed by the Central Processing Unit (CPU). Machine code is in
		 * binary (0�s and 1�s) format which is completely different from the byte code
		 * and source code.
		 * 
		 * Components of JVM
		 * 
		 * Class Loader - The class loader has the purpose of loading class files. It
		 * helps accomplish three main functions: Loading, Initialization, and Linking.
		 * 
		 * JVM Stack -Java Stack stores frames. It holds local variables and partial
		 * results, and plays a part in method invocation and return. Each thread has a
		 * private JVM stack, created at the same time as thread.
		 * 
		 * A new frame is created each time a method is invoked. A frame is destroyed
		 * when its method invocation completes.
		 * 
		 * HEAP - Information of all objects is stored in the heap area. There is also
		 * one Heap Area per JVM. It is also a shared resource.
		 * 
		 * 
		 * Just-In-Time Compiler(JIT) : It is used to increase the efficiency of an
		 * interpreter. It compiles the entire bytecode and changes it to native code so
		 * whenever the interpreter sees repeated method calls, JIT provides direct
		 * native code for that part so re-interpretation is not required, thus
		 * efficiency is improved.
		 * 
		 * 
		 * Java Native Interface (JNI) :
		 * 
		 * It is an interface that interacts with the Native Method Libraries and
		 * provides the native libraries(C, C++) required for the execution. It enables
		 * JVM to call C/C++ libraries and to be called by C/C++ libraries which may be
		 * specific to hardware.
		 */
	}

}
