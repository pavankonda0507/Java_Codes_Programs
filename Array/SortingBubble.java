package Array;

class SortingBubble {
    public static void main(String[] args) {
        int a[] = {1,4,93,0,21,2,54,90,32};

        for(int i=0;i<a.length-1;i++) {
            for(int j=0;j<a.length-1-i;j++) {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i:a) {
            System.out.println(i);
        }
    }
}
