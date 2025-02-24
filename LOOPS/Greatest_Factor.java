package LOOPS;

class Greatest_Factor {
    public static void main(String a[]) {
        int num = 20,i = 1,greatest_factor=1;
        while ((i<=num/2)) {
            if(num%i==0) {
                    greatest_factor=i;
                }
            }
            i++;
        System.out.println(greatest_factor);
    }
        
}
