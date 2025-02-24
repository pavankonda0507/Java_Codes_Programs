package LOOPSNESTED;

public class P11 {
    public static void main(String[] args) {
        int num = 12,high_prime=0;
        for(int i = 1;i<=num;i++) {
            if(num%i==0) {
                System.out.println(i);
                int count=0,dig = 0;
                for(int j=2;j<=i/2;j++) {
                    if(i%j==0){
                        count++;
                        break;
                    }
                    if(count==0 && i>1) {
                        high_prime=j;
                    }
                }
            }
        }
        System.out.println(high_prime);
        
    }
    
}
