/*Substrings of the string
input   : s="abc";
output  : a
          ab
          abc
          b
          bc
          c
 */
package Strings;

class Problem22 {
    public static void main(String[] args) {
        String s = "abc";
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<=s.length();j++) {
                
                System.out.println(s.substring(i, j));
            }
            
        }
      


        
    }
     
}
