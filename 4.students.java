class students {
    int rollno;
    String name;
    int marks;

    public static void main(String[] args) {
        students s1 = new students();
        s1.rollno=1;
        s1.name="Pavan";
        s1.marks=91;

        students s2 = new students();
        s2.rollno=2;
        s2.name="Adarsh";
        s2.marks=90;

        students s3 = new students();
        s3.rollno=3;
        s3.name="Raj";
        s3.marks=95;

        students stud[] = new students[3];
        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;

        for(int i=0;i<stud.length;i++) {
            System.out.println(stud[i].rollno+"." + stud[i].name+" : "+stud[i].marks);
        }



    }
}