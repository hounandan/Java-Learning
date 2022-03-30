public class FinalStatic {

    /**
     * 1. A static final variable must always be in UPPERCASE
     * 2. Initialization in the declaration statement
     * 3. Initialization using static initializer
     */

    // 1, 2
    public static final double PI_VALUE = 3.1416;

    public static final String MY_NAME;
    static {
        MY_NAME = "Hounandan R";
    }

    public void printStaticFinal(){
        System.out.println(PI_VALUE);
        System.out.println(MY_NAME);
    }

}
