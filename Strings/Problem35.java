/* check whether a number is even or odd in the string
 input  : s = "2Hello 12, 13 all 0 good 234& morning12"
 output : 2,12,0,234,12
 */
package Strings;

class Problem35 {
    public static void main(String[] args) {
        String s = "2Hello 12, 13 all 0 good 234& morning 12",s2="";
        int num = 0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                num = num*10+Character.getNumericValue(c);
                s2+=c;
                if(i==s.length()-1) {
                    if(num%2==0) {
                        System.out.println(num);
                    }
                }

            }
            else {
                if(num%2==0&&s2!="") {
                    System.out.println(num);
                }
                num = 0;
                s2="";
            }
        }
    }
    
}
