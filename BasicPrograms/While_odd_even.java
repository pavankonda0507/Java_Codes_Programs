package BasicPrograms;

class While_odd_even {
    public static void main(String[] args) {
        int n = 100;
        int i = 1;
        while (i<=n) 
        {
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }

        int n2 = 100;
        int j = 1;
        while(j<=n2) {
            if(j%2!=0) {
                System.out.println(j);
            }
            j++;
        }
    }
    
}
