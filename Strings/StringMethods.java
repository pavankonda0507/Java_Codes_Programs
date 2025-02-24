package Strings;

class StringMethods {
    public static void main(String[] args) {
        String s = "hello all";
        System.out.println(s);
        String s2 = "hellO all";
        System.out.println(s2);
        // //trim() method removes the all whitespaces from both ends of the string
        // String s2 = s.trim();
        // System.out.println(s2);  //s2 = Hello all

        // /*replace() Searches a string for a specified value, and returns a new string 
        // where the specified values are replaced*/
        // String s3 = s2.replace('l','i');
        // System.out.println(s3);  //s3 = Heiio aii

        // String s4 = s2.substring(1,8);
        // System.out.println(s4);

        //Replace every match of a regular expression with a substring
        String s5 = s2.replaceAll(s2,"Pavan");
        System.out.println(s5);


        // //The contains() method checks whether a string contains a sequence of characters.
        // //Returns true if the characters exist and false if not.

        // boolean b = s2.contains("o a");

        // //It returns the asciivalue of the character at tha index
        // System.out.println(b);
        // System.out.println(s2.codePointAt(s2.indexOf("Hello")));

        // int a = 'H',b = 'h';
        // System.out.println(a+" "+b);
        // int num = s.compareToIgnoreCase(str);
        // System.out.println(num); 

        // String s6 = String.join("-",s,str);
        // System.out.println(s6);

        
        // String st = "   ";

        // boolean b1 = st.isEmpty();
        // System.out.println(b1);

        // boolean b2 = st.isBlank();
        // System.out.println(b2);

        System.out.println(s.startsWith("hello"));
        System.out.println(s.endsWith("l"));
        System.out.println(s.endsWith("all"));
    }    
}