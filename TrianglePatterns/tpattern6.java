/*
1 
2 1 
3   1 
4     1 
5 4 3 2 1
 */
package TrianglePatterns;
class tpattern6 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++) {
            int temp = i;
            for(int j=1;j<=i;j++) {
                if(i==j||i==row||j==1){
                    System.out.print(temp +" ");
                }
                else    
                    System.out.print("  ");
                temp--;
                

            }
            System.out.println();
        }
        
    }
    
}
