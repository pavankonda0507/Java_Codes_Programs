/*
 * Print the duplicate elements of each word in string
 input  : s = "Helloo all good morning everyoney"
 output : Helloo lo
          all l
          good o
          morning n
          everyoney ey
 */
package Strings;

class Problem26 {
    public static void main(String[] args) {
        String s = "Helloo all good morning everyoney";
        String str[] = s.split(" ");
        for(String i:str) {
            String s2 = "";
            for(int j=0;j<i.length();j++) {
                char k = i.charAt(j);
                if(i.indexOf(k)!=i.lastIndexOf(k)) {
                    if(s2.indexOf(k)==-1) {
                        s2 = s2+k;
                    }
                }
            }
            System.out.println(i+" "+s2);
        }

    }
    
}
