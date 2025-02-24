package Strings;

class Creation {
    public static void main(String[] args) {
        String s = new String("Pavan"); //String object
        String s1 = "Pavan";                     //String literal
        String s3="";
        /*The == operator compares the reference or memory location of objects in a heap, 
        whether they point to the same location or not*/                     
        System.out.println(s==s1);      
        
        /*
        The Java string equals() method, compares two strings and returns true 
        if all characters match in both strings, else returns false
         */
        System.out.println(s.equals(s1));    
        System.out.println(s3); 
        System.out.println(s.length());     //Gives the length of the String  
    }
    
}
