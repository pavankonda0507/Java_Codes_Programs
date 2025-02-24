/* remove the particular element in the array */
package Array;

class Problem15 {
    public static void main(String[] args) {
        int a[] = {1,53,3,93,56,766,31};
        int temp[] = new int[a.length-1],num = 766,x = 0;
        for(int i = 0;i<a.length;i++) {
            if(a[i] == num) {
                continue;
            }
            else {
                temp[x] = a[i];
                x++;
            }

        }
        for(int i:temp) {
            System.out.println(i);
        }
    }
    
}
