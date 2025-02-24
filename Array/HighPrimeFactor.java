package Array;

class HighPrimeFactor {
    public static void main(String[] args) {
        int a[] = {1,2,48,93,67,28};
        int max = 0;
        for(int i:a) {
            int count = 0;
            for(int j = 2;j<=i/2;j++) {
                if(i%j==0) {
                    count++;
                    break;
                }
            }
            if(count==0&&i>1) {
                if(i>max) {
                    max = i;
                }
            }   
        }
        System.out.println(max);
    }
    
}