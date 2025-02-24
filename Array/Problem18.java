/*Print first half of the array in ascending and remaining array as descending order */
package Array;

class Problem18 {
    public static void main(String[] args) {
        int a[] = {54,82,25,19,53,92,104,53,64,72},mid = a.length/2;
        for(int i=0;i<mid-1;i++) {
            for(int j=i+1;j<mid;j++) {
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=mid;i<a.length-1;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i]<a[j]) {
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
