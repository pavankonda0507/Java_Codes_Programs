/* 
input   : s = "hello all good morning everyone"
output1 : HELLO lla GOOD gninrom EVERYONE(Even index capitalize and odd index reverse) 
*/

package Strings;

class Problem25 {
    public static void main(String[] args) {
        String s = "hello all good morning everyone",s2 = "";
        String str[] = s.split(" ");
        for(int i=0;i<str.length;i++) {
            String j = str[i];
            if(i%2==0) {
                s2=s2+j.toUpperCase();
            } 
            else {
                StringBuffer sb = new StringBuffer(j);
                sb.reverse();
                s2+=sb.toString();
            }
            s2+=" ";
        }
        System.out.println(s2);
    }
}
