/*  This type of object does not have the object name so it is called the Anonymous object
    The object with the name/reference is called as Reference Object
    The Anonymous object cannot be reused. 
 */

 class Demo {
    int id=1;
    String name="Pavan";

    public Demo(){
        System.out.println("Object created");

    }
    public void getData() {
        System.out.println(id+ " : " + name);
    }
 }

 class AnonymousObject {
    public static void main(String[] a){
        //new Demo();                         //Anonymous Object
        new Demo().getData();               //calling the method from the anonymous object
    }
    
 }