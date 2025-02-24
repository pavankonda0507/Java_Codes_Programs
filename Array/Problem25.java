/* Most consecutive number of 1's in array
    input :  a[] = {1,0,1,1,1,1,0,0,0,1,0,1}
                      1 2 3 4
    output:  4     

 */
package Array;

class Problem25 {
    public static void main(String[] args) {
        int a[] = {0,1,0,1,1,1,0,0,1,1,1,1,0,1},max = 0;
        for(int i=0;i<a.length-1;i++) {
            int count = 0;
            for(int j=i+1;j<a.length;j++) {
                if(a[i]==1) {
                    if(a[j]==1) {
                        count++;
                        if(count>max) {
                            max = count;
                        }
                    }
                    else {
                        count=0;

                    }
                }
            }
        }
        System.out.println(max);
    } 
    
}
