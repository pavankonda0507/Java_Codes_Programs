package TrianglePatterns;

public class tpattern10 {
    public static void main(String[] args) {
        int row = 4,col = 3,temp = 1;
        char ch = 'a';
        for(int i = 1;i<=row;i++) {
            for(int j=1;j<=col;j++) {
                if(i%2==1) {
                    System.out.print(temp++ +" ");
                }
                else {
                    System.out.print(ch++ +" ");
                }
            }
            System.out.println();
        }
    }
    
}
