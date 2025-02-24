package Array;

class Problem3 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80};
        int b[] = new int[a.length/2];
        int c[] = new int[a.length/2];
        int d[] = new int[a.length];
        int x = 0,y = 0;
        for(int i = 0;i <= a.length-1;i = i+2) {
            b[x] = a[i];
            x++;
        }
        for(int i = 1;i <= a.length-1;i = i+2) {
            c[y] = a[i];
            y++;
        }
        /*
        for(int i = 0;i<=a.legth-1;i++) {
            if(i%2==1) {
                b[x] = a[i];
                x++;
                
            }
            else {
                b[y] = a[i];
                y++;
            }
        }
         */
        int l = 0,m = 1;
        for(int i = b.length-1;i>=0;i--) {
            d[l] = b[i];
            l = l+2;
        }
        for(int j = c.length-1;j>=0;j--) {
            d[m] = c[j];
            m = m+2;

        }
        

        for(int i = 0;i<=d.length-1;i++) {
            System.out.println(d[i]);
        }

    }
}
