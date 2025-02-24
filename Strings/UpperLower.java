package Strings;

class UpperLower {
    public static void main(String[] args) {
        String s = "Hello Everyone",s2 =  "Good Morning";
        //Lowercase
        System.out.println(s.toLowerCase());        //Here we are only printing not storing
        s = s.toLowerCase();                        //Here we are storing so the s value is updating
        System.out.println(s);


        //Uppercese
        s2 = s2.toUpperCase();
        System.out.println(s2);

    }
    
}
