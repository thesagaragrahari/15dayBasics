/*
1. `==` vs `.equals()`
1. String immutability
1. String concatenation
1. A simple use of `StringBuilder`
Do not just print results. Add short comments explaining what each experiment proves.

*/
class JavaStringBasics{
    public static void main(String args[]){

        /* == and equals() */
        
        String s1 = "Sagar"; // creating from string pool
        String s2 = new String("Sagar"); // creating a brand new object
        System.out.println(s1==s2); // both are referencing diff vars so it will return false
        System.out.println(s1.equals(s2));// even though both are referencing diff vars but their hash will be the same so will return true

        /* String immutability */
        String s3 = "Sagar";
        System.out.println(s1==s3);// it will return true because s3 will point the same object which resides under string pool and currently pointed by s1 too.
        /*String concatenation */
        s3 = s3+" Agrahari";
        System.out.println(s3==s1); // After concating s3 doesn't change the actaul object instead it creates a new one and points to that new objects so will return false.

        StringBuilder sb = new StringBuilder("Sagar");
        System.out.println(Integer.toHexString(System.identityHashCode(sb)));
        sb.append(" Agrahari");
        System.out.println(Integer.toHexString(System.identityHashCode(sb)));
        // These both lines will print same address because StingBuilder don't change the creates new object just like String but it modifies the same object.


        /*
        Finally we can say when we need immutability and reusability like storing password or auth token we should use string
        But when we need to store continuously changing values we should use StringBuilder.
         */
    }
}
