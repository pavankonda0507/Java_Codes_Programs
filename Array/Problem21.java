/* Finding missing elements in array */
package Array;

class Problem21 {
    public static void main(String[] args) {
        int a[] = {0,1,2,5,6,9};

        int x=0;
        for(int i=a[0];i<=a[a.length-1];i++) {
            if(a[x]!=i)//
            {
                System.out.println(i);
            } 
            else {                                      
                x++;
            }

        }

    }
    
}
