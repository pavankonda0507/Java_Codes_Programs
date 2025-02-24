package BasicPrograms;

class Quadratic {
    public static void main(String args[]) {
        int a=1,b=1,c=5;
        double res = (b*b)-4*a*c;
        System.out.println(res);
        if(res>0.0){

            double root1 = (-b+Math.sqrt(res))/(2*a);
            double root2 = (-b-Math.sqrt(res))/(2*a);
            System.out.println(root1);
            System.out.println(root2);
        }
        else if(res==0) {
            double root = -b/(2*a);
            System.out.println(root);
        }
        else {
            System.out.println("No real roots");
        }

    }
    
}
