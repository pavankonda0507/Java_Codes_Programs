package Character;

public class Char_Case_Change {
    public static void main(String[] args) {
        char alpha = 'a';
        System.out.println("Given alphabet:"+alpha);
        if (alpha>='A' && alpha<='Z') {
            System.out.println("It is in Uppercase");
            //char lower_case = Character.toLowerCase(alpha);               
            char lower_case = (char) (alpha+32);
            System.out.println("After case change:"+lower_case);

        }
        else if(alpha>='a'&& alpha<='z') {
            System.out.println("It is in Lowercase");
            //char upper_case = Character.toUpperCase(alpha);              
            char upper_case = (char) (alpha-32);
            System.out.println("After case change:"+upper_case);
        }
    }
    
}
