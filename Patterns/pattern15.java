package Patterns;

class pattern15 {
    public static void main(String[] args) {
        int row = 9,col=9;
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=col;j++) {
                if(i==1||i==row||j==1||j==col||(j==col-6||j==col-2)||(i==row-6||i==row-2)||i==(row/2)+1&&j==(col/2)+1)
                    System.out.print(". ");
                else if(i==2&&j==3)
                    System.out.print("  ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
