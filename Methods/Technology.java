package Methods;

class Technology {
    void tech(int num) {
        int rem = num%100, que = num/100, sum = rem+que;
        int Pow = (int) Math.pow(sum, 2);
        if(num==Pow) 
            System.out.println("Technology number");
        else
            System.out.println("Not Technology number");

    }  
    public static void main(String[] args) {
        Technology t = new Technology();
        t.tech(2025);
    }
}
