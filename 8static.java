/* Actually each object has the different value, By using the static variable we can make variable common to the all the objects 
   We can call the static variable using the 'class' name
   if we change the static variable to the one object it will effect all the objects                        */

class demo {
    int rollno;
    String name;

    //static variable declaration

    static String clg;        
    void show() {
        System.out.println(rollno+" : "+name+ " : "+clg);
    }
    public static void main(String[] args) {

    
    demo s1 = new demo();
    s1.rollno = 1;
    s1.name = "Pavan";
    demo s2 = new demo();
    s2.rollno = 2;
    s2.name = "Jack";

    //calling by the class name 'demo'

    demo.clg = "BITS";            
    s1.show();
    s2.show();
    }

}