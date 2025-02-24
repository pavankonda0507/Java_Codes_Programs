/* Right shift the array by d times a[] = {1,2,3,4,5,6,7,8,9}
   d = 4    a[] = {6,7,8,9,1,2,3,4}
   d = 1    a[] = {9,1,2,3,4,5,6,7,8}
   if no.of shifts is equal to length of array then no change in array again it comes to same place
   if d>length of the array use d = d%n(length)  
   d = 14  9+5 we have to shift five times d = 14%9==>5 shifts
   d = 20  9+9+2--->20%9 ==>2 shifts
*/
package Array;

class Problem10 {
    public static void main(String[] args) {
        int a[] = {10,29,29,38,82,28,29,28};
        int d = 13,n = a.length;
        d = d%n;
        int temp[]  = new int [d];
        for(int i = n-d;i<n;i++) {
            temp[i-(n-d)] = a[i];
        }
        for(int i = d;i<n;i++) {
            a[i] = a[i-d];
        }
        for(int i = 0;i<d;i++) {
            a[i] = temp[i];
        }
        for(int i:a) {
            System.out.println(i);
        }
    }   
}
