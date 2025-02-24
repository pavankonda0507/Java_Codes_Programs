package Strings;

class Problem30 {
    public static void main(String[] args) {
        String s = "a10b12c10",s2 = "";
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length-1;i++) {
            if(ch[i]>='0'&&ch[i]<='9'&& ch[i+1]>='0'&&ch[i+1]<='9') {
                s2=""+ch[i]+ch[i+1];
                int num = Integer.parseInt(s2);
                for(int j=0;j<num;j++) {
                    System.out.print(ch[i-1]);
                }
            } 
        }
        
        
    }
    

                                                                                
}
