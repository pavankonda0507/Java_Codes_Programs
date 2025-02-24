/* Capitalize the first letter in the word of a string and print the first letter 
   if it is capital then dont change it*/
package Strings;

class Problem19 {
    public static void main(String[] args) {
        String s = "Hello all how are you",s2=" ";
        String str[] = s.split(" ");
        for(String i:str) {
            if(i.charAt(0)>='a'&&i.charAt(0)<='z') {
                char ch = Character.toUpperCase(i.charAt(0));
                System.out.println(ch);
            }
            else {
                System.out.println(i.charAt(0));
            }
            
        }
    }
    
}
