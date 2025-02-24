package TwoDArray;

class ColumnCount {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,7,4},{3,6,5}};
        for(int i=0;i<a.length;i++) {
            int sum = 0;
            for(int j=0;j<a[i].length;j++) {
                    sum+=a[j][i];
                    
            }
            System.out.println("column"+i+" sum "+sum);
        }
    }
    
}
