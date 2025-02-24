class Discount {
    public static void main(String[] args) {
        String name = "Laptop",Payment = "Phonepay", Copupon_Code = "PVN100";
        int quantity = 1, Price = 50000, Tot_price = Price*quantity;
        double disc_ten = (10/100.0)*Tot_price;
        System.out.println("The 10% discount is: "+disc_ten);
        double cgst = (9/100.0)*Tot_price;
        double sgst = (9/100.0)*Tot_price;
        if (Payment=="Phonepay") {
            System.out.println("Your payment mode is phonepay");
            double final_price = Tot_price-disc_ten;
            System.out.println("Final price pf the product:"+final_price);
        }
        else {
            System.out.println("Your payment mode is not Phonepay");
        }
        if (Copupon_Code=="PVN100") {
            System.out.println("Your coupon is eligible");
            double grand_total = Tot_price-(cgst+sgst);
            System.out.println("Grand total price:"+grand_total);
        }
        else {
            System.out.println("You have no offers");
        }
    }
}