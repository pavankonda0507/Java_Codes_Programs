package TernaryOperator;

class nested {
    public static void main(String[] args) {
        int num = 35;
        String res = (num%2==0)?(Math.sqrt(num)==(int) Math.sqrt(num)?"Perfect number":"Not a perfect number"):(num>=0?"Positive num":"Negative number");
        System.out.println(res);
    }
    
}