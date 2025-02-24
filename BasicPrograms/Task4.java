package BasicPrograms;

class Task4 {
    public static void main(String[] args) {
        int n = 100;
        int i = 1;
        int sum = 0;
        while (i<=n) {
            if(i%2==0) {
                System.out.println(i);
            }
            else {
                sum = sum+i;
            }
            i++;
           
        }
        System.out.println("sum is:"+sum);
    }
    
}
