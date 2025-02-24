package OOPS.Constructors;

class DefAndPar {
    DefAndPar() {
        System.out.println("default constructor");
    }
    DefAndPar(int a) {
        System.out.println("Parameterized constructor");
    }   
}
class Out {
    public static void main(String[] args) {
        DefAndPar obj = new DefAndPar();
        DefAndPar obj2 = new DefAndPar(20);
    }
}
