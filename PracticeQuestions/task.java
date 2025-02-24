package PracticeQuestions;
class task {
    public static void main(String[] args) {
        int num = 2356;
        int rem = num%10;
        int rem_num = num/10;
        System.out.println("The remaining digits except last digit:"+rem_num);
        if(rem%5==0) {
            System.out.println("remaining numbers are  divisible by 5");
            int res = 5+rem_num;
            System.out.println(res);
        }
        else {
            System.out.println("remaining numbers are not divisible by 5");
            int res = 5*rem_num;
            System.out.println(res);
        }

    }   
}
