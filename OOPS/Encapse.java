package OOPS;

class student {
    private int age;         //we can assign the variables here also
    private String name;

//To access the private variables we use the public methods and by using these methods we can set the variable values

    //setter
    public void setAge(int a) {
        age = a;
    }
    public void setName(String s) {
        name = s;

    }
    //getter
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
public class Encapse {
    public static void main(String[] args) {
        student obj = new student();
        obj.setAge(21);
        obj.setName("Pavan");
        System.out.println(obj.getName()+" : "+ obj.getAge());
    }
}