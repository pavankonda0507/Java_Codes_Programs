package Array;

class Problem24 {
    public static void main(String[] args) {
        int a[] = {1,1,1,2,2,3,3,4,5,6,6,7,8,8};
        for(int i=0;i<a.length-1;i++) {
            if(a[i]==a[i+1]) {
                System.out.println(a[i]);
            }
        }
    }
    
}
