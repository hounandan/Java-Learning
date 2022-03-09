public class Main {


    static void go(int[] array){
        System.out.println("array[0] : "+array[0]);
        System.out.println("array[1] : "+array[1]);
        array[1] = 22;
    }

    static void go(int number){
        System.out.println("go(int number)");
    }

    static void go(short s){
        System.out.println("go(short s)");
    }


    public static void main(String[] args) {

        int[] array = {1,2};
        go(array);
        System.out.println("array[1] : "+array[1]);

        int number = 1000;
        go(number);

        short s = 20;
        go(s);
    }

}
