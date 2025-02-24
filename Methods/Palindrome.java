package Methods;

class Palindrome {
    String pal(int num,int rev) {
        int temp=num;
        while (num!=0) {
            int dig = num%10;
            rev = rev*10+dig;
            num/=10;
            
        }
        return temp==rev?"Palindrome":"Not Palindrome";
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.pal(111,0));

    }

    
}
