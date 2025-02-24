package LOOPS;

class Count_Factor {
    public static void main(String[] args) {
        int num = 12, i = 1, count = 0;
        while(i<=num) {
            if(num%i==0) {
                System.out.println(i);
                count+=1;
            }
            i++;
        }
        System.out.println("Total number of factors: "+count);
    }
}
