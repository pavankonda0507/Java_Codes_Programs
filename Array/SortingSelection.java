package Array;

class SortingSelection {
    public static void main(String[] args) {
        int a[] = {50,40,30,20,10};
        for(int i=0;i<a.length-1;i++) {
            int min = i;
            for(int j=i+1;j<a.length;j++) {
                if(a[min]>a[j])
                    min=j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        
        for(int i : a) {
            System.out.println(i);
        }

    }

    
}
