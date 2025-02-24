/*
        $ 
      $ $
    $   $
  $     $
$ $ $ $ $
 */
package TrianglePatterns;

public class tpattern12 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++) {
            for(int j=5;j>i;j--) {
                System.out.print("  ");
            }
            
            for(int j=1;j<=i;j++) {
                if(i==row||j==1||j==i)
                    System.out.print("$ ");
                else    
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
