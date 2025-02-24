package LOOPS;

class probl5 {
    public static void main(String[] args) {
        int num = 122333,digit = 0,count=1;
        while(num!=0)  {
           digit = num%10;
           num/=10;
           count=1;
           int temp = num;
           while (temp!=0) {
            int digit2 = temp%10;
            if(digit==digit2) {
                count++;  
            }
            temp/=10;
           }
           
           System.out.println("Count value of digit "+digit+" is"+count);
            
        }
        
    }
    
}
