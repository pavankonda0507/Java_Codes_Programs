package BasicPrograms;

public class Task6 {
    public static void main(String[] args) {
        int num = 1;
        while(num<=50) {
            int Last_digit = num%10;
            System.out.println(num+" "+Last_digit);
            num++;
        }
    }
    
}
