/* Find the greatest number and smallest number in the string
input   : s = "Java 10 is 123 object36 oriented 223 programming 920 language"
output  : max = 920
          min = 10
 */
package Strings;

class Problem38 {
    public static void main(String[] args) {
        String s = "Java 10 is 123 object36 oriented 223 programming 920 language",s2="";
        int num = 0,max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if((i==s.length()-1||!Character.isDigit(c))&&s2!="") {
                if(num>max) {
                    max = num;
                }
                if(num<min) {
                    min = num;
                }
                num = 0;
                s2="";

            }
            else if(Character.isDigit(c)) {
                num = num*10+Character.getNumericValue(c);
                s2+=c;
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);

    }
    
}
