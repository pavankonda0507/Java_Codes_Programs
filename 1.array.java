class array {
    public static void main(String[] args) {
        int num[] = new int[4];     //here by default all the values are Zero
        num[0] = 3;       
        num[2] = 8;        
        System.out.println(num[0]);
        System.out.println("The length is:"+num.length);  //Length method

        int arr[] = {3,4,5,6};
        //System.out.println(arr[1]);
        for(int i=0;i<arr.length;i++) {
            System.out.println("All the elements of array:"+arr[i]);
        }

        //for-each loop for fetching the values in the array it only works with the arrays and collections
        for(int n:num) {
            System.out.println("The fetched value = "+n);
        }
        
    }

    
}
