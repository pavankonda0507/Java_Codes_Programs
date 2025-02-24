package LOOPS;

class fibonicci_for {
    public static void main(String[] args) {
        int a = 0, b= 1, c = 2,d, range = 10;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i = 1; i<=range-3;i++){
            d = a+b+c;
            a = b;
            b = c;
            c = d;
            System.out.print(d+" ");

        }
    }
    
}
