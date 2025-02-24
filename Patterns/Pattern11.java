package Patterns;
class Pattern11 {
    public static void main(String[] args) {
        int row = 5, col = 5;
        for(int i=1;i<=row;i++) {
            for(int j = 1;j<=col;j++) {
                if((i==1&&j==1)||(i==2&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==3&&j==2)||(i==3&&j==3)||(i==4&&j==1)||(i==5&&j==4)||(i==5&&j==5))
                    System.out.print("* ");
                else    
                    System.out.print("# ");
            }
            System.out.println();
        }
    }    
}
