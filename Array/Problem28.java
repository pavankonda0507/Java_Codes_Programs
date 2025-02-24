package Array;

class Problem28 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80},index = 4,element = 45;
        int b[] = new int[a.length+1];
        int x = 0;
        while(index<=b.length) {
            for(int i=0;i<a.length;i++) {
                if(x==index) {
                    b[x] = element;
                }
                else {
                    b[x] = a[i];
                    x++;
                }

            }
        }
        for(int i:b) {
            System.out.println(i);
        }
    }
    
}
