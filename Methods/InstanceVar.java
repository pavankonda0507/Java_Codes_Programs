package Methods;

class InstanceVar {
    static int num = 10;
        void methodA() {
            System.out.println(num);
        }
        static void methodB() {
            System.out.println(num);
    }
    public static void main(String[] args) {
        InstanceVar i = new InstanceVar();
        InstanceVar.num = 30;
        i.methodA();
        InstanceVar.num = 20;
        InstanceVar.methodB();
        i.methodA();
    }
    
}
