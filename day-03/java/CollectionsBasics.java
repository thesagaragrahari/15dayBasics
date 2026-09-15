/*
ArrayList: add, get, update, remove, search.
LinkedList: add, get, remove; add a short comment explaining why indexed access differs from ArrayList.
HashSet: add duplicates and demonstrate that duplicates are not retained.
HashMap: put, get, containsKey, remove, and duplicate-key replacement.
Create two separate String objects with the same content and demonstrate equals() and hashCode() behavior.
*/

import java.util.*;
class CollectionsBasics{
    
    public static List<Integer> arrayListBasics(){
        List<Integer> list = new ArrayList<>();
        list.add(1); // adds value a 0 index avarage motarized O(1)
        list.add(2); // do same for 1st index 
        list.add(4);
        list.add(5);
        list.get(0); //return the value at index 0 O(1)
        list.set(2,10);// it shifts all values after index 2 to next index and at index 2 stores the element. So it will take avarage O(n) for shifting elements not accessing time.
        list.remove(2); // it removes the element at index 2 and shift the remaining elements to one index prior
        list.indexOf(2); // it returns the index of the first occurance of the elements else -1 average O(n)
        list.contains(2); // it returns boolean and check if data exists of not average O(n)
        return list;
    }

    public static LinkedList<Integer> linkedListBasics(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); // adds value a 0 index avarage
        list.add(2); // do same for 1st index 
        list.add(3);
        list.add(4);
        list.add(5);
        list.get(1); //return the value at index 1 but in traverse from start to get that index 
        list.set(3,10);// In this pointer takes overall O(n) to reach at index 3 and the updation time is O(1) so total cost = O(n) + O(1) ~ O(n) average
        list.remove(1); // same as updation.
        list.contains(2); // it returns boolean and check if data exists of not average O(n)
        return list;
    }

    public static void setBasics(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);
        if(set.contains(3))// this will check the element 3 exists or not returns boolean
            set.add(4); // this will add 4 one more time but it will still unique in set.
        System.out.println(set);
        // if we remove now the set will remove the unique value 4
        set.remove(4);
        System.out.println(set);
    }

    public static void mapBasics(){
        Map<String,String> map = new HashMap<>();

        map.put("Angel","25dec");
        map.put("Shubh","17sep");
        map.put("Sagar","14sep");
        map.put("Chahat","14sep");
        map.put("Vishnu","13sep");

        if(map.containsKey("Shubh"))// this method checks key exist and returns boolean
            map.put("Sakshi","7jun"); // it will put one more element
        System.out.println(map);
        map.put("Sakshi","6jun");// it will update as we know the key already exists
        System.out.println(map);
        map.remove("Sakshi");// if we remove the key it will remove the whole object also it doesn't restore the previous value

        System.out.println(map);

        System.out.println(map.get("Angel"));// it will return the value associated with the given key.

    }

    public static void equalsVsHash(){
        String str = "Sagar";
        String str2 = new String("Sagar");
        if(str.equals(str2))
            System.out.println("Equals is working fine");

        int hstr = str.hashCode();
        int hstr2 = str2.hashCode();

        if(hstr == hstr2)
            System.out.println("Hashcodes are also same");
        int hstr3 = "Angel".hashCode();
        if(hstr3==hstr2)
            System.out.println("Hashcode for diff string are same");
        else
            System.out.println("hash collision not happend for these strings");
    }

    public static void main(String args[]){
        System.out.println(arrayListBasics());
        System.out.println(linkedListBasics());
        setBasics();
        mapBasics();
        equalsVsHash();
    }
}