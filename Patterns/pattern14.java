package Patterns;

public class pattern14 {
    public static void main(String[] args) {
        int row = 7, col = 7;
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=col;j++) {
                if(i==1||j==col||i+j==row+1) 
                    System.out.print("* ");
                else    
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
