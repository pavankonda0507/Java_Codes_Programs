/*
Take an string with alphabets,numbers,symbols and spaces extract alphabets from them and check weather
it is palindrome or not
input   : s = "ma9%l*a )45y6! a432l a$#m";
          s2 = malayalam
          reverse
          s3 = malayalam
output  : Palindrome
 */
package Strings;

class Problem5 {
    public static void main(String[] args) {
        String s = "ma9%l*a )45y6! a432l a$#m";
        String s2 = "", s3 = "";
        for(int i=0;i<s.length();i++) {
            char j = s.charAt(i);
            if((j>='a'&&j<='z')||(j>='A'&&j<='Z')) {
                s2 += j;
            }
        }
        System.out.println(s2);
        for(int i=s2.length()-1;i>=0;i--) {
            char j = s2.charAt(i);
            s3 += j;
        }
        System.out.println(s3);
        if(s2.equals(s3)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
