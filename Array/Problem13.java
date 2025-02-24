/* 
Multiple rotation of an array left shift
 */
package Array;

class Problem13 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8},d = 3;
        int n = a.length;
        for(int i = 1;i<=d;i++) {
            int temp = a[0];
            for(int j = 0;j<n-1;j++) {
                a[j] = a[j+1];
            }
            a[n-1] = temp;
        }
        for(int i:a) {
            System.out.println(i);
        }
    }
    
}
