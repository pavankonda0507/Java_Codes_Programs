/* 
Print the sum of the first repeating element and last repeating element in an array
a[] = {1,2,3,4,2,5,8,9,3,7,5}
f = 2
l = 5
sum = f+l = 7
 */
package Array;

class Problem27 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,2,5,8,9,3,7,5},f = 0,l = 0,sum = 0;
        for(int i=0;i<a.length-1;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i]==a[j]) {
                    f = a[i];
                    break;
                }
            }
            if(f!=0) {
                break;
            }
        }
        for(int i=a.length-1;i>0;i--) {
            for(int j=i-1;j>=0;j--) {
                if(a[i]==a[j]) {
                    l = a[i];
                    break;
                }
            }
            if(l!=0) {
                break;
            }
        }

        sum = f+l;
        System.out.println(f);
        System.out.println(l);
        System.out.println(sum);
    }
    
}