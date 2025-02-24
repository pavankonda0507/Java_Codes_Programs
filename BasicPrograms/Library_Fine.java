package BasicPrograms;

class Library_Fine {
    public static void main(String[] args) {
        int late_days = 24;
        if(late_days<=5)
            System.out.println("Fine is 50 paise...");
        else if(late_days>=6 && late_days<=10)
            System.out.println("fine is 1 rupee...");
        else if(late_days>10 && late_days<=30)
            System.out.println("Fine is 5 rupees...");
        else if(late_days>30)
            System.out.println("Your membership is cancelled !");
        
    }
}
