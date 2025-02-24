/* Write a program to print the vowels and no of vowels in a word of a string
input   : s = "Bahubali Devara Pushpa Kalki GameChanger GunturKarma"
output  : Bahubali auai 4
          Devara eaa 3
          Pushpa ua 2
          Kalki ai 2
          GameChanger aeae 4
          GunturKaram uuaa 4
*/
package Strings;

class Problem16 {
    public static void main(String[] args) {
        String s = "Bahubali Devara Pushpa Kalki GameChanger GunturKaram";
        String str[] = s.split(" "),s2 = "";
        for(String i: str) {
            int count=0;
            for(int j=0;j<i.length();j++) {
                char k = i.charAt(j);
                if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U') {
                    s2+=k;
                    count++;
                }
            }
            System.out.println(i+" "+s2+" "+count);
            s2="";
        }
    }
    
}
