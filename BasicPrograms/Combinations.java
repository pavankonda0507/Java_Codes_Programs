package BasicPrograms;

class Combinations {
    public static void main(String[] args) {
        int n = 5, r = 3, n_r = n-r;
        int prod1 = 1, prod2 = 1, prod3 = 1;
        int i=1, j=1, k=1;
        while(i<=n) {
            prod1 = prod1*i;
            i++;
            
        }
        System.out.println(prod1);

        while(j<=r) {
            prod2 = prod2*j;
            j++;
        }
        System.out.println(prod2);
        while(k<=n_r) {
            prod3 = prod3*k;
            k++;
        }
        System.out.println(prod3);

        double com = prod1/(prod2*prod3);
        System.out.println("The result is :"+com);



    }
}
