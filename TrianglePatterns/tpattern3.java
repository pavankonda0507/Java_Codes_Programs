/*
1  
2  3  
4  5  6
7  8  9  10
11 12 13 14  15
 */
package TrianglePatterns;

public class tpattern3 {
    public static void main(String[] args) {
        int row = 5,temp=1;
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
    
}
