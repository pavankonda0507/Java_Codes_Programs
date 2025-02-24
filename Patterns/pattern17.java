/*
a b c d e 
b c d e f 
c d e f g 
d e f g h 
e f g h i 
 */
package Patterns;

class pattern17 {
    public static void main(String[] args) {
        char ch = 'a';
        for(int i=1;i<=5;i++) {
            char temp = ch;
            for(int j=1;j<=5;j++) {
                System.out.print(temp++ +" ");
            }
            ch++;
            System.out.println();
        }
    }
    
}
