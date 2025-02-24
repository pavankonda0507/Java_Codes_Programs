/* Reverse the each word in a string
input   : s = "Hello all how are you"
output  : s2 = "olleH lla woh era uoy"
 */
package Strings;

class Problem10 {
    public static void main(String[] args) {
        String s = "Hello all how are you",s2 = "";
        String str[] = s.split(" ");
        for(String i:str) {
            for(int j=i.length()-1;j>=0;j--) {
                s2+=i.charAt(j);
            }
            s2+=" ";
        }
        System.out.println(s2);
    }
    
}
