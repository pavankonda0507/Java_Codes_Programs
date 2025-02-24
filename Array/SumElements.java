package Array;
import java.util.Scanner;
class SumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter elements in array...");
        for(int i = 0;i<=arr.length-1;i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<=arr.length-1;i++) {
            sum = sum+arr[i];

        }
        System.out.println("Sum of array elements: "+sum);

    }
    
}
