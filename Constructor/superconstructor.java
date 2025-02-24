package Constructor;

class A {
    public A() {
        //super();                                               // every constructor by default consist of super method 
        System.out.println("In A default constructor");
    }
    public A(int num) {
        //super();
        System.out.println("In A parametarized constructor");

    }
}

class B extends A {
    public B() {
        //super();  or super(3);              Here also we can call the parametarized constructor in the parent class 
        System.out.println("In B default construcor");
    }
    public B(int num2) {
        super(2);
        System.out.println("In B parametarized constructor");
    }
}

class c {
    public static void main(String[] args) {
        B obj = new B(3);
        //B obj = new B();
    }
}
