/*with return type and without parameter */
package Methods;

class demo {
    String big() {
        int a = 10, b = 20,c;
        if(a>b) 
            return "a is bigger";
        else    
            return "b is bigger";
    }
    String small() {
        int a = 10, b = 20,c;
        return a<b?"a is small":"b is smaller"; 
        
    }
    
}
class type3 {
    public static void main(String[] args) {
        demo d = new demo();
        String res1 = d.big();
        String res2 = d.small();
        System.out.println(res1);
        System.out.println(res2);
    }
}
