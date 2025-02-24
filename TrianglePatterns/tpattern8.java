package TrianglePatterns;

class tpattern8 {
    public static void main(String[] args) {
        int row = 5,temp = 1;
        for(int i = 1;i<=row;i++) {
            for(int j=1;j<=i;j++) {
                if(i==row||j==1||i==j) {
                    System.out.print(temp+" ");
                    temp++;
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
