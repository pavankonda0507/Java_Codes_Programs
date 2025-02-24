class Sec_min { 
    public static void main(String[] args) {
        int num  = 36746372, smax = 0,count = 0;
        while(num!=0) {
            int dig = num%10;
            if(dig>smax) {
                smax = dig;
                count++;
                if(count==2) {
                    break;
                }
                
            }
            num/=10;

        }
        System.out.println("Second Max:"+smax);
        
    }
    
}
