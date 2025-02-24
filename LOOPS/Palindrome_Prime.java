package LOOPS;

class Palindrome_Prime {
    public static void main(String[] args) {
        int num = 373,rev = 0, digit = 0,temp = num,count = 0;
        for(;num!=0;) {
            digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        System.out.println(rev);
        num = temp;
        String res = rev==temp?"Palindrome":"Not Palindrome";
        System.out.print(res+" ");
        if(res=="Palindrome") {
            for(int i=1;i<=temp/2;i++) {
                if(temp%i==0)
                    count++;
            }
            if(count==1)
                System.out.println("Prime");
            else    
                System.out.println("Not a Prime");
            
        }
    }
    
}
