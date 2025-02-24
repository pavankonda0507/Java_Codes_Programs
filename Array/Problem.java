package Array;
public class Problem {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = new int[a.length];
        for(int i = 0;i<=a.length-1;i++) {
            if(i==0) {
                b[i] = a[i] + a[i+1];
            }
            else if(i==a.length-1) {
                b[i] = a[i] + a[i-1];
            }
            else {
                b[i] = a[i-1]+a[i+1];
            }
        }
        for(int i = 0;i<=a.length-1;i++) {
            System.out.println(a[i]);
        }
        System.out.println("_____________________");

        for(int i = 0;i<=b.length-1;i++) {
            System.out.println(b[i]);
        }

    }
}
