//with return type and with parameter

package Methods;

class demo2 {
    String big(int a, int b) {

        if(a>b) 
            return "a is bigger";
        else    
            return "b is bigger";
    }
    String small(int a, int b) {
        return a<b?"a is small":"b is smaller"; 
        
    }
    
}
class type3 {
    public static void main(String[] args) {
        demo2 d = new demo2();
        String res1 = d.big(2,3);
        String res2 = d.small(2,3);
        System.out.println(res1);
        System.out.println(res2);
    }
}

