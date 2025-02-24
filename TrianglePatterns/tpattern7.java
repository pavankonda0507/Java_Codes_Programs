package TrianglePatterns;

class tpattern7 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++) {
            int temp = i;
            for(int j = 1;j<=i;j++) {
                if(i==row||j==1||i==j) {
                    System.out.print(temp+" ");
                }
                else
                    System.out.print("  ");
                temp++;
            }
            System.out.println();
        }
    }    
}
