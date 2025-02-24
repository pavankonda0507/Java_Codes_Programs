/* Print the missing characters in the string
input   : s = "abcefhijmn"
output  : d
          g
          k
          l
 */
package Strings;

class Problem20 {
    public static void main(String[] args) {
        String s = "abcefhijmna";
        int j = 0;
        for(int i=s.charAt(0);i<=s.charAt(s.length()-1);i++) {
            
            if(s.charAt(j)!=(char) i) {
                System.out.println((char) i);
            }
            else {
               j++;
            }
        }
    }
}
