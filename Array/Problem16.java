/* Print the first half of the array as ascending order and remaining same */
package Array;

class Problem16 {
    
    public static void main(String[] args) {
        int a[] = {65,38,84,7,82,1,4,94,53,62};
        int mid = a.length/2;
        for(int i = 0;i<mid-1;i++) {
            for(int j = i+1;j<mid;j++) {
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
