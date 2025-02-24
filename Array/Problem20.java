package Array;

class Problem20 {
    public static void main(String[] args) {
        int a[] = {4,-3,84,93,93,3,9,-2,82-47,-674};
        int poscount = 0,negcount = 0,evencount = 0,oddcount = 0;
        for(int i:a) {
            if(i>=0) {
                poscount++;
            }    
            else {
                negcount++;
            }
        }
        for(int i:a) {
            if(i%2==0) {
                evencount++;
            }
            else {
                oddcount++;
            }
        }
        System.out.println("Positive: "+poscount);
        System.out.println("Negative: "+negcount);
        System.out.println("Even: "+evencount);
        System.out.println("Odd: "+oddcount);
    }
    
}
