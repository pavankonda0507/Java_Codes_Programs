package BasicPrograms;

class fibonicci {
    public static void main(String args[]) {
      int a = 0,b = 1,c=0;
      System.out.println(a);
      System.out.println(b);
      for(int i=0;i<8;i++) {
        c = a+b;
        a=b;
        b=c;
        System.out.println(c);
      }
    }
    
}
