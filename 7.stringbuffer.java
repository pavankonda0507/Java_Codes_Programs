/*  Basically strings are immutable.
    But using the concepts 'StringBuffer' and 'StringBuilder' we can change immutable to mutable 
    StringBuffer is Thread safe method and the String Builder is not   */


class demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pavan");
        System.out.println(sb.capacity());
        System.out.println(sb.append(" Java"));
        System.out.println(sb.delete(3,5));
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.insert(0,"P"));

        StringBuilder s = new StringBuilder("Hello");
        System.out.println(s.append(" Java"));
        System.out.println(s.reverse());

        String s1 = sb.toString();
        System.out.println(s1);
        


    }
}
