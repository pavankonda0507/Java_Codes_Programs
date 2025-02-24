/*
input   :s = "a1b3c5"
output  :1+3+5 = 9

 */
package Strings;

class Problem29 {
    public static void main(String[] args) {
        String s = "a1b3c5",s2 = "";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c>='1'&&c<='9') {
                s2+=c;

            }
        }
        int num = Integer.parseInt(s2),sum = 0;
        while(num!=0) {
            int dig = num%10;
            sum+=dig;
            num/=10;
            
        }
        System.out.println(sum);
        

        
    }
    
}
