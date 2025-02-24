package BasicPrograms;

class Profit_Loss {
    public static void main(String[] args) {
        int cost_price = 50,selling_price = 80;
        int profit = selling_price-cost_price;
        int loss = cost_price-selling_price;
        if(profit>0){
            System.out.println("Profit is:"+profit);
        }
        else {
            System.out.println("Loss is:"+(-profit));
        }

    }
    
}
