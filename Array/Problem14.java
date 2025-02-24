package Array;

class Problem14 {
    public static void main(String[] args) {
        int a[] = {1,2,0,4,0,2,4,0,4,7,0,0};
        /*int tempsize=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==0) {
                tempsize++;
            }
        }
        int x = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i]!=0) {
                a[x] = a[i];
                x++;
            }
        }
        for(int i = a.length-tempsize;i<a.length;i++) {
            a[i] = 0;

        }
        for(int i:a) {
            System.out.println(i);
        }*/
        int j = -1;
        for(int i=0;i<a.length;i++) {
            if(a[i]==0) {
                j=i;
                break;
            }
        }
        for(int i = j+1;i<a.length;i++) {
            if(a[i]!=0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        for(int i:a) {
            System.out.println(i);
        }
    }
    
}
