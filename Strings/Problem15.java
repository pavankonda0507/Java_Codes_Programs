/* Write a program to print the sum of unique digits in a number
input   : num = 15372162
output  : 5+3+7+6=21
 */
package Strings;

class Problem15 { 
    public static void main(String[] args) {
        Integer num = 15372162,sum = 0;
        String s = num.toString(),s2 = "";
        for(int i=0;i<s.length();i++) {
            char j = s.charAt(i);
            if(s.indexOf(j)==s.lastIndexOf(j)) {
                s2+=j;
            }
        }
        System.out.println(s2);
        int num2 = Integer.parseInt(s2);
        while(num2!=0) {
            int dig = num2%10;
            sum+=dig;
            num2/=10;

        }
        System.out.println(sum);
    }
    
}
