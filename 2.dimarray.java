class hello {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];         //it consists of Two rows and Threee columns ans starts from the 0 
        arr[0][1] = 4;

        System.out.println(arr[0][1]);       //Here 0 th row and index number 1 we are getting
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<3;j++) {
                arr[i][j] = (int) (Math.random()*10); //Basically random function gives the double value so cast to the int type
            }
        }
        
        for(int i = 0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(arr[1][0]);
    }
}
