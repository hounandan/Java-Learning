public class Recursion {

    public static long factorialNR(int num){

        if(0 == num || 1 == num){
            return 1L;
        }

        long factorial = 1L;
        while (num >= 2){
            factorial = factorial * num--;
        }
        return factorial;
    }

    public static long factorialRecursive(int num){

        if(0 == num){
            return 1;
        }

        return num * factorialRecursive(num-1);
    }


    /*
    * For performing binary search, first the array last to sorted.
    * Then the sorted array is used to find the element we want
    * 1st - we find the mid point - if the mid point is equal to our desired value - returns the value
    * 2nd - if our value is greater than the mid point, we recursive call the method again with,
    * mid point till the last index.
    * 3rd - if our values is lesser than the mid point, we recursive call the method again with,
    * first index till mid point.
    *
    * By the above recursive function - our value is found way faster than linear search
    *
    * */

    public static int binarySearch(int[] arr, int startIndex, int lastIndex, int key){

        if( startIndex == lastIndex){
            if(arr[startIndex] == key) return startIndex;
            else return -1;
        }

        int midPoint = (startIndex + lastIndex)/2;
        if(key == arr[midPoint]) return midPoint;
        if( key > arr[midPoint]) return binarySearch(arr, midPoint+1, lastIndex,key);
        if( key < arr[midPoint]) return binarySearch(arr, startIndex, midPoint-1, key);

        return -1;

    }

}
