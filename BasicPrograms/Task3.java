package BasicPrograms;

class Task3 {
    public static void main(String[] args) {
        int num = 3;
        System.out.print(num+" ");
        while (num!=1) {
            if(num%2==0) {
                num /=2;
                System.out.print(num+" ");
            }
            else {
                num = (3*num)+1;
                System.out.print(num+" ");
            }


            
        }
    }
    
}
