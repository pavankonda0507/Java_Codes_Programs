package Recursion;

class Fibonicci {
    int a = 0, b = 1,c;
    int fibSeries(int i,int range) {
        if(i<=range)
        {
            c=a+b;
            a = b;
            b = c;
            System.out.println(c);
            fibSeries(i+1, range);
            
        }
        return 0;
        
    }
    public static void main(String[] args) {
        Fibonicci f = new Fibonicci();
        System.out.println(f.a);
        System.out.println(f.b);
        f.fibSeries(3, 10);
    }
}
