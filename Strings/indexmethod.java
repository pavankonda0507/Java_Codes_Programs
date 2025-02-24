package Strings;

class indexmethod {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.indexOf("o")); //In bracket it shold be written in the string format
        //In case if the multiple characters lastIndexOf() method will give the last index of character
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.indexOf("Hello"));         // will give th eindex of the H
        System.out.println(s.lastIndexOf("Hello"));     // will give th eindex of the H
        System.out.println(s.indexOf("World"));         // will give th eindex of the W
        System.out.println(s.lastIndexOf("World"));     // will give th eindex of the W
    }
}
