/* this() keyword will execute the constructor of the same class where as super() execute the constructor of the base class */
package Constructor;

class A {
    public A() {
        //super();                                               // every constructor by default consist of super method 
        System.out.println("In A default constructor");
    }
    public A(int num) {
        System.out.println("In A parametarized constructor");

    }
}

class B extends A {
    public B() {
        System.out.println("In B default construcor");
    }
    public B(int num2) {   
        this();                                            
        System.out.println("In B parametarized constructor");
    }
}

class thisconstrucor {
    public static void main(String[] args) {
        B obj = new B(4);
        
    }
}

