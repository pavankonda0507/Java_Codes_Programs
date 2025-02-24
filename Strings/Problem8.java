/*
Write program to find the unique and duplicate characters in string
input   : s = "welcome to coding hub"
output  : Unique s2 = "wlmtdinghub"
          Duplicate s3 = "eco"
 */
package Strings;
class Problem8 {
    public static void main(String[] args) {
        String s = "welcome to coding hub",s2 = "";
        System.out.println("Unique elements");
        for(int i=0;i<s.length();i++) {
            char j = s.charAt(i);
            if(s.indexOf(j)==s.lastIndexOf(j)) {
                s2+=j;
            }
        }
        System.out.println(s2);

        System.out.println("_____________________________");
        
        System.out.println("Duplicate elements");
        String s3 = "";
        for(int i=0;i<s.length();i++) {
            char j = s.charAt(i);
            if(s.indexOf(j)!=s.lastIndexOf(j)) {
                if(s3.indexOf(j)==-1) {
                    s3+=j;
                }
            }
        }
        System.out.println(s3);
    }
}