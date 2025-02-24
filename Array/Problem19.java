/* Sort only even index values */
package Array;

class Problem19 {
    public static void main(String[] args) {
        int a[] = {28,29,14,4,74,6,4,8};
        for(int i=0;i<a.length-1;i+=2) {
            for(int j=i+2;j<a.length;j+=2) {
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
                
            } 
        }
        for(int i:a) {
            System.out.println(i);
        }
    }
}
