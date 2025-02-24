package BasicPrograms;
class percentagemarks {
    public static void main(String[] args) {
        int m1=100, m2=100, m3=100, m4=100, m5=100;
        int sum = m1+m2+m3+m4+m5;
        double tot = 500.0;
        double per = (sum/tot)*100;
        System.out.println("Percentage: "+per);
    }
}