package Character;

class Methods {
    public static void main(String[] args) {
        Character c1 = new Character('a');
        char ch = 'a';
        char ch2 = 'l';;
        //this method returs 0 if ch==ch2 if not equal it give ch(a)(97)-ch2(b)(98) = -1
        int a = Character.compare(ch, ch2);
        System.out.println(a);

        boolean b = Character.isAlphabetic(ch);
        System.out.println(b);

        boolean c = Character.isDigit(ch2);
        System.out.println(c);

        
        System.out.println(Character.isLetter('&'));

        boolean d = Character.isWhitespace(' ');
        System.out.println(d);

        System.out.println(Character.reverseBytes(ch2));

        String s = Character.toString(ch2);
        System.out.println(s);

        System.out.println(Character.toTitleCase(ch2));

        boolean b1 = Character.isTitleCase('L');
        System.out.println(b1);

        System.out.println(Character.toUpperCase('a'));

        System.out.println(Character.getNumericValue('1'));

        System.out.println(Character.getType('#'));

    }  
    
}
