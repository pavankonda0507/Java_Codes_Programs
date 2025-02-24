package Strings;

class Problem37 {
    public static void main(String[] args) {
        String s = "Java 10 is 123 object36 oriented 223 programming 92 language9872",s2="";
        int num = 0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if((i==s.length()-1||!Character.isDigit(c))&&s2!="") {
                if(num%2==0) {
                    System.out.println(num);
                }
                num = 0;
                s2="";
            }
            else if(Character.isDigit(c)) {
                num = num*10+Character.getNumericValue(c);
                s2+=c;
            }
            
        }
        

    }
    
}
