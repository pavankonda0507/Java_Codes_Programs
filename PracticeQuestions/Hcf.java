package PracticeQuestions;
class Hcf {
    public static void main(String[] args) {
        int num1 = 6, num2 = 12;
        int i=1,hcf = 0;
        while (i<=num1 && i<= num2) 
        {
            if(num1%i==0 && num2%i==0) {
                System.out.println("Common factors:"+i);
                hcf = i;
            }
            i++;
            
        }
        System.out.println("HCF: "+hcf);


        /* 
        System.out.println("______________________________________");

        
        int HCF=0;
        for(int i = 1;num1%i==0 && num2%i==0;i++) {
            System.out.println("Common factors:"+i);
            HCF = i;

        }
        System.out.println("Hcf is: "+HCF);
        */
        
    }
    
}
