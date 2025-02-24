/*
Write program to find the duplicate characters in string
 */
package Strings;

class Problem9 {
    public static void main(String[] args) {
        String s = "hello all how are you",s2 = "";
        char ch[]  = s.toCharArray();
        int a[] = new int[ch.length];
        for(int i=0;i<ch.length-1;i++) {
            int count=1;
            if(a[i]==1) {
                continue;
            } 
            for(int j=i+1;j<ch.length;j++) {
                if(ch[i]==ch[j]) {
                    count++;
                    a[j]=1;
                }
            }
            if(count>1)
                System.out.println(ch[i]+" "+count);
        }

        

    }
    
}
