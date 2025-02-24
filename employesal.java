class employee {
    public static void main(String[] args) {
        String emp_name = "Pavan";
        int emp_id=424;
        String emp_design = "Developer";
        String emp_depart = "Production";
        int tot_sal = 30000;
        int tot_days = 24;
        int pre_days = 20;

        double one_day_sal = tot_sal/tot_days;
        double sal_rec = one_day_sal*pre_days;

        System.out.println("Employee name:"+emp_name);
        System.out.println("Employee ID:"+emp_id);
        System.out.println("Employee designation:"+emp_design);
        System.out.println("Employee department:"+emp_depart);

        System.out.println("Monthly salary:"+tot_sal);
        System.out.println("Salary without hike:"+sal_rec);

        double sal_hike=(10/100.0)*tot_sal;
        
        System.out.println("10% salary hike:"+sal_hike);

        double hike_sal = sal_rec+sal_hike;
        System.out.println("Total salary with hike:"+hike_sal);

    }
}