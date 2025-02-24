package TrianglePatterns;

public class tpattern11 {
    public static void main(String[] args) {
        int x = 5;
        for(int r = 1;r<=5;r++) {
            for(int c = 1;c<=r;c++) {
                if(r%2!=0) {
                    if(r==1) {
                        System.out.print(x+" ");
                        continue;
                    }
                    if(r!=1) {
                        x++;
                        System.out.print(x+" ");
                    }
                }
                else {
  
                    System.out.print(x+" ");
                    x--;
                }

            }
            System.out.println();
        }
    }
    
}
