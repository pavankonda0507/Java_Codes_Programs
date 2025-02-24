package PracticeQuestions;

class div_two_five {
    public static void main(String[] args) {
        int num = 5;
        if(num%2==0) {
            if (num%5==0) {
                System.out.println("It is perfect number");
            }
            else {
                System.out.println("Partially perfect");
            }
        }
        else {
            System.out.println("It is odd number");
        }
    }
}
