/*
        # 
      # # #
    # # # # #
  # # # # # # #
# # # # # # # # #
  # # # # # # #
    # # # # #
      # # #
        #
 */
package TrianglePatterns;

public class tpattern18 {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++) {
            for(int j=row;j>i;j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for(int i=1;i<row;i++) {
            for(int j=1;j<i+1;j++) {
                System.out.print("  ");
            }
            for(int j=2*row-1;j>2*i;j--) {
                
                    System.out.print("# ");
                
            }
          

            System.out.println();
        }
    }
    
}
