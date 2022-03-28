import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        mathDemo();
    }


    private static void mathDemo(){

        // Generating random number
        double randomNumber = Math.random();
        int luckyWinner = (int)(randomNumber * 100) + 1;

        System.out.println("Random Number: "+randomNumber);
        System.out.println("Lucky Winner: "+luckyWinner);
        System.out.println();

        // Decimal rounding
        long round1 = Math.round(5.39);
        long round2 = Math.round(5.89);
        long round3 = Math.round(5.50);
        System.out.println("Round 1: "+round1);
        System.out.println("Round 2: "+round2);
        System.out.println("Round 3: "+round3);
        System.out.println();
        /*
        Math.round  - if less than x.5 = x
                    - if greater than x.5 = x+1
                    - if equals to x.5 = x+1
         */

        //ceil
        double ceil1 = Math.ceil(10.01);
        double ceil2 = Math.ceil(10.50);
        double ceil3 = Math.ceil(10.99);
        System.out.println("Ceil1: "+ceil1);
        System.out.println("Ceil2: "+ceil2);
        System.out.println("Ceil3: "+ceil3);
        System.out.println();
        /*
        Math.ceil   - pushes the values to the next whole number
                    - i.e towards right of the number scale
         */
        
        // floor
        double floor1 = Math.floor(12.49);
        double floor2 = Math.floor(12.50);
        double floor3 = Math.floor(12.99);
        System.out.println("floor1: "+floor1);
        System.out.println("floor2: "+floor2);
        System.out.println("floor3: "+floor3);
        System.out.println();
        /*
        Math.floor - pushes the value left to the number scale
         */

        // Max of two values - return the max of any two values - int, float, double, long
        double max = Math.max(25.24, 25.249);
        System.out.println("Max: "+max);
        System.out.println();

        // abs - return the absolute value - positive value of any data
        double abs = Math.abs(-86.45);
        System.out.println("Abs: "+abs);
        System.out.println();

        // pow, sqrt, NaN
        double pow = Math.pow(2d, 8d);
        double sqrt = Math.sqrt(1024d);
        double NaN = 0.0/0.0;
        System.out.println("Pow: "+pow);
        System.out.println("Sqrt: "+sqrt);
        System.out.println("NaN: "+NaN);
        System.out.println();
        /*
        Math.pow - pow(a,b) = a^b
        Math.sqrt = sqrt(a^2) = a

        NaN - Not a Number - a standard by java.
            - returns NaN if a number is infinite or complex number or sqrt less than or equal to 0
         */



    }

}
