package Array;

class Problem26 {
    
    public static void main(String[] args) {
        char ch[] = {'a','A','c','D'};
        for(char i:ch) {
            if(i>='a'||i<='z') {
                i = (char) (i-32);
            }
            else {
                i = (char) (i+32);
            }
        }
        for(char i:ch)
        {
            System.out.println(i);
        }


    }
}
