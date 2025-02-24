package TwoDArray;

import java.util.Scanner;

class Assigning {
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter elements: ");
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i[]:a) {
            for(int j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
