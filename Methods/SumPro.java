package Methods;

class SumPro {
    void sum(int num,int sum) {
        for(int i = 1;i<=num;i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    void pro(int num, int pro) {
        for(int i = 1;i<=num;i++) {
            pro *= i;
        }
        System.out.println(pro);
    }
    public static void main(String[] args) {
        SumPro sp = new SumPro();
        sp.sum(10,0);
        sp.pro(10, 1);
    }
}
