/*
print the sum of the numbers in the string
input   : s = "Hello 12, 13 all good 234& morning 12"
output  : 12+13+234+21 = 280
 */
package Strings;

class Problem34 {
    public static void main(String[] args) {
        String s = "Hello 12, 13 all 0 good 234& morning 21",s2="";
        int num = 0,sum = 0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                num = num*10+Character.getNumericValue(c);System.out.println(num);
                s2+=num;
                if(i==s.length()-1) {
                    sum=sum+num;   
                }
            }
            else if(s2!="") {
                sum+=num;
                num=0;
                s2="";
                System.out.println(sum);

            }
        }
        System.out.println(sum);
    }
    
}
