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


    public static void main(String[] args) {

        Student student = new Student();

        student.compute();

    }

}
