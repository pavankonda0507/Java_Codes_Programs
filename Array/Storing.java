package Array;
class Storing {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[arr.length]; 
        /*for(int i = 0;i<=arr.length-1;i++) {
            for(int j = 0;j<=arr2.length-1;j++) {
                if(i==j) {
                    arr2[j] = arr[i];
                }
            }

        }
            */
        for(int i = 0;i<arr.length;i++) {
            arr2[i] = arr[i];
        }
        
        for(int i = 0;i<=arr2.length-1;i++) {
            System.out.println(arr2[i]);
        }
        
    }
}