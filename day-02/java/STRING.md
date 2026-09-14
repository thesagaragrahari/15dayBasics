## 1. Java — String Foundations
- What is `String` in Java?
- String is sequence of character in Java. String is a linear data structure which is immutable. String in java is a is treated as very special data type too.



- Why is `String` a class/object rather than a primitive type?
- Sting is used for mutipurpose. A primitive data type can be mutable but string is immutable. By the string application it need to a reference variable like which can be acheived through objects or classes rather that primitive data types. 
- String immutability
- Immutability of string means string cannot be reassigned whenever we tries to reassign or concat in String. It generally creates a brand new string and points to that string. where as the previous string which it was pointing earlier got removed by garbage collector if any other variable is not pointing at that time.
- String literals and `new String(...)`
- String can be intiated by multiple type.
- String has a concept of String pool. In java string literals which are intiated using below given first version. They get assigned through a pool. If any literal is already existed in string pool the variable just points to it instead of creating new one.So it can be reused and as string is immutable if there is any concatation or reassignments happens it just create new or points another string already exists in String pool.p
  - 1.It can be directly assigned using String s = "Sagar";
  - 2 It can be assigned using class constructor too.
- `==` vs `.equals()` for Strings
- As we earlier discussed String variable stores addresses of actual string object.So when we compare string using == it compares the addresses of the object and if both objects have different addresses even if string literals are same it returns false. It happens sometimes because of different intiation style.
- Whereas equals compares the string litteral one by one so even if both string are stored at different addresses. They will be still the same so returns true for same literals.
- Basic methods: `length()`, `charAt()`, `substring()`
- String has method length() just like array has length attribute. It returns the size of String.
- charAt(i) works same as arr[i] it returns the character at the index given for a string.
- substring(): str.substring(start,end) it returns a substring from start index to end index where end index is non inclusive.n
- Why repeated String concatenation can be inefficient
- Each new concatenation creates a new String. So it become a memory burden if we are frequently concating in any string object. For this special use we uses StringBuffer and StringBuilder.w
- What `StringBuilder` is and when it is useful
- StringBuilder is a special type of string which become more useful when it comes to perform frequently CRUD operation on it.StirngBuilder is mutable type. So we can modify it as much we wanted. It also have some useful methods like sb.reverse() too.