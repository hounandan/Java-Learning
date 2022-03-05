import java.math.BigDecimal;

public class Student {


    public static void main(String[] args) {


        double dFirst = 1d;
        double dSecond = 0.9d;
        System.out.println("(Double) 1 - 0.9 = "+(dFirst-dSecond));

        /*
         Expected = 0.1, but its 0.09999999999999998
         Why? - In java, decimal values are stored using IEEE 754 standard - which using 2s' complement for storing decimal values
         That might not yield expected values in real-time
         */


        BigDecimal bdFirst = new BigDecimal("1");
        BigDecimal bdSecond = new BigDecimal("0.9");
        System.out.println("(BigDecimal) 1 - 0.9 = "+(bdFirst.subtract(bdSecond)));

        /*
        To obtain exact decimal values from Java, please refrain using float and double.
        It is recommended to use BigDecimal for exact calculations and results
        Eg - ECommerce & Banking Application
         */


    }

}
