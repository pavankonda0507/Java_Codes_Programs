/*
Print the first letter in the each word in a String 
input   : s = "Hello All How Are You";
output  : HAHAY
 */
package Strings;

class Problem2 {
    public static void main(String[] args) {
        String s = "Hello All How Are You";
        System.out.println(s.charAt(0));
        for(int i=1;i<s.length();i++) {
            char j = s.charAt(i);
            if(j==' ') {
                System.out.println(s.charAt(i+1));
            }
        }
/*
Print the last letter in the each word in a String 
input   : s = "Hello All How Are You";
output  : olweu
 */

        for(int i=0;i<s.length()-1;i++) {
            char j = s.charAt(i);
            if(j==' ') {
                System.out.println(s.charAt(i-1));
            }
        }
        System.out.println(s.charAt(s.length()-1));

        
    }    
}
