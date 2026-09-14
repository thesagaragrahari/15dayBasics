## 1. Java — String Foundations

- What is `String` in Java?
- String is sequence of character in Java. String is a linear data structure which is immutable. String in java is a is treated as very special data type too.
- Why is `String` a class/object rather than a primitive type?
  - String is a class / object because java string needs to so the behaviour of object oriented which it shows using method like length() , charAt(index) etc. 
  - String class is specially designed in java to be immutable.
- String immutability
  - Whenever we modify any object if that variable refers to a new objects instead of inplace modification of already refering object. In is called immutable object. And the quality considered as immutability. 
  - Like when we create a String s  = "Sagar";
  - If we modifies is as s = s+" Agrahari"; It creates a new object and points to that. The older object "Sagar" still remains in String pool which can be captured by garbage collector.
- String literals and `new String(...)`
- String can be intiated by multiple type.
- String has a concept of String pool. In java string literals which are intiated using below given first version. They get assigned through a pool. If any literal is already existed in string pool the variable just points to it instead of creating new one.So it can be reused and as string is immutable if there is any concatation or reassignments happens it just create new or points another string already exists in String pool.p
  - 1.It can be directly assigned using String s = "Sagar";
  - 2 It can be assigned using class constructor too.
- `==` vs `.equals()` for Strings
  - String's == compares the reference object of both variables are same or not. equals() compares the content of both string. And these both return boolean

- Basic methods: `length()`, `charAt()`, `substring()`
- String has method length() just like array has length attribute. It returns the size of String.
- charAt(i) works same as arr[i] it returns the character at the index given for a string.
- substring(): str.substring(start,end) it returns a substring from start index to end index where end index is non inclusive.n
- Why repeated String concatenation can be inefficient
- Each new concatenation creates a new String. So it become a memory burden if we are frequently concating in any string object. For this special use we uses StringBuffer and StringBuilder.
- What `StringBuilder` is and when it is useful
- StringBuilder is a special type of string which become more useful when it comes to perform frequently CRUD operation on it.StringBuilder is mutable type. So we can modify it as much we wanted. It also have some useful methods like sb.reverse() too.
