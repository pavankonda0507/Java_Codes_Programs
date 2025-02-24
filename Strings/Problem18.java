/*
Print the palindrome word in the string
input   : s = "Madam arora teaches Malayalam and civic skills"
output  : Madam
          arora
          Malayalam
          civic
 */
package Strings;

class Problem18 {
    public static void main(String[] args) {
        String s = "Madam arora teaches Malayalam and civic skills",s2 = "";
        String str[] = s.split(" ");
        for(String i:str) {
            StringBuffer sb = new StringBuffer(i);
            sb.reverse();
            s2 = sb.toString();
            if(i.equalsIgnoreCase(s2)) {
                System.out.println(i);
            }
        }
    }
    
}
