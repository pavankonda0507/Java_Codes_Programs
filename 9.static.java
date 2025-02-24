/*                                      STATIC BLOCK                            */

/* In order to initialize the static variable only once we use the 'static block' 
   if we use the constructor, each time we create the object, the constuctor is called to avoid initilizing the static variable multiple
   times we use he static block and It is initialized only once.
   
   The object is created in the two steps
   1.Class loads
   2.Object instantiated

   In the JVM the 'class loader' will present by default no class is loaded, so the class is loads in the class loader from the library
   and it will happen only once. As every time you load a class it will call static block. Hence the static block is executed firstly than the 
   constructor
   After the class loder the objects are created
   As the class is already created the next object can be created without calling agian the static block .
 */

class mobile {
    String brand;
    int price;
    static String name;
    static {
        name = "Smart Phone";
        System.out.println("In the static block");
    }
    

    mobile() {

        brand = "Apple";
        price = 50000;
        
        System.out.println("In the constructor");
        System.out.println(brand +" :" + price +" : " + name);

    }

    //If we created the static block after the constructor then it will be called before the constructor method

    //static {
    //    name = "Smart Phone";
    //    System.out.println("In the static block");
    //}
   
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        
        mobile obj2 = new mobile();
        obj2.brand = "Samsung";



    }
}