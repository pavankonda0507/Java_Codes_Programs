class search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int num = 6;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==num) {
                System.out.println("The given number "+num+" is present in the array..");
            }
            else {
                System.out.println("The given number "+num+" is not present in the array..");
                break;
            }
        }
    }
}