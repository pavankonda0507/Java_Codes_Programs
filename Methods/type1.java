// Without return and parameter
package Methods;

class type1 {
    void add() {
        int a = 10,b = 20;
        int c = a+b;
        System.out.println("Addition is: "+ c);
    }
    void sub() {
        int a = 10,b = 20;
        int c = a-b;
        System.out.println("Subtraction is: "+c);
    }
    public static void main(String[] args) {
        type1 b = new type1();
        b.add();
        b.sub();
    }
    
}
