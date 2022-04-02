public class Main {

    public static void main(String[] args) {

//        long result = Recursion.factorialNR(6);
//        System.out.println(result);
//
//        long recursiveResult = Recursion.factorialRecursive(6);
//        System.out.println(recursiveResult);

        int[] arr = new int[]{11,27,34,40,59,66,73,82,97,108};
        int index = Recursion.binarySearch(arr, 0, 9, 108);
        if(index>0) System.out.println("Element found @"+index+" : "+arr[index]);
        else System.out.println("Element not found");
    }

}
