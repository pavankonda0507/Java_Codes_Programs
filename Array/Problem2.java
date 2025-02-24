/*
input: a[] = {1,2,4,53,6,84,92}
k = 1   find the first largest element(92) 
k = 4   find the fourth largest element(6)
*/
package Array;
import java.util.Arrays;;
class Problem2 {
    public static void main(String[] args) {
        int a[] = {1,2,4,53,6,84,92};
        int k= 4;
        int large = 0;
        Arrays.sort(a);
        for(int i = 0;i<=a.length-1;i++) {
            System.out.println(a[i]);
        }
        for(int i = 0;i<=a.length-1;i++) {
                large = a[a.length-k];
        }
        System.out.println("Kth large value: " +large);
        int l = a[a.length-k];
        System.out.println(l);
    }    
}
