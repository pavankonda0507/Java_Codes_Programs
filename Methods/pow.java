package Methods;

class Methods {
    void pow(int num,int power) {
        int pro = 1;
        for(int i= 1;i<=power;i++) {
            pro = pro*num;
        }
        System.out.println(pro);
    }
    public static void main(String[] args) {
        Methods m = new Methods();
        m.pow(5, 3);
    }
    
}
