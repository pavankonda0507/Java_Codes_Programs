/*
        # 
      #   #
    #       #
  #           #
# # # # # # # # #
 */
package TrianglePatterns;

public class tpattern13 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++) {
            for(int j=row;j>i;j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++) {
                if(i==row||j==1||j==2*i-1)
                
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
    
}
