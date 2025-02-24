package Character;

class CaptoSmall {

    public static void main(String[] args) {
        char capital = 'A';
        char lower = 'a';
        char lower_case= (char) (capital+32);
        char upper_case = (char) (lower-32);
        System.out.println(lower_case);
        System.out.println(upper_case);
    }
}


