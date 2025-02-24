/* Reverse the each word in a string using reverse method  */
package Strings;

class Problem17 {
    public static void main(String[] args) {
        String s = "Hello all how are you",s2 = "";
        String str[] = s.split(" ");
        for(int i=0;i<str.length;i++) {
            String a = str[i];
            StringBuffer sb = new StringBuffer(a);
            sb.reverse();
            s2 = s2+sb.toString();
            s2+=" ";
        }
        System.out.println(s2);
    }
    
}
