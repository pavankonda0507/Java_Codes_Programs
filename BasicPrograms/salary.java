package BasicPrograms;

class salary {
    public static void main(String[] args) {
        int salary = 50000;
        double dearness_allowence = (40/100.0)*salary;
        double rent_allowence = (20/100.0)*salary;
        double rem_sal = salary-(dearness_allowence+rent_allowence);
        System.out.println("Reamaing amount of salary:"+rem_sal);
    }
}
