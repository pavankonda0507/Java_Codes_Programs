package PracticeQuestions;

class AgeProblem {
    public static void main(String[] args) {
        int age = 15;
        if (age>=18) {
            if (age>=60)
                System.out.println("Senior citizen");
            else 
                System.out.println("Major");
        }
        else {
            if (age<10)
                System.out.println("Kid");
            else 
                System.out.println("Minor");
        }


        System.out.println("_____________________________________________\n");
        if (age>=50)
            System.out.println("Senior citizen");
        else if(age<10)
            System.out.println("Kid");
        else if(age>=18)
            System.out.println("Major");
        else
            System.out.println("Minor");
    }
    
}
