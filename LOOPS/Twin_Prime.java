package LOOPS;
class Twin_Prime {
    public static void main(String[] args) {
        int a = 10,b = 7, i = 1, j = 1, count1 = 0, count2 = 0;
        while(i<=a) {
            if(a%i==0) {
                count1+=1;
            }  
            i++;
        }
        if(count1==2) {
            System.out.println(a+":Prime");
        }
        else {
            System.out.println(a+":Not a prime");  
        }
        while(j<=b) {
            if(b%j==0) {
                count2+=1;
            }  
            j++;
        }
        if(count2==2) {
            System.out.println(b+":Prime");
        }
        else {
            System.out.println(b+"Not a prime");  
        }
        if(count1==2 && count2==2) {
            if(a-b==2 || a-b==-2) {
                System.out.println("Twin Primes");
            }
            else {
                System.out.println("Not twin primes");
            }

        }
        else {
            System.out.println("Not twin Primes");
        }

    }  
}
