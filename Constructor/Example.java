package Constructor;

class data {
    int id;
    String name;
    
    public data() {
        System.out.println("Default constructor");

    }
    public data(int a,String s) 
    {
        this.id = a;
        this.name = s;
        System.out.println(id+" : "+name);
        System.out.println("Parametarized constructor");

    }
    public static void main(String[] args) {
        data obj = new data();
        data obj1 = new data(1,"Pavan");
    }
}