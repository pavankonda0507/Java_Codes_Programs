package Methods;

class primerange {
    String prime(int num) {
        int count = 0;
        for(int i = 2;i <= num/2; i++) {
            if(num%i==0) {
                count++;
                break;
            }
        }
        return count==0 && num>1? num+ " :is Prime":num+" :not a Prime";
    }
    public static void main(String[] args) {
        primerange p = new primerange();
        int num = 1;
        for(;num<=100;num++) {
            System.out.println(p.prime(num));
        }
    }
}
