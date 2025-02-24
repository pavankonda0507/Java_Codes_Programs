class RuntimeArgs {
    public static void main(String[] args) {
        int b[] = new int[args.length];
        for(int i=0;i<args.length;i++) {
            b[i] = Integer.parseInt(args[i]);
        }
        for(int i:b) {
            int rev = 0,temp = i;
            while (i!=0) { 
                int dig = i%10;
                rev = rev*10+dig;
                i/=10;
            }
            if(rev==temp) {
                System.out.println("The number "+temp+" is Palindrome");
            }
        }
    }
    
}
