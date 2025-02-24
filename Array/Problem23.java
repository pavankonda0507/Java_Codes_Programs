/*    Print the missing elements in the array containing duplicate elements
i/p   a[] = {1,1,4,9,2,2,4,5,7,9,10}
o/p   3 6 8
 */
package Array;

import java.util.Arrays;

class Problem23 {
    public static void main(String[] args) {
        int a[] = {1,1,1,4,4,9,2,2,2,4,5,7,9,9},count = 0;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++) {
            if(a[i]!=a[i+1]) {
                count++;
            }
        }
        int b[] = new int[count+1];
        int x=0;
        for(int i=0;i<a.length-1;i++) {
            if(a[i]!=a[i+1]) {
                b[x] = a[i];
                x++;
            }
        }
        b[b.length-1] = a[a.length-1];
        int y=0;
        for(int i=b[0];i<=b[b.length-1];i++) {
            if(b[y]!=i) {
                System.out.println(i);
            }
            else {
                y++;
            }
        }

    }
    
}
