class studentapplication {
    public static void main(String[] args) {
        String name = "PAVAN";
        char section = 'A';
        long mobile = 93925058;
        int s1=34,s2=43,s3=43,s4=34,s5=45,s6=25;
        double Max_marks = 300;
        int sum = s1+s2+s3+s4+s5+s6;
        double percentage = (sum/Max_marks)*100;        //int percentage = (int) ((sum/Max_marks)*100); 
        System.out.println(sum);
        System.out.println("The percentage is "+percentage); 

    }
}