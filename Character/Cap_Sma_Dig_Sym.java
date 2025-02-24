package Character;

class Cap_Sma_Dig_Sym {
    public static void main(String[] args) {
        char letter = '$';
        if (letter>='A' && letter<='Z')
            System.out.println("Capital letter");
        else if (letter>='a' && letter<='z')
            System.out.println("Small letter");
        else if (letter>='0' && letter<='9')
            System.out.println("Digit");
        else if (letter==' ')
            System.out.println("Space");
        else
            System.out.println("Symbol");    
    }
    
}
