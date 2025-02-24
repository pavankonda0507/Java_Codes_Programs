package FinlaAndStatic;

// class Demo {
//     int x = 10;
//     int  i = 1;
    
//     static void add(int a, int b) {
//         System.out.println(a+b);
//     }
//     static void add() {
//         System.out.println("hello");
//     }
//     public static void main(String[] args) {
//         System.out.println("In demo");
//     }
    
// }
// class Demo2 extends Demo{
//     void add(int a, int b) {
//         System.out.println("add method parent");
//     }

// }
class Demo {
    
    public  final static void main(String[] args) {
        System.out.println("In Var");
        // Demo d = new Demo();
        // d.add(1, 3);
        // d.add();
        // d.main(args);

    }
    public static void main(String[] args, int[] a) { {
        System.out.println("two arguments");
    }
        
    }
}
class Var {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.main(args);
        d.main(args, null);
    }
}
