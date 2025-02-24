package Methods;

class Armstrong {
    int num = 153,temp = num,sum = 0;
    String arm(int count) {
        while(num!=0) {
            count++;
            num/=10;
        }
        num = temp;
        while (temp!=0) {
            int dig = temp%10;
            int pow = (int) Math.pow(dig, count);
            sum += pow;
            temp/=10;  
        }
        return sum==num?"Armstrong":"Not Armstrong";

    }
    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        String res = a.arm(0);
        System.out.println(res);
    }
    
}
