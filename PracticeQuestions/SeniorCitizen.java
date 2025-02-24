package PracticeQuestions;

class SeniorCitizen {
    public static void main(String[] args) {
        int age = 64;
        if (age<18) {
            System.out.println("Your Minor...");
        }
        else if (age>=18&&age<60) {
            System.out.println("Your Major...");
        }
        else if(age>=60) {
            System.out.println("Your senior citizen...");
        }
        else {
            System.out.println("Enter the correct age !");
        }
    }
    
}
