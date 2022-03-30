public class FinalLocal {

    private String dummy;

    public void testFinalLocal(){

        final int myInt = 10;
        System.out.println("My Final Int: "+myInt);

        // Not possible
//        myInt = 25;

    }

}
