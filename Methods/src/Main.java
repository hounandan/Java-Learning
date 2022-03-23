public class Main {


    static void varargsMethod(boolean flag, int a, int b, int c){
        System.out.println("Method without Varargs");
    }

    static void varargsMethod(boolean flag, int ... i){
        System.out.println("Method with Varargs");
        System.out.println("Size of int array: "+i.length);
    }


    public static void main(String[] args) {

        Main.varargsMethod(true, 1, 2, 3);
        Main.varargsMethod(true, 4, 5, 89, 7);
        Main.varargsMethod(true, 1,2,3,4,5,6,7,8,9);


    }

}
