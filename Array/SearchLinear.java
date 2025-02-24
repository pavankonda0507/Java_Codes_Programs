package Array;

class SearchLinear {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,1,4,7,3,2};
        int search = 1,temp = 0;
        for(int i = 0;i<=a.length-1;i++) {
            if(a[i] == search) {
                temp = search;
                break;
            }   
        }
        if(temp==search) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }  
}
