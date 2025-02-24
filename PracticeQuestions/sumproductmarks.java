package PracticeQuestions;
class sumproductmarks {
    public static void main(String[] args) {
        int s1=25,s2=28,s3=29,s4=20,s5=25,s6=24;
        int sum = s1+s2+s3+s4+s5+s6;
        int product = s1*s2*s3*s4*s5*s6;
        System.out.println("Sum of the marks:"+sum);
        System.out.println("Product of the marks:"+product);
        if(sum>product) {
            System.out.println("The sum of the marks are greater than the product of the marks");

        }
        else {
            System.out.println("The product of the marks are greater than the sum of the marks");
        }

    }   
}
