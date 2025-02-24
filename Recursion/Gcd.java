package Recursion;

class Gcd {
    void gcd(int num1, int num2, int num, int i,int max) {
        if(i<=num) {
            if(num1%i==0&&num2%i==0) {
                if(i>max) {
                    max = i;
                }

            } 
            gcd(num1, num2,num, i+1, max);
        }
        else {
            System.out.println(max);
        }
            
    }
    public static void main(String[] args) {
        int num1 = 8, num2 = 18;
        int num = num1>num2?num2:num1;
        Gcd g = new Gcd();
        g.gcd(num1,num2,num,1,0);
        
    }
    
}
