package ProductApplication;
import java.util.Scanner;
class Restaurent123
{
  public static void main(String []args)
  {
    System.out.println("welcome to Mini Swiggy");
    int brny=190,fambrny=500,cdrnk=50,kbbs=120,frdchkn=230;
    int total=0,qty=0;
    String name;
       Scanner sc=new Scanner(System.in);
    System.out.println("enter your name ");
    name=sc.nextLine();
    System.out.println("enter mobile number");
    long mob=sc.nextLong();
    System.out.println("enter password");
    int pwd=sc.nextInt();
   if(mob==12345l&&pwd==1234)
  {
   do
   {
    System.out.println("1.brny\n2.fambrny\n3.cdrnk\n4.kbbs\n5.frdchkn");
    System.out.println("Enter num from 1 to 5");
    int choice=sc.nextInt();
    switch(choice)
    {
      case 1:
      System.out.println("you've selected brny");
      System.out.println("enter quantity");
      qty=sc.nextInt();
      int b_price = brny*qty;
      total=total+brny*qty;
      System.out.println("Bill for biryani: "+b_price);
      break;
      case 2:
      System.out.println("you've selected fambrny");
      System.out.println("enter quantity");
      qty=sc.nextInt();
      int f_price = fambrny*qty;
      total=total+fambrny*qty;
      System.out.println("Bill for Family biryani: "+f_price);
      break;
      case 3:
      System.out.println("you've selected cdrnk");
      System.out.println("enter quantity");
      qty=sc.nextInt();
      int c_price = cdrnk*qty;
      total=total+cdrnk*qty;
      System.out.println("Bill for cool drinks: "+c_price);
      break;
      case 4:
      System.out.println("you've selected kbbs");
      System.out.println("enter quantity");
      qty=sc.nextInt();
      int k_price = kbbs*qty;
      total=total+kbbs*qty;
      System.out.println("Bill for Kababs: "+k_price);
      break;
      case 5:
      System.out.println("you've selected frdchkn");
      System.out.println("enter quantity");
      qty=sc.nextInt();
      int fc_price = frdchkn*qty;
      total=total+frdchkn*qty;
      System.out.println("Bill for fried chicken: "+fc_price);
      break;
   default:
      System.out.println("we have only choice of 1 to 5.so select from them!!"+choice);
      }
       System.out.println("do you want something else? if yes click any button.if no click n ");
       char desc=sc.next().charAt(0);
       if(desc=='n')
       {
       System.out.println("your total bill is: "+total);
       System.out.println("Thank you\nyour order will be delivered soon\nHave a good meal");
       break;
      }
     }
 
      while(true);
  
     }
  else
     System.out.println("enter mobile number or password is wrong!! Try again");
  }
}
