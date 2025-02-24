package FinlaAndStatic;

class Demo12 {
    static int x;
    Demo12() {
        x = 10;
        System.out.println(x);
        System.out.println("Hello all");
    }
}
// class Demo2 extends Demo {
//     void add() {
//         System.out.println(super.num);
//     }
// }

class Const {
    public static void main(String[] args) {
        Demo12 d = new Demo12();
        
    }
    
}
