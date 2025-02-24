class Hello {
    public static void main(String[] args) {
        int num = 3793493,max = 0, smax = 0;
        while(num!=0) {
            int digit = num%10;
            if(digit>max) {
                smax = max;
                max = digit;

            }
        }
        System.out.println(smax);
    }
}
