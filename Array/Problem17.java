/* Print the first half of the array as descending order and remaining same */
package Array;

class Problem17 {
    public static void main(String[] args) {
        int a[] = {38,36,27,109,42,67,2,71,91,81},mid = a.length/2;
        for(int i = 0;i<mid-1;i++) {
            for(int j=i+1;j<mid;j++) {
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
