package Array;

import java.util.Arrays;

class EqualArray {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {1,2,4};
        boolean res = Arrays.equals(a,b);
        System.out.println(res);
        boolean res2 = true;
        if(a.length==b.length) {
            for(int i = 0;i<a.length;i++) {
                if(a[i]!=b[i]) {
                    res2 = false;
                    break;

                }
            }
        }
        else {
            res2 = false;
        }
        if(res2) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
        
    }
    
    
}
