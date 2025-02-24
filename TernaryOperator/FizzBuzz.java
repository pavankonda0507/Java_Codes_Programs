package TernaryOperator;
class FizzBuzz {
    public static void main(String[] args) {
        int num = 22;
        String res = (num%3==0)?(num%5==0?"Fizz Buzz":"Fizz"):(num%5==0?"Buzz":"Not valid");
        System.out.println(res);

    }
    
}
