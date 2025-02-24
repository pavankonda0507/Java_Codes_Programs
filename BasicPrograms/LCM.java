package BasicPrograms;

class LCM {
    public static void main(String[] args) {
        int a = 10, b = 12,gcd = 0,lcm = 0;
        int m = a>b?b:a;
        for(int i=m;i>=1;i--) {
            if(a%i==0 && b%i==0) {
                gcd = i;
                break;
            }

        }
        lcm = (a*b)/gcd;
        System.out.println(lcm);
        
    }
    
    
}
