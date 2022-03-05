public class Student {


    byte rank = 123;
    short id = 12345;
    int number = 1234567890;
    long phone = 7338880103L;




    void compute(){

        System.out.println("Rank : "+rank);
        System.out.println("Id : "+id);
        System.out.println("Number : "+number);
        System.out.println("Phone : "+phone);

        System.out.println("Byte Max : "+Byte.MAX_VALUE+" Min : "+Byte.MIN_VALUE);
        System.out.println("Short Max : "+Short.MAX_VALUE+" Min : "+Short.MIN_VALUE);
        System.out.println("Int Max : "+Integer.MAX_VALUE+" Min : "+Integer.MIN_VALUE);
        System.out.println("Long Max : "+Long.MAX_VALUE+" Min : "+Long.MIN_VALUE);

    }

    static void primitives(){

        //decimal literal
        int decimal = 12345;
        System.out.println("Decimal Literal -  "+decimal);

        //octal literal
        int octal = 0456;
        System.out.println("Octal Literal - "+octal);

        //hexa literal
        int hexa = 0x123Face;
        System.out.println("Hexa Literal - "+hexa);

        //binary literal
        int binary = 0b0100_0110;
        System.out.println("Binary Literal - "+binary);


    }

    public static void main(String[] args) {

        Student student = new Student();

        primitives();
    }

}
