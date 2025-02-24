//without return and with parameter
package Methods;

class type2 {
    void add(int a,int b) {
        int c = a+b;
        System.out.println("Addition is: "+ c);
    }
    void sub(int a,int b) {
        int c = a-b;
        System.out.println("Subtraction is: "+c);
    }
    public static void main(String[] args) {
        type2 b = new type2();
        b.add(20,10);
        b.sub(20,10);
    }
    
    
}
