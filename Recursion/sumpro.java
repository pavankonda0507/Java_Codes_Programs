package Recursion;

class Rec {
    int sumOfNatural(int num,int i,int sum) {
        if(i>num) {
            return sum;
        }
        else {
            sum += i;
            return sumOfNatural(num,i+1,sum);
        } 
    }
    int proOfNatural(int num,int i,int pro) {
        if(i>num) {
            return pro;
        }
        else {
            pro = pro*i;
            return proOfNatural(num, i+1, pro);
        }
    }
    public static void main(String[] args) {
        Rec r = new Rec();
        System.out.println(r.sumOfNatural(10, 1,0));
        System.out.println(r.proOfNatural(10, 1,1));
    }
    
}
