package PracticeQuestions;

class smallestnumber {
    public static void main(String[] args) {
        int num1 = -5, num2 = -4, num3 = 0;
        if(num1==num2 && num2==num3 && num3==num1) {
            System.out.println("Three numbers are equal");
        }
        else {
            if(num1<=num2 && num1<=num3) {
                System.out.println("a is smaller");
            }
            else if (num2<=num1 && num2<=num3) {
                System.out.println("b is smaller");
            }
            else {
                System.out.println("c is smaller");
            }
            
        }
    }
    
}
