/*
input   : s = "aaabbcccc"
output  : a3b2c4
 */
package Strings;

class Problem24 {
    public static void main(String[] args) {
        String s = "aaabbcccc";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            int f = s.indexOf(c);
            int l = s.lastIndexOf(c);
            System.out.print(c+""+(l-f+1));
            i = l+1;
        }

    }
    
}
