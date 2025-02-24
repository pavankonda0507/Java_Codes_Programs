package PracticeQuestions;

/*class perfectsquare {
    public static void main(String[] args) {
        int num = 64;
        if (num>=0) {
            int res = (int) Math.sqrt(num);
            if (res*res==num) {
                System.out.println("perfect square");
            }
            else {
                System.out.println("Not a perfect square");
            }
        }
        else {
            System.out.println("The given number is -ve, not a perfect square");
        }
        
    }
    
}
*/
class A {
    public static void main(String[] args) {
      int a = 24;
      double res = Math.sqrt(a);
      double b =(a/res);
      if(res==b) {
        System.out.println("Perfect Square");

      }
      else {
        System.out.println("Not a perfect square");
      }

    }
}