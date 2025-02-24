package Methods;

class BubbleSort { 
    int[] bubbleSort(int a[]) {
        for(int i=0;i<a.length-1;i++) {
            for(int j=0;j<a.length-1;j++) {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    } 
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int a[] = {39,37,29,0,13,92,81,91,20};
        int res[] = b.bubbleSort(a);
        for(int i:res) {
            System.out.println(i);
        }
    }
    
}
