package Strings;

class Problem11 {
    public static void main(String[] args) {
        String s = "Codinghub Innovations Private Limited";
        String str[] = s.split(" ");
        
        for(int i=0;i<str.length;i++) {
            if(i%2!=0) { 
                for(int j=str[i].length()-1;j>=0;j--) {
                    System.out.print(str[i].charAt(j));
                }
            }
            else {
                System.out.print(str[i]);
            }
            System.out.print(" ");            
        }
    }
    
}
