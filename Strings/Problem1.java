package Strings;

public class Problem1 {
    public static void main(String[] args) {
        String s = "Hello EvEry One How aRe YoU";
        String s2 = "";
        for(int i=0;i<s.length();i++) {
            char j = s.charAt(i);
            if(j>='a'&&j<='z') {
                j = (char) (j-32);      //System.out.println(j);   only printing without 
                s2+=j;

            }
            else if(j>='A'&&j<='Z') {
                j = (char) (j+32);      //System.out.println(j);
                s2+=j;
            }
            else if(j==' ') {
                s2+=" ";
            }
        }                                              
        System.out.println(s2);
    }
    
}
