/* Print the sum of the digits and numbers(two digit or more) in the string
input   : s = "hello 12 and 1 and 100 good 1 3"
output1 : 1+2+1+1+0+0+1+3 = 9
output  : 12+1+100+1+3 = 117
 */
package Strings;

class Problem32 {
    public static void main(String[] args) {
        String s = "hello 12 and 1 and 100 good 1 3";
        int sum = 0;
        System.out.print("Sum of the digits : ");
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                sum = sum+num;
                
            }
        }
        System.out.println(sum);

        System.out.print("Sum of the numbers : ");
        String s2[] = s.split(" ");
        int sum2 = 0;
        for(String i:s2) {
            if(i.charAt(0)>='0'&&i.charAt(0)<='9') {
                int num = Integer.parseInt(i);
                sum2+=num;
            }
        }
        System.out.println(sum2);



        
    }
    
}
