package Array;

class SortingAsc {
    public static void main(String[] args) {
        int a[] = {2,3,1,5,73,5,46,78};
        for(int i = 0;i<=a.length-2;i++) {
            for(int j = i+1;j<=a.length-1;j++) {
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0;i<=a.length-1;i++) {
            System.out.println(a[i]);
        }
    }
    
}
