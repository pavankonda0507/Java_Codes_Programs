package Array;

class Problem7 {
    public static void main(String[] args) {
        char ch[] = {'a','A','1','2','@','#','p','v'};
        int lc = 0,uc=0,sc=0,nc=0,vc=0,cc=0;
        for(char i:ch) {
            if(i>='a'&& i<='z') {
                lc++;
                if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') {
                    vc++;
                }
                else{
                    cc++;
                }
            }
            else if(i>='A'&& i<='z') {
                uc++;
                if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U') {
                    vc++;
                }
                else{
                    cc++;
                }
            }
            else if(i>='1'&&i<='9')
                nc++;
            
            else 
                sc++;
            
        }
        System.out.println("Count of lowercase  :"+lc);
        System.out.println("Count of uppercase  :"+uc);
        System.out.println("Count of numbers    :"+nc);
        System.out.println("Count of vowels     :"+vc);
        System.out.println("Count of consonents :"+cc);
        System.out.println("Count of symbols    :"+sc);

        
    }
    
}
