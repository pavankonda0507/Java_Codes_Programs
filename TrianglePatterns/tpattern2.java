/*
# 
# #
# $ #
# $ $ #
# $ $ $ #
# # # # # #
 */
package TrianglePatterns;

public class tpattern2 {
    public static void main(String[] args) {
        int row = 6;
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=i;j++) {
                if(j==1||i==row||i==j) {
                    System.out.print("# ");
                }
                else    
                    System.out.print("$ ");
            }
            System.out.println();
        }
    }
    
}
