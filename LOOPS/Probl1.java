/*
 * output as 1 2 3 4 5 6 7 8 9 10 20 19 18 17 16 15 14 13 12 11
 */
package LOOPS;

class Probl1 {
    public static void main(String[] args) {
        int num = 20;
        for(int i = 1;i<=20;i++) {
            if(i<=10) {
                System.out.print(i+" ");
            }
            else {
                if(i>10) {
                    System.out.print(num+" ");
                    num--;
                }
            }
        }
    }
    
}
