package LOOPS;

class Factors {
    public static void main(String[] args) {
        int num = 12, i = 1;
        while(i<=num) {
            if(num%i==0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
