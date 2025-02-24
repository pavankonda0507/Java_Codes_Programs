/* 'this' is the keyword which represents the current object in a method or constructor
 * It is used to differentiate between the local and instance variables. Using “this” reference can improve code
   readability and reduce naming conflicts.
 */

package OOPS;

class demo {
    int age;                              //Here 'age' and 'name' is and instance variable
    String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {         //Here 'age' and 'name' is an local variable
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class This {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.setAge(21);
        obj.setName("Pavan");
        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}