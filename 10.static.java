/*                                  STATIC METHOD                               */
/* Basically in every java execution the memory has to be allocated and this memory will be allocated by using the object creation
 * So java provided the method to allocate the method without using the object creation 
 * And this is done by using the 'static' method 
 * static method is the another way of memory allocation
 */

class demo {
    int rollno;                   //instance variable
    String name;
    static String clg;
    public void show() {
        System.out.println("In the instance method");
        System.out.println(rollno+":"+name+":"+clg);
    }
    public static void show1(demo obj){
        System.out.println("In the static method");

    //The non static variables are cannot be accessed inside the static method directly

        System.out.println(obj.rollno+":"+obj.name+":"+clg);
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.name = "Pavan";
        d.rollno = 1;
        demo d2 = new demo();
        d2.name = "Stark";
        d2.rollno = 2;
        demo.clg = "BITS";
        d.show();
        d2.show();

        //static method can be called with the class name without creation of objects  
         
        demo.show1(d);
    }
}