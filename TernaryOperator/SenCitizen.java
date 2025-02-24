package TernaryOperator;

class SenCitizen {
    public static void main(String[] a) {
        int age = 35;
        String res = (age>=18)?(age>=60?"Senior citizen":"Major"):(age<=10?"Kid":"Adult");
        System.out.println(res);
    }
    
}

