public class Main {

    public static void main(String[] args) {

        FinalInstance i = new FinalInstance();

        // Cannot perform these actions as those fields are final
//    i.name = "Hello";
//    i.id = 24;

        FinalStatic i3 = new FinalStatic();
        i3.printStaticFinal();
        // Not possible
//        i3.PI_VALUE = 3.14;





    }


}
