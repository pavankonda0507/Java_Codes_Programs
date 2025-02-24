package Array;

public class UniqueElements {
    public static void main(String[] args) {
        int a[] = {10,20,40,47,90,10,40,30,20,30,40,90,7,12,89,89};
        int b[] = new int[a.length];
        for(int i = 0;i<=a.length-1;i++) {
            int count = 1;
            if(b[i]==1) {
                continue;
            }
            for(int j = i+1;j<=a.length-1;j++) {
                if(a[i] == a[j]) {
                    count++;
                    b[j] = 1;
                }
            }
            if(count==1) {
                System.out.println(a[i]+" "+count);
            }
        }
    }
    
}
