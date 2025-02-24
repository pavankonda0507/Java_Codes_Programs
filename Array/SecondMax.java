package Array;

class SecondMax {
    public static void main(String[] args) {
        int a[] = {243,1,4,3,95,464,73,38,28};
        int max = a[0],secMax = a[0];
        for(int i=1;i<=a.length-1;i++) {
            if(a[i]>max) {
                max = a[i];
            }
        }
        for(int i=1;i<=a.length-1;i++) {
            if(a[i]>=secMax&&a[i]<max) {
                secMax = a[i];
            }
        }
        System.out.println(secMax);
        
    } 
}
