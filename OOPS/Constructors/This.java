package OOPS.Constructors;

class This {
    int x = 30;
    This() {
        this(10);
        System.out.println("Default constructor");

    }
    
    This(int x) {
        this.x=x;
       
        /*
        By using this() it will call the default constructor with in the same class
         */
        System.out.println("Parameterized constructor");

    }
}
class out {
    public static void main(String[] args) {
        This obj = new This();
        System.out.println(obj.x);
        
    }
}
