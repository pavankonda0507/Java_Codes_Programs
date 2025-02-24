package LOOPS;

class Prime {
    public static void main(String[] args) {
        int num = -3,i=1,count = 0;
        while(i<=num) {
            if(num%i==0){
                System.out.println(i);
                count+=1;
            }
            i++;
        }
        System.out.println(count);
        if(count==2)
            System.out.println("Prime");
        else 
            System.out.println("Not a prime");
    }

}
