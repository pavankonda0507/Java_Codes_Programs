/*
Print the words with maximum length
input   : s = "hello all good morningq everyone"
output  : morningq everyone
 */
package Strings;

class Problem27 {
    public static void main(String[] args) {
        String s = "hello all good morningq joy everyone",s2="";
        String str[] = s.split(" ");
        int max = str[0].length();
        for(int i=0;i<str.length;i++) {
            if(str[i].length()>=max) {
                if(str[i].length()>max) {
                    max = str[i].length();
                    s2 = str[i]+" ";
                }
                else {
                    s2 += str[i];
                }
                
            }
        }
        System.out.println(s2);

    }
    
}
