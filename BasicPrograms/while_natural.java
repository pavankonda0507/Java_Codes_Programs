package BasicPrograms;

class while_natural {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
      
        while(num<=10) {
            sum = sum+num;
            num++;
        }
        System.out.println("Sum of first 10 numbers: " +sum);
        int num2 = 1;
        int prod = 1;
       
        while(num2<=5) {
            prod = prod*num2;
            num2++;
        }
        System.out.println("Product of first 5 numbers is or factorial of 5 is: "+prod);

    }
    
}
