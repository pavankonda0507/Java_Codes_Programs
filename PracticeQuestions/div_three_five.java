package PracticeQuestions;

class div_three_five {
    public static void main(String[] args) {
        int num = 7;
        if(num%3==0 && num%5==0)
            System.out.println("FizzBuzz");
        else if(num%3==0)
            System.out.println("Fizz");
        else if(num%5==0)
            System.out.println("Buzz");
        else 
            System.out.println(num);
    }
    
}
