package TrianglePatterns;

public class tpattern9 {
    public static void main(String[] args) {
        int row = 5,temp = row;
        for(int i = 1;i<=row;i++) {
            for(int j = 1;j<=i;j++) {
                if(i%2==1) {
                    System.out.print(temp++ +" ");
                    temp++;
                }
                else {
                    System.out.print(temp-- +" ");
                    temp--;
                }
            }
            System.out.println();
        }
    }    
}
