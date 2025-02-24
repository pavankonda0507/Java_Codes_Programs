package Array;

public class ReverseStoring {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            arr2[i] = arr[i];

        }
    }
    
}
