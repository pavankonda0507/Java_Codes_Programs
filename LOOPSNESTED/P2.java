/*Write a program to print the factors of a number from 1 to 10 */
package LOOPSNESTED;

class P2 {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++) {
            System.out.println("The factors of number "+i+" is: ");
            for(int j = 1;j<=i;j++) {
                if(i%j==0) {
                    System.out.println(j+" ");
                }

            }
        }
    }  
}
