package Array;

class Problem12 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8},n = a.length;
        int temp = a[n-1];
        for(int i = n-1;i>0;i--) {
            a[i] = a[i-1] ;
        }
        a[0] = temp;
        for(int i:a)
        {
            System.out.println(i);
        }        
    }
    
}
