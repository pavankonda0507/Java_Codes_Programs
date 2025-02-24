package PracticeQuestions;
class grade {
    public static void main(String[] args) {
    int s1=16,s2=15,s3=14,s4=10,s5=8,s6=7;
    int sum = s1+s2+s3+s4+s5+s6;
    System.out.println("The sum of marks:"+sum);
    if (sum>80) {
        System.out.println("Your grade is: O");
    }
    else if (sum>60) {
        System.out.println("Your grade is: A");
    }
    else if (sum>40) {
        System.out.println("Your grade is: B");
    }
    else if (sum>30) {
        System.out.println("Your grade is: C");
    }
    else {
        System.out.println("Fail...");
    }

    }

}