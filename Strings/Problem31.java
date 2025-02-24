/*
input   : s = "a2b3c4"
output  : aabbbcccc
 */
package Strings;

class Problem31 {
    public static void main(String[] args) {
        String s = "a2b3c4";
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++) {
            char a = ch[i];
            if(a>='1'&&a<='9') {
                int num = Character.getNumericValue(a);
                for(int j=0;j<num;j++) {
                    System.out.print(ch[i-1]);
                }
            }
        }
    }
    
}
