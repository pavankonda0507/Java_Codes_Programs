/* Left shift the array by d times a[] = {1,2,3,4,5,6,7,8,9}
   d = 4    a[] = {5,6,7,8,9,1,2,3,4}
   d = 1    a[] = {2,3,4,5,6,7,8,9,1}
   if no.of shifts is equal to length of array then no change in array again it comes to same place
   if d>length of the array use d = d%n(length)  
   d = 14  9+5 we have to shift five times d = 14%9==>5 shifts
   d = 20  9+9+2--->20%9 ==>2 shifts
 */
package Array;
class Problem6 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80,90};
        int d = 3,n = a.length;
        d = d%n;
        int temp[] = new int[d];
        for(int i = 0;i < d;i++) {
            temp[i] = a[i];
        }
        for(int i=d;i<n;i++) {
            a[i-d] = a[i];
        }
        for(int i = n-d;i<n;i++) {
            a[i] = temp[i-(n-d)];
        }  
        for(int i:a) {
            System.out.println(i);
        } 
    }
    
}
