public class Break {


    /*
    * In scenario where you want to exit the loop (for / while) for a particular condition,
    * we can use break statement -  within a if-else statement
    * Such that, when our desired condition is meet, the loop breaks and the program flow comes
    * out of the loop block
     */

    public static void printBreakEg(){

        for(int i = 0; i<10; i++){

            if(5 == i){
                System.out.println("Reached 5 - Exiting for loop");
                break;
            }
            System.out.println("i = "+i);
        }

    }

    public static void printLabeledBreak(){

        first : for(int i=0; i<3; i++){
            second: for(int j=0; j<3; j++){
                if(1==i && 2==j){
                    System.out.println("Break @ i = "+i+" ; j = "+j);
                    break second;
                }else if(2 == i && 1==j){
                    System.out.println("Break @ i = "+i+" ; j = "+j);
                    break first;
                }
                    System.out.println("i = "+i+"; j = "+j);
            }
        }
    }

    public static void printSwitchBreak(){

        int i = 3;
        first: switch (i){

            case 1:
                System.out.println("Got 1");
                break first;

            case 2:
                System.out.println("Got 2");
                break first;

            case 3:
                System.out.println("Got 3");
                break first;

            case 4:
                System.out.println("Got 4");
                break first;

            case 5:
                System.out.println("Got 5");
                break first;

        }

    }


}
