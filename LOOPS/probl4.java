package LOOPS;

class probl4 {
    public static void main(String[] args) {
        for(int i = 0; i<=20;i++) {
            int num = i,count = 0;
            for(int j = 1;j<=num;j++) {
                if(num%j==0) {
                    count++;
                }
            }
            System.out.println("Num "+num+" has maximum of "+count+" factors");
        }
    }
    
}
