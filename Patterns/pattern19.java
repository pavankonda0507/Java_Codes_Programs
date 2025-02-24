package Patterns;

public class pattern19 {
    public static void main(String[] args) {
        int row = 4,col = 4,temp = 2;
        char ch = 'a';
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=col;j++) {
                if(i%2!=0) {
                    System.out.print(ch++ +" ");
                }
                else {
                    System.out.print(temp++ +" ");
                }
            }
            System.out.println();
        }
    }
    
}
