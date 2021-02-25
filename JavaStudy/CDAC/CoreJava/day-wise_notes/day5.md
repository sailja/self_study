# Contents:
* [Interfaces](#interfaces)

# Interfaces in Java:
<a name='interfaces'></a>

## What is interface ?
An interface in java is a blueprint of a class.  
It has `public static final` data members and `public abstract` methods only. Even if we don't write these while defining interfaces, the compiler will add these automatically.  

The interface in java is a mechanism to achieve fully abstraction. There can be only abstract methods in the java interface not method body(true till JDK 1.7). It is used to achieve full abstraction and multiple inheritance in Java.  
Java Interface also represents IS-A relationship.  
It cannot be instantiated just like abstract class.    

## Why Java Interfaces?
1. It is used to achieve full abstraction.  
2. By interface, we can support the functionality of multiple inheritance.  
3. It can be used to achieve loose coupling- (Interfaces allow complete separation between WHAT(specification or a contract) is to be done Vs HOW (implementation details) it's to be done.  

__Example:__  
In JDBC (java db connectivity)  
java.sql.Connection i/f ----Sun  
Implementing classes -- DB vendors --  
Oracle --Oracle DB engine --Implementation cls for Comnection i/f  
Red Hat -- Mysql -- Implementation cls for Connection i/f  

__NOTE:__ The java compiler adds public and abstract keywords before the interface method and public, static and final keywords before data members.

# Syntax of interface:
```javascript
default(no modifier)/public interface <Name> extends <comma separated list of super i/fs> {
   //data members --- public static final
   int data=100;
   //methods -- public abstract
   double calc(double d1,double d2);
}
// Implementing class syntax:
default(no modifier)/public class <Name> extends <SuperCls> implements <comma separated list of  i/fs> {
   //Mandatory for imple class to be non-abstract(concrete): MUST define/imple all abstract methods from all i/fs.
}
```

## Example of implementing Interfaces:
1. Relationship between classes and interfaces:  
    A class extends another class, an interface extends another interface but a class implements an interface.  

2. Multiple inheritance in Java by interface: 
    If a class implements multiple interfaces, or an interface extends multiple interfaces i.e. known as multiple inheritance. Example:
    ```java
    interface Printable{  
        void print();  
    }  
    
    interface Showable{  
        void show();  
    }  
    
    class A implements Printable,Showable {
    
        @Override
        public void print() {
            System.out.println("Hello");
        }  
        
        @Override
        public void show() {
            System.out.println("Welcome");
        }  
        
        public static void main(String args[]) {
            A obj = new A();  
            obj.print();  
            obj.show();  
        }  
    }
    ``` 
__NOTE:__ Multiple inheritance is not supported through class in java but it is possible by interface, why?  
Multiple inheritance is not supported in case of class, since it can create an ambiguity. But it is supported in case of interface because there is no ambiguity as implementation is provided by the implementation class.  
  
__NOTE:__ In order to access a data member of the interface, the implementing class can directly access it, and a non-implementing class need to access it as it does for a Static data-member of a class.(<interface_name>.<data-member_name>). A lot of examples can be seen in the classword of Day-5 and can be viewed here: [day-5 examples](https://github.com/umangsh454/self_study/tree/main/JavaStudy/CDAC/CoreJava/code_files/day5/classwork/src)  

__NOTE:__ If a class that is implementing an interface, it has to implement all the functions, or else it'll give a compiler error. To fix this, you have to make the implementing class as abstract class.  

__NOTE:__ When implementing more than one interfaces, we have to give the implementations of all the functions in all the imlementing interfaces. And if we have the same constant data members in different interfaces, to reduce the ambiguity we have to use it by the syntax: `<interface name>.<data member name>`.  

__NOTE:__ When implementing more than one interfaces, if the signature of the function is different in those interfaces but with the same name, you will have to implement all those functions as overloaded functions in your implementing class. Example:
```java
// Interface 1
public interface Printable {
	double SIZE=10;
	void print();
}

//Interface 2
public interface Sortable {
		double SIZE=100;
		void print(int data);
}

//Implementing class
public class MyImpleClass implements Printable, Sortable {
	@Override
	public void print() {
		System.out.println("in my print " + Sortable.SIZE);
	}
	@Override
	public void print(int data) {
		System.out.println("in overloaded print with int");	
	}	
}
```

__NOTE:__ When implementing more than one interfaces, if the signature and the name of the function is same in those interfaces but with different return types, the implementing class will show a compiler error, as the compiler cannot differentiate between those. 
```java
// Interface 1
public interface Printable {
	double SIZE=10;
	void print();
}

//Interface 2
public interface Sortable {
		double SIZE=100;
		int print();
}

//Implementing class
public class MyImpleClass implements Printable, Sortable {
	@Override
	public void print() {
		System.out.println("in my print " + Sortable.SIZE);
	}
}
```
This cannot be done and the error is:
```output
.\p4\MyImpleClass.java:3: error: MyImpleClass is not abstract and does not override abstract method print() in Printable
public class MyImpleClass implements Printable, Sortable {
       ^
.\p4\MyImpleClass.java:7: error: print() in MyImpleClass cannot implement print() in Printable
        public void print() {
                    ^
  return type void is not compatible with int
2 errors
```
__NOTE:__ If an interface extends another interface and you're implementing the sub-interface, you have to implement the defination of all the methods in the sub-interface as well as super-interface. Example:
```java
//Interface 1
public interface A {
	double calc(double d1,double d2);
}

//Interface 2
public interface B extends A{
	void show();
}

//Implementing class
public class C implements B{

	@Override
	public double calc(double d11, double d12) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub	
	}
}
```

__NOTE:__ In java, a single class can extend only one class, but an interface can extend more than one interfaces. Example:
```java
//Interface 1
public interface A {
	double calc(double d1,double d2);
}

//Interface 2
public interface B {
	void show();
}

//Interface 3
public interface B1 extends A, B {
  void test();
}

//Implementing class
public class C implements B1{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calc(double d1, double d2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub	
	}
}
```
