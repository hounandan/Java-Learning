public class Student {


    byte rank = 123;
    short id = 12345;
    int number = 1234567890;
    long phone = 7338880103L;

    /*
    float typeFloat = 5.26;

    --> Will show an incompatible type error. By default, 5.26 is considered as double literal.
    Always recommeded to use 'f' or 'd' as a trailing digit to represent float or double
    */

    float typeFloat = 5.26f;
    double typeDouble = 25.669d;



    void compute(){

        System.out.println("Float = "+typeFloat);
        System.out.println("Double = "+typeDouble);

        System.out.println("Double min value = "+Double.MIN_VALUE);
        System.out.println("Double max value = "+Double.MAX_VALUE);
        System.out.println("Float min value = "+Float.MIN_VALUE);
        System.out.println("Float max value = "+Float.MAX_VALUE);

    }


    public static void main(String[] args) {

        Student student = new Student();

        student.compute();
    }

}
