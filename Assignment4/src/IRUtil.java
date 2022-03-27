public class IRUtil {


    public static void getFrequencyCount(String term, String doc){

        term = term.toLowerCase();
        doc = doc.toLowerCase();

        int frequencyCount = 0;
        int index = doc.indexOf(term);
        while (index >= 0) { // step 4
            frequencyCount++; // step 5
            doc = doc.substring(index + term.length()); // step 6
            System.out.println(doc);
            index = doc.indexOf(term); // step 7
        }



    }

    public static double termFrequency(String term, String doc){

        int frequencyCount = 0;//getFrequencyCount(term, doc);

        String[] totalTermInDoc = doc.split(" ");
        double totalTermCount = totalTermInDoc.length;

        return (double) frequencyCount/totalTermCount;
    }


}
