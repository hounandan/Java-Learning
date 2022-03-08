public class Main {


    static double sum(double a, double b){
        return a+b;
    }

    static double avg(double a, double b){
        return (sum(a,b))/2;
    }

    static boolean search(int[] list, int key){
        return true; // Just to Illustrate - how to pass arrays in method calls
    }

    public static void main(String[] args) {

        double myDouble = sum(4.5d, 75.8d);
        System.out.println(myDouble);

        double myAverage = avg(5.2d, 7.1d);
        System.out.println(myAverage);

        int[] list = {1,5};
        search(list, 1);

    }

}
