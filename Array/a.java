package Array;
import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        int firstarray[] = new int[5];
        firstarray[0] = 1;
        firstarray[1] = 2;
        firstarray[2] = 3;
        firstarray[3] = 4;
        firstarray[4] = 5;
        for(int i = 0;i<=firstarray.length-1;i++) {
            System.out.print(firstarray[i]+" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values: ");
        for(int i = 0;i<=firstarray.length-1;i++) {
            firstarray[i] = sc.nextInt();
        }
        for(int i = 0;i<=firstarray.length-1;i++) {
            System.out.print(firstarray[i]+" ");
        }

        


    }
    
}
