/* Print the first most repeated duplicate element in the array
    10 count: 2
    20 count: 3
    40 count: 3
    90 count: 2
    30 count: 2
    89 count: 2
    
    Output as : 20
 */
package Array;

public class Problem5 {
    public static void main(String[] args) {
        int a[] = {10,20,40,47,90,10,40,30,20,30,40,90,7,12,89,89,20};
        int b[] = new int[a.length];
        int max = 0,temp = 0;
        for(int i = 0;i<=a.length-1;i++) {
            int count = 1;
            if(b[i]==1) {
                continue;
            }
            for(int j = i+1;j<=a.length-1;j++) {
                if(a[i] == a[j]) {
                    count++;
                    b[j] = 1;
                }
            }
            if(count>1) {
                if(count>max) {
                    max = count;
                    temp = a[i];
                }
                System.out.println(a[i]+" count: "+count);
                 
            }   
        }
        System.out.println(temp);
    }
    
}
