/*
1 2 3 4 
A B C D 
5 6 7 8 
E F G H 
 */
package Patterns;

class pattern16 {
    public static void main(String[] args) {
        char ch = 'A';
        int temp = 1,row = 4,col=4;
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=col;j++) {
                if(i%2==1) {
                    System.out.print(temp++ +" ");
                }
                else
                    System.out.print(ch+++" ");
            }
            System.out.println();
        }
    }
    
}
