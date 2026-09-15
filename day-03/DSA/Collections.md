1. Why does Java need the Collections Framework when arrays already exist?
  1. Java already has arrays but arrays has fixed size. It cannot be resize dynamically. It also cannot be used for multiple real world problems's solution directly. Here comes the java collection. It is a group of interfaces and classes where each group of classes / interfaces solves a different real world problem.
    1. List (Inteface) , ArrayList(class) both are dynamic arrays which handles resizing better than arrays.
    2. Set(Interface) , HashSet(class) both used to store unique elements.
    3. Map(Interface) , HashMap(class) these store the key-value pair. It is very useful in real world backend engineering. Keys of map must be unique where as values can be duplicate. Map is also not inherits the collection class.
    4. LinkedList is a collection which is used when frequently data insertion / modification / deletion needed while the current node is known.
2. Explain `List`, `Set`, and `Map` with one practical example for each.
  1. List : We can fetch rows of databases directly into a list . like List findByFamilyId(String familyId);
  2. Set : Set used to store unique elements. If we have a list of duplicate elements we can directly store it into set like :: Set s = Set.of(listofInteger);
  3. Map : Map can be used to find duplicate elements while we can store the visited elements inside it.
3. Why is `Map` not a subtype of `Collection`?
  1. Collection is a interface which defines as group of same kind of elements whereas Map stores key-value pairs and represents the relationship. So logically it should not directly inherit the Collection interface.
4. Explain how `ArrayList` is different from a normal array internally/conceptually.
  1. ArrayList can be defined as dynamic array. Concepty it also uses index and value and stores data like array does. But the key difference it can resize automatically. When a new element need to insert it checks if size is full it creates a new bigger array and copies whole data and insert new one to that array. It all happens underhood and we don't need to care about it.
5. Why is `ArrayList.get(index)` O(1)?
  1. ArrayList uses the same calculation to find the element. ArrayList's base address+(size of element stored x index ) . It doesn't need to traverse from start to that index. It uses random access just like array.
6. Why can inserting/removing in the middle of an `ArrayList` be O(n)?
  1. When we need to perform operation like insertion / removing in the middle , the arraylist elements need to be shifted and at worst case the whole list need to be shifted so it causes the complexity of O(n) .
7. Explain why `LinkedList.get(index)` is O(n).
  1. LinkedList is a data structure or collection which are nodes connected from start to end. In java linkedlist is formed using a two pointer node. Each node have data , prev nodes pointer and next node pointer . So when we need to fetch a value using a index in a linkedlist the iterator goes from head to that node one by one. So it is the reason it causes O(n).
8. Explain hashing using your own bucket/locker analogy.
  1. For example HashMap uses hashCode to store the elements. It is like using a array of buckets/lockers. The HashMap uses hashfunction to hash the element. When any elements comes to get inserted the hashfunction hashes it and then it get decided in which bucket it will be store. Sometimes multiple values get inserted in same bucket so these bucket then implements as linkedlist.
9. What is a hash collision and why can it happen?
  1. Multiple object can generates same hashcode using a hashfunction when it happens it is called hash collision. It happens because of algorithm used in hash function mainly.
10. Why do we say HashMap/HashSet operations are average-case O(1), rather than simply O(1)?
  1. HashMap/HashSet uses hashCode to store the elements. It is like using a array of buckets/lockers. each bucket stores a list of connected nodes. So when need to fetch data we generally don't have to traverse all over the HashMap/HashSet. We just look up to a particular bucket.
11. What happens when the same key is inserted into a HashMap twice?
  1. When we insert same key with some value twice in the HashMap the second value with the same key overrides.
12. Explain the relationship between `equals()` and `hashCode()`.
  1. equals() compares the content of two objects. But hashCode() uses hash function to hash both object and compares their hashes.
    two objects are equals then their hashcode will be the same. But vice versa can be true or false.
