package Array;

class OddEven {
    public static void main(String[] args) {
        int a[] = {-1,3,5,-5,-37,84,894,-27,47,-25};
        int b[] = new int[a.length];
        int j = 0;
        for(int i = 0;i<=a.length-1;i++) {
            if(a[i]<0) {
                b[j] = a[i];
                j++;
            }       
        }
        for(int i = 0;i<=a.length-1;i++) {
            if(a[i]>=0) {
                b[j] = a[i];
                j++;
            }
            
        }
        for(int i = 0;i<=b.length-1;i++) {
            System.out.println(b[i]);
        }
        
    }
    
}
