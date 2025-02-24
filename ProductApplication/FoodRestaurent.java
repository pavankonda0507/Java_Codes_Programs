package ProductApplication;
import java.util.Scanner;
class Restaurent {
    public static void main(String[] args) {
        System.out.println("Welcome to the Baahubali Restaurent...");
        System.out.println("Here is your menu sir/madam");
        Scanner sc = new Scanner(System.in);
        int select_dish ,starters_price = 200, maincouse_price = 500, desert_price = 150, Quantity = 0, Total_Bill=0;
        double Final_bill = 0;
        String decision;
        while(true) {
            System.out.println("1. Starters\n2. Main course\n3. Deserts");
            System.out.print("Select the dish : ");
            select_dish = sc.nextInt();
            switch (select_dish) {
                case 1:
                {
                    System.out.println("You are selected starters and we have different startes...");
                    System.out.println("1. Veg Spring Rolls\n2. Chicken Thandoori\n3. Chicken Wings\n4. Garlic Bread");
                    System.out.print("Enter dish number: ");
                    int select_sarters = sc.nextInt();
                    if(select_sarters==1) {
                        System.out.println("You selected Veg Spring Rolls, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int vs_bill = Quantity*starters_price;
                        System.out.println("Veg Spring Rolls bill: "+vs_bill);
                        Total_Bill = Total_Bill+vs_bill;
                    }
                    else if(select_sarters==2) {
                        System.out.println("You selected Chicken Thandoori, Enjoy your food..");
                        System.out.print("Enter quantity ");
                        Quantity = sc.nextInt();
                        int ct_bill = starters_price*Quantity;
                        System.out.println("Chicken Thandoori bill: "+ct_bill);
                        Total_Bill = Total_Bill+ct_bill;
                    }
                    else if(select_sarters==3) {
                        System.out.println("You selected Veg Chicken Wings, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int vc_bill = starters_price*Quantity;
                        System.out.println("Veg chicken bill: "+vc_bill);
                        Total_Bill = Total_Bill+vc_bill;
                    }
                    else if(select_sarters==4) {
                        System.out.println("You selected Garlic Bread, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int gb_bill = starters_price*Quantity;
                        System.out.println("Garlic bread bill: "+gb_bill);
                        Total_Bill = Total_Bill+gb_bill;
                    }
                    else {
                    System.out.println("Select available starters...!");
                    }
                break;
                }
                case 2:
                {
                    System.out.println("You are selected Main course and we have different startes...");
                    System.out.println("1. Chicken Biryani\n2. Veg pulav\n3. Butter Chicken\n4. Fish ");
                    System.out.print("Enter dish number: ");
                    int select_Maincourse = sc.nextInt();
                    if(select_Maincourse==1) {
                        System.out.println("You selected Chicken Biryani, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int cb_bill = maincouse_price*Quantity;
                        System.out.println("Chicken Biryani bill: "+cb_bill);
                        Total_Bill = Total_Bill+cb_bill;
                    }
                    else if(select_Maincourse==2) {
                        System.out.println("You selected Veg pulav, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int vp_bil = maincouse_price*Quantity;
                        System.out.println("Veg Pulav bill: "+vp_bil);
                        Total_Bill = Total_Bill+vp_bil;
                    }
                    else if(select_Maincourse==3) {
                        System.out.println("You selected Butter Chicken, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int bc_bill = maincouse_price*Quantity;
                        System.out.println("Butter chicken bill: "+bc_bill);
                        Total_Bill = Total_Bill+bc_bill;
                    }
                    else if(select_Maincourse==4) {
                        System.out.println("You selected Fish, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int f_bill = maincouse_price*Quantity;
                        System.out.println("Fish bill: "+f_bill);
                        Total_Bill = Total_Bill+f_bill;
                    }
                    else {
                    System.out.println("Select available Main Course...!");
                    }
                break;
                }
                case 3:
                {
                    System.out.println("You are selected Deserts and we have different startes...");
                    System.out.println("1. Gulab Jamun\n2. Strawberry Cake\n3. Venilla icecream");
                    System.out.print("Enter the dish number: ");
                    int select_deserts = sc.nextInt();
                    if(select_deserts==1) {
                        System.out.println("You selected Gulab Jamun, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int gj_bill = desert_price*Quantity;
                        System.out.println("Gulab jamun bill: "+gj_bill);
                        Total_Bill = Total_Bill+gj_bill;
                    }
                    else if(select_deserts==2) {
                        System.out.println("You selected Strawberry Cake, Enjoy your food..");
                        System.out.print("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int sc_bill = desert_price*Quantity;
                        System.out.println("Strawberry Cake bill: "+sc_bill);
                        Total_Bill = Total_Bill+sc_bill;
                    }
                    else if(select_deserts==3) {
                        System.out.println("You selected Venilla icecream, Enjoy your food..");
                        System.out.println("Enter quantity: ");
                        Quantity = sc.nextInt();
                        int vice_bill = desert_price*Quantity;
                        System.out.println("Venilla icecream: "+vice_bill);
                        Total_Bill = Total_Bill+vice_bill;
                    }
                    else {
                    System.out.println("Select available Deserts...!");
                    }
                break;
                }
                default :
                    System.out.println("Enter correct dish number..!");

                
            }
            System.out.println("Still you want to order food...");
            decision = sc.next();
            if(decision.equals("no")) {
                System.out.println("Your total bill is: "+Total_Bill);
                if(Total_Bill>=5000) {
                    System.out.println("You are eligible for discount of 20%.");
                    double discount = (20/100.0)*Total_Bill;
                    Final_bill = Total_Bill-discount;
                    System.out.println("Final bill after discount is: "+Final_bill);   
                }
                else if(Total_Bill>=3000 && Total_Bill<5000) {
                    System.out.println("You are eligible for discount of 10%.");
                    double discount = (10/100.0)*Total_Bill;
                    Final_bill = Total_Bill-discount;
                    System.out.println("Final bill after discount is: "+Final_bill);
                }
                break;

            }
            else {
                System.out.println("Enjoy your meal again...");
            }    
        }
        System.out.println("************THANKYOU HAVE A NICE DAY***************");
    }
}