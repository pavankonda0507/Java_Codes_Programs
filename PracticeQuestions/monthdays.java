package PracticeQuestions;

class monthdays {
    public static void main(String[] args) {
        int Month_Num = 27;
        if (Month_Num>0&&Month_Num<13) {
            if(Month_Num==2) {
                System.out.println("No.of days:"+28);
            }
            else if(Month_Num==4||Month_Num==6||Month_Num==9||Month_Num==11)
            {
                System.out.println("No.of days:"+30);
            }
            else
            {
                System.out.println("No.of days:"+31);
            }
        }
        else {
            System.out.println("Invalid month number...");
        }



        System.out.println("________________________________________\n");


        if(Month_Num==2) {
            System.out.println("No.of days:"+28);
        }
        else if(Month_Num==4||Month_Num==6||Month_Num==9||Month_Num==11)
        {
            System.out.println("No.of days:"+30);
        }
        else if(Month_Num==1||Month_Num==3||Month_Num==5||Month_Num==7||Month_Num==8||Month_Num==10||Month_Num==12)
        {
            System.out.println("No.of days:"+31);
        }
        else
        {
            System.out.println("Not valid month number.....");
        }
    }

    
}
