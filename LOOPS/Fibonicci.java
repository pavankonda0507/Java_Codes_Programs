package LOOPS;

class Fibonicci {
    public static void main(String[] args) {
        int a = 0,b = 1, c, range = 10,i=1;
        System.out.println(a);
        System.out.println(b);
        while(i<=range-2) {
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
            i++;
        }

    }
}
