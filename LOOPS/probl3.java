package LOOPS;

class probl3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<=20;i++) {
            int j = i*i;
            System.out.println(j);
            sum +=j;
            j=0;
        }
        System.out.println(sum);
    }
    
}