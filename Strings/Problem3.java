/*
Calculate no of words in a string
input   :  s = "Can you please introduce yourself";
output  :  5
 */
package Strings;

class Problem3 {
    public static void main(String[] args) {
        String s = "Can you please introduce yourself";
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==' ') {
                count++;

            }
        }
        System.out.println("No of words in string: "+(count+1));
    }
    
}
