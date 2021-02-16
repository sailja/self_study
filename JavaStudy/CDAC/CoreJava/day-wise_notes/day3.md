# Contents:
* [Java Arrays](#java_arrays)


# Java Arrays:
<a name='java_arrays'></a>

- Arrays are a list of homogenous elements with fixed lenth.
- Java Arrays are always created as an Object. Thus the array whether be it primitive type array or a reference type array object, it's memory will be allocated on Heap.  
- Java Arrays are Immutable in nature, i.e., array sizes cannot be modified.
- Even though arrays are immutable, but the reference to those array objects are not. So, we can reasign the array reference with a different array altogether of the same type.  
- The things need to create an array are the name, type and the length. Without any of these three items, we cannot create an array.  
- Arrays have a data member callecd `length`, so we don't have to call a function to find out the length of the array.
- Array object is created by JVM, so there is no specific array class that is loaded in Method Area. But depending on the array, we can deduce what will be the name of the class loaded in Method Area.  
- For a single dimensional array object of integer type, the class loaded in JVM Method Area is: `[I`.  
- For double, it is: `[D`.  
- For a multi-dimensional array of integer type, the class loaded will look like: `[[I`, and so on it goes.
- For a use-defined reference type array, the object created is: `[Lcom.app.core.Box`.  
- For-each method to iterate over each element in java:
```java
for (double d: array) {
    System.out.println(d);
}
```
- For-each loop always move in the forward direction with a step count of 1.

__NOTE:__ For-each loop always works on a copy. So it copies the variable into a local stack variable, and does operation on it. And thus for-each cannot be ever used to populate the contents of an array.

- Example of usage of primitive array:  
[TestPrimArray.java](../code_files/day3/classwork/src/com/app/tester/TestPrimArray.java)  

- Example of usage of reference type array:  
[Box.java](../code_files/day3/classwork/src/com/app/core/Box.java)  
[TestRefArray.java](../code_files/day3/classwork/src/com/app/tester/TestRefArray.java)  

## Memory picture of Arrays:
![image](../additional_resources/array_mem_picture.png)
