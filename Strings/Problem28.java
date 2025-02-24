/*Print the missing elements in the string with duplicate elements and 
string not in sorted order
input   : "hyduhdsbdgduwbshssydhbjuquoqpqpam"
output  : cefiklnrtvx
*/
package Strings;

import java.util.Arrays;

class Problem28 {
    public static void main(String[] args) {
        String s = "hyduhdsbdgduwbshssydhbjuquoqpqpam",s2 = "",s3="";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)) {
                s2+=c;
            }
            if(s.indexOf(c)!=s.lastIndexOf(c)) {
                if(s3.indexOf(c)==-1) {
                    s3+=c;
                }
            }
        }
        String s4 = s2+s3;
        char ch[] = s4.toCharArray();
        Arrays.sort(ch);
        int x = 0;
        for(char i=ch[0];i<ch[ch.length-1];i++) {
            if(ch[x]!=i) {
                System.out.print(i+" ");
            }
            else {
                x++;
            }

        }
        

    }
    
}
