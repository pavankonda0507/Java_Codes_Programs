/*
Check wether a string is palindrome or not
input   : "roor"
output  : Palindrome

input   : "root"
output  : Not palindrome
 */
package Strings;

class Problem4 {
    public static void main(String[] args) {
        String s = "roor";
        String s2 = "";
        for(int i=s.length()-1;i>=0;i--) {
            s2 += s.charAt(i);
        }

        if(s.equals(s2)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
    
}
