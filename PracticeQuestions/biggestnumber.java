package PracticeQuestions;

class biggestnumber {
    public static void main(String[] args) {
        int a = 8000,b = 5000,c = 7000;
        /*if (a>b&&a>c) 
            System.out.println("a is bigger number");
        else if (b>a&&b>c)
            System.out.println("b is bigger number");
        else
            System.out.println("c is bigger number");


        System.out.println("___________________________");*/
        if(a>b){
            if(a>c){
                System.out.println("a is bigger number");
            }
            else{
                System.out.println("c is bigger number");
            }
        }
        else {
            if(b>c)
                System.out.println("b is bigger number");
            else    
                System.out.println("c is bigger number");
        }

    }
}


    
