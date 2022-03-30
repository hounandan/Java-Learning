public class ConstantVariable {

    /**
     * There is a fine line between Final variable and constant variable
     * 1. Primitive / String final variables are qualified as "CONSTANT VARIABLE"
     * 2. The Variable must be initialized in the "Declaration Statement" itself
     * 3. Iniatilized with compile-time constants (Integer literal / String literal)
     *
     * The key thing to note here is - it's evaluated @compile-time & saves runtime head
     */

    // Valid Examples
    final int x = 25;
    final String a = "Hello";
    final int x1 = 23 + 5;
    final String a1 = "hello" + "world!";

    final int z = 5;
    final int x2 = 25 + z;

    /**
     * 1. z can be changed by the user/program @runtime as it is not final
     * 2. the getValue() is invoked only @runtime
     * 3. the constructor is invoked only @runtime
     * 4. the static initializer is invoked only @runtime
     */

//    InValid Examples
//    1
//    int z=5;
//    final int x = 23 + z;
//
//    2
//    final int x = getValue();
//
//    3
//    public class Test{
//        final int x;
//        public Test(){
//            x = 23;
//        }
//    }
//
//    4
//    public class Test{
//        static final int x;
//        static{
//            x = 25;
//        }
//    }

}
