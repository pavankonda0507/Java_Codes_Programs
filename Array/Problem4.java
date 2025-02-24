/*
Take an array as input and if the array contains the duplicate values then print the sum of the
duplicate elements, if there are no duplicate elements print "No duplicate elements"
 */
package Array;

class Problem4 {
    public static void main(String[] args) {
        int a[] = {10,20,40,50,10,40,90,70,39,82};
        int b[] = new int[a.length];
        int sum = 0,temp = 0;
        for(int i  = 0;i<=a.length-1;i++) {
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
                sum = sum+a[i];
            }
        }
        if(sum!=0) {
            System.out.println(sum);
        }
        else {
            System.out.println("No duplicate");
        }
    }
    
}
