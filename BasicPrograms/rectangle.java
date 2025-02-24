package BasicPrograms;

class rectangle {
    public static void main(String[] args){
        System.out.println("Rectangle area and perimeter");
        int len = 10,breadth = 6;       //double l = 5, b = 6;
        int area = len*breadth;        //double area = l*b;per = 2*(l+b);
        int perimeter = 2*(len+breadth);
        System.out.println("The area of the rectangle:" +area);
        System.out.println("The perimeter of the rectangle:" +perimeter);
        if (area>perimeter){
            System.out.println("The area of the rectangle with length = "+len+" and breadth = "+breadth+ "is greater than its perimeter");
        }
        else {
            System.out.println("The perimeter of the rectangle with length = "+len+" and breadth = "+breadth+ "is greater than its area");
        }


    }
    

}
