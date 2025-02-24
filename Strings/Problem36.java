/*
Write a program to print the unique digits in the string
input   : s = "welcome 12 to 3 the 134 Coding 145 Hub"
output  : 12345
 */
package Strings;

class Problem36 {
    public static void main(String[] args) {
        String s = "welcome 12 to 3 the 134 Coding 145 Hub";
        String s2 = "";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                if(s2.indexOf(c)==-1) {
                    s2+=c;
                }
            }
        }
        System.out.println(s2);
    }
    
}
