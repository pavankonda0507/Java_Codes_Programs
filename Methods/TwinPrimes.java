package Methods;

class TwinPrimes {
    int twinPrime(int num) {
        int count = 0;
        for(int i=2;i<=num/2;i++) {
            if(num%i==0) {
                count++;
                break;
            }
        }
        if(count==0&&num>1)
            return num;
        else 
            return 0;
    }
    public static void main(String[] args) {
        TwinPrimes t = new TwinPrimes();
        int num1 = 5,num2 = 7;
        int res1 = t.twinPrime(num1);
        int res2 = t.twinPrime(num2);
        if(res1!=0&&res2!=0) {
            System.out.println("Both numbers are prime");
            if(res1-res2==2||res1-res2==-2) {
                System.out.println(num1+ " and "+num2+ " are twin primes");
            }
        }
    }
}
