package Array;

class Problem8 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,2,3,4};
        int b[] = new int[a.length];
        
        for(int i=0;i<=a.length-1;i++) {
            int count = 0;
            if(b[i]==1) {
                continue;
            }
            for(int j= i+1;j<a.length;j++) {
                if(a[i]==a[j]) {
                    count++;
                    b[j]=1;
                }
            }
            if(count==0) {
                System.out.println(a[i]);
            }
        }
    }
    
}
