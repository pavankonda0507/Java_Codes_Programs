/*
input :a[] = {10,20,30,40,50,60,70,80}
       index = 5;
output:a[] = {10,20,30,40,50,0,70,80}
       a[] = {10,20,30,40,50,70,80,0}
 */
package Array;

class Problem11 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80};
        int index = 7,n = a.length;
        for(int i=0;i<n;i++) {
            if(i==index) {
                a[i] = 0;
            }
        }
        int temp = a[index];
        for(int i=index;i<n-1;i++) {
            a[i] = a[i+1];
        }
        a[n-1] = temp;
        for(int i : a) {
            System.out.println(i);
        }

    }
}
