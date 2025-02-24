package Array;

class SortingDesc {
    public static void main(String[] args) {
        int a[] = {1,32,-3,4,-3,-45,92,389,37};
        for(int i = 0;i<=a.length-2;i++) {
            for(int j = i+1;j<=a.length-1;j++) {
                if(a[i]<a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] =  temp;
                }
            }
        }
        for(int i = 0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    
}