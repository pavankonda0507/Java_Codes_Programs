package TypeConversion;

class typecasting
{
    public static void main(String[] args) {

        //Implicit type casting: Conversion of smaller data tyte size to larger data type (it will done automatically)
        byte number = 21;
        int number2 = number;
        System.out.println(number2);

        short number3 = 45;
        long number4 = number3;
        System.out.println(number4);

        int number5 = 56;
        long number6 = number5;
        System.out.println(number6);

        float decimal = 65.676f;
        double dec2 = decimal;
        System.out.println(dec2);



        //Explicit type casting:Conversion of larger data tyte size to smaller data type (it will done manually)
        int num = 34;
        byte num2 = (byte) num;
        System.out.println(num2);

        int num3 = 37;
        short num4 = (short) num3;
        System.out.println(num4);


        float n1 = 356.75f;
        long n2 = (long) n1;            //float has higher precision than long(and int) eventhouth long has higher size 
        System.out.println(n2);         //so implicit type casting not possible
                                    
    }
}