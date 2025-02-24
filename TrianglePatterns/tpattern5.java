/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/
package TrianglePatterns;

public class tpattern5 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++) {
            int temp=i;
            for(int j=1;j<=i;j++) {
                System.out.print(temp+" ");
                temp--;
            }
            System.out.println();

        }
    }
    
}
