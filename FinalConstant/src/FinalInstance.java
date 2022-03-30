public class FinalInstance {

    // Initialization with declaration statement
    public final String name = "Nandan";


    // Initialization using Instance Initializer
    public final int id;
    {
        id = 101;
    }

    // Initialization using Constructor
    public final String myString;
    public FinalInstance(){
        myString = "Final initialization using constructor";
    }

    public final int[] arr = {1,2,3,4,5};

    private void alterArr(){
        /**
         * We cannot assign new object(new in[]{1,2,3}) to the final object reference(arr)
         * But, we can change the values of the array elements.
         */
        //this.arr = new int[]{1,2,3};
        this.arr[0] = 25;
        this.arr[3] = 100;
    }

}
