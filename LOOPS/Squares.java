package LOOPS;

class Squares {
    public static void main(String args[]) {
        int num = 100,i=1;
        
        while(i<=num) {
            int sqrt = (int) Math.sqrt(i);
            if(sqrt*sqrt==i) {
                System.out.println(i+": Perfect Square");
            }
            i++;
        }

    }
    
}
