package FinlaAndStatic;

class Statuse {
        String name;
        static String college;
        int id;
        void person1() {
            System.out.println("Name:"+name+" College:"+college+" Id:"+id);
        }
}
class Exstatic {
    public static void main(String[] args) {
        Statuse s = new Statuse();
        s.name = "Pavan";
        s.college = "Bits";
        s.id = 1;
        Statuse s1 = new Statuse();
        s1.name = "Ram";
        s1.college = "KITS";
        s1.id = 2;
        Statuse.college = "BITS";
        s.person1();
        s1.person1();

    }
}