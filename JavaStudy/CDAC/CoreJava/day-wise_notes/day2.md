# Contents: 
* [Rules for naming an identifier](#rules_for_naming_an_identifier)
* [Conversion in Primitive Data Types](#conversion_in_primitive_data_types)
* [JVM Data Areas](#jvm_data_areas)

<hr>

# Rules for naming an identifier:
<a name='rules_for_naming_an_identifier'></a>

* All variable names must begin with a letter of the alphabet, an underscore ( _ ), or a dollar sign ($).  
* Can't begin with a digit.  The rest of the characters may be any of those previously mentioned plus the digits 0-9.  
* Can't use a keyword as an identifier.
* The convention is to always use a lower case letter of the alphabet as the first letter and then camel casing. 
* The dollar sign and the underscore are discouraged.

# Conversion in Primitive Data Types:
<a name='conversion_in_primitive_data_types'></a>
There are two types of conversion:
1. Automatic conversion/Widening/Type Promotion/Implicit.(performed by Compiler)
2. Downcasting/Narrowing/Explicit.(performed by user)

Examples:
When we convert a byte type of data to short, it is automatically done, as short has a higher bucket size, and thus compiler can easily convert it, without altering it's value.
```java
byte b = 10;
short s = b;
```
The above piece of code won't give an error, as byte can be automatically converted into short. But not the other way around.

The whole cycle of automatic conversion is:  
![image](../additional_resources/type_conversion.png)

The Java Compiler has to follow certain rules when doing automatic conversions:  
    * The source type and the destination types must be compatible.  
    * The destination type must be larger and thus should be able to hold larger value.  

Long to float is also considered as an automatic conversion, even if long is 8 bytes and float is 4 bytes in size. This is because float allows you to store larger values with a loss of some precision.

__NOTE:__ In Java most optimized data type is considered as int, because of the word size of the operating system, and the number of bytes a computer can read at the same time. So any operation which involves _byte_ or _short_ type of data will automatically be promoted to int and then carried out.

Narrowing conversion/forced conversion(type-casting):   
    double ---> int  
    float --> long  
    double ---> float  

How it's done:
```java
double a = 5.6;
int x = (int)a;
```

__NOTE:__ 
* Java Compiler(javac) doesn't allow accessing any un-initialized variable. Any method local variables that are allocated on stack are uninitialized by default(hold garbage value) and thus if we have n't assigned a value to it, it'll give a compiler error.  
* In Java, an if condition requires a boolean expression, anything other than that won't work- 0 or 1 like in C/C++.
* When storing data into a variable, if we give data more than it's size, it gives an error that we're trying to convert a higher data type to a lower data type. Example:
```java
byte b = 12222;
```
```console
$ javac test.java
test.java:3: error: incompatible types: possible lossy conversion from int to byte
                byte b = 12222;
                         ^
1 error
```
* Compiler cannot find out what the value will be after the execution/runtime. So, the below code doesn't give an error:
```java
byte b1 = 127;
byte b2 = b1++;
```
This does n't give an error and stores the information. The value stored in b1 and b2 is 127 and then the value in b1 is updated to -128.
* When using short hand notation, it'll automatically do the explicit type-casting. Example:
```java
byte a = 1, b = 2;
a = a + b;  // Compiler error
a += b;     // No compiler error
```

__NOTE:__ 
    
    c, c++,java are statically typed languages where data type is already known at compile time.
    Once a variable is declared to be of a certain data type, it cannot hold values of other data types.
    Dynamically typed languages -> javascript,  Ruby, Python

    Java is  strongly-typed programming language.
    primitive data types (such as integer, character, etc.) are predefined as part of the language and 
    all constants or variables defined  must be described with one of the data types (no type inferencing is supported)

    Meaning of type inferencing:Like in JavaScript there is no need to declare a varible as some type, it is already inferred what the data type of the Variable would be.
    Ex: var x=5;(Here x is already inferred as to of int type)

__NOTE:__

    Java is not truely object oriented b'coz there are a few object-oriented priciples that it doesn't support.
    For ex:Multiple Inheritence,Operator Overloading,Not everything here is an object.
    Java also supports functional programming paradigm.

# JVM Data Areas:
<a name='jvm_data_areas'></a>

For this, let's look at the JVM architecture again:
![image](../additional_resources/JVM-architecture.png)

When we run a java program, we start the JVM(using `java` command) that is a process on the Operating System. The operating system allocates some memory to the JVM and this memory will be divided into different parts for different purposes.  

## Method Area: 
* The 'Class Loader Subsystem' will load/store the class information into the method area.Thus, __method area is used to store class specific information__. 
* Java 8 onwards the name of the method area is called __Metaspace__. Till Java 7 it was called __Permanent Generation Space(PermGen Space)__.  
* The _PermGen Space_(mehtod area till java 7) was fixed in size and when we kept on adding classes to the program, it gave us Out of Memory errors.  
* MetaSpace is allocated memory from the native memory of the computer and it is not on the Vitual Memory which has a fixed size. So theoritically, this won't go Out of Memory.
* One Method Area per JVM- One method area will be shared accross multiple threads belonging to the same JVM isntance.

## Object Heap:
* In Java, there is no concept of Local Object. All the objects are created dynamically using 'new' keyword and thus the objects are stored in the Object Heap.
* Object has a state and a behavior. State of an object are the non-static data members. And behavior of the object is the functions that the object can be performed upon. 
* Object Heap will only save the state of the object. The behaviour of the object is stored in the mehtod area with the class information.
* One Object Heap per JVM- One Object Heap will be shared accross multiple threads belonging to the same JVM instance.

## Java Stacks:
* One stack per thread.  
![image](../additional_resources/java_stacks.png)  
* Stack will hold method arguments, method local variables and the return types.
* Each stack consists of different stack frames which are different function calls.
* Whenever a new function is called, it's stack frame is created and in this stack frame, all method local data is stored.

## PC Registers: 
* This will store the address of the next line of code to execute.
* This will be one per thread.

## Java Native Stacks:
* Java provides us with a Java Native Interface(JNI) using which we can call a C/C++/Assembly method from a java program. 
* All method local runtime information of the native methods are stored in Native Method Stack.
* One Per thread.