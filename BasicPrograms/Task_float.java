/*Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different */

package BasicPrograms;

class Task_float {
    public static void main(String[] args) {
        double a = 25.586;
        double b = 25.578;
        double x = a*1000;
        double y = b*1000;
        int que1 = (int) (x/1000);
        int que2 = (int) (y/1000);
        if(x==y) {
            System.out.println("They are same");
        }
        else {
            System.out.println("They are different");
        }

    }
    
}
