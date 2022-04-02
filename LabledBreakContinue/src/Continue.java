public class Continue {

    /*
     * In scenario where you want to *SKIP* the loop (for / while) for a particular condition,
     * we can use continue statement -  within a if-else statement
     * Such that, when our desired condition is meet, the loop gets skipped and the program flow goes to
     * the next iteration of the loop
     */


    public static void printContinue(){

        for(int i = 0; i<10; i++){

            if(5 == i){
                System.out.println("Reached 5 - Skipping the Iteration");
                continue;
            }
            System.out.println("i = "+i);
        }

    }

    public static void printLabeledContinue(){

        first : for(int i=0; i<3; i++){
            second: for(int j=0; j<3; j++){
                if(1==i && 2==j){
                    System.out.println("Skipping iteration @ i = "+i+" ; j = "+j);
                    continue second;
                }else if(2 == i && 1==j){
                    System.out.println("Skipping iteration @ i = "+i+" ; j = "+j);
                    continue first;
                }
                System.out.println("i = "+i+"; j = "+j);
            }
        }
    }


    /*
    * Continue is not used for switch statements !!!
     */

}
