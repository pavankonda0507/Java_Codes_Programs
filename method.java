class college {

    public void rollNo(int a) {
        System.out.println("The rollno is :"+a);
    }
    public String studName(int rollNo) {
        return "Pavan";
    }
}
class Out {

    public static void main(String[] args) {
        college obj = new college();
        obj.rollNo(24);
        String result = obj.studName(24);
        System.out.println(result);
    }
}
