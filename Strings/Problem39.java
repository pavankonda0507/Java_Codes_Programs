package Strings;

class Problem39 {
    public static void main(String[] args) {
        String s = "a12b13c5",s2="";
        int num = 0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if((i==s.length()||!Character.isDigit(c))&&s2!="") { 
                char b = c;
                for(int j=0;i<num;j++) {
                    System.out.println(b);
                }
                num = 0;
                s2="";

            }
            else if(Character.isDigit(c)) {
                num = num*10+Character.getNumericValue(c);
                s2+=num;
            }
        }
    }
    
}
