class claculator {
    int a=2;                                      //here 'a' is type int as we know it is a integer 
    int add(int n1,int n2){
        int r = n1+n2;
        //System.out.println(r);
        System.out.println("The a value is:"+a);
        return r;
    }
    public static void main(String[] args) {
        claculator c = new claculator();          //here the new object is created of type calculator and assigned to the variable  'c'
        int result = c.add(2,3);            // calling the method/function
        System.out.println("The addition:"+result);

    }

    
}
