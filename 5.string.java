/* Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. 
The java.lang.String class is used to create a string object.
Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a 
reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed 
in the pool.
Ex : String s1 = "hello";
     String s2 = "hello";
There are two ways to create String object:
1.By string literal
2.By new keyword                                           */
class string {
    public static void main(String[] args) {

        //String denoted with " "
        //String objects are stored in a special memory area known as the "string constant pool".

        String s1 = new String("Pavan");
        String s2 = "Java";
        System.out.println(s1);
        String s3 = "Java";
        String s4 = new String("Java");

        /*In the above example, only one object will be created. Firstly, JVM will not find any string object with the value 
        "Java" in string constant pool that is why it will create a new object. After that it will find the string with the 
        value "Java" in the pool, it will not create a new object but will return the reference to the same instance. */

        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s3.concat("Script"));

        System.out.println(s2==s3);

        System.out.println(s3==s4);

        System.out.println(s3.equals(s4));

        System.out.println(s2.equals(s3));
    }
}