package BasicPrograms;

class TaskZero {
    public static void main(String[] args) {
        double num = -1;
        if(num==0.0) {
            System.out.println("zero");
        }
        else if(num>0.0) {
            if (num>1000000) {
                System.out.println("large");
            }
            else if (num<1) {
                System.out.println("small");
            }
            else {
                System.out.println("Positive");
            }
        }
        else {
            if (num<0) {
                System.out.println("negative");
            }
        }
    }
    
}
