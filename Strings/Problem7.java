/*
Count the no of vowels in the each wordd of a string
intput  : s="hello all how are you"
output  : hello 2
          all 1
          how 1
          are 2
          you 2
*/

package Strings;

class Problem7 {
    public static void main(String[] args) {
        String s = "hello all how are you";
        String str[] = s.split(" ");
        for(String i:str) {
            int count = 0;
            for(int j=0;j<i.length();j++) {
                char k = i.charAt(j);
                if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u') {
                    count++;
                }
            }
            System.out.println(i+" "+count);
        }
    }
    
}
