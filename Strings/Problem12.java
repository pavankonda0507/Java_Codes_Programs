package Strings;

class Problem12 {
    public static void main(String[] args) {
        String s = "hello_all_how_are_you",maxchar = "";
        char ch[] = s.toCharArray();
        int a[] = new int[ch.length],max=0;
        for(int i=0;i<ch.length-1;i++) {
            int count = 1;
            if(a[i]==1) {
                continue;
            }
            for(int j=i+1;j<ch.length;j++) {
                if(ch[i]==ch[j]) {
                    count++;
                    a[j] = 1;
                }
            }
            if(count>1) {
                if(count>=max) {
                    if(count>max) {
                        max = count;
                        maxchar = ch[i]+"";
                    }
                    else {
                        maxchar+=ch[i];
                    }
                }
                
            }
        }
        System.out.println(maxchar);
    }
    
}
