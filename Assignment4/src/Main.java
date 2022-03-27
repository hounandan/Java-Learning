public class Main {

    public static void main(String[] args) {

        String term = "the";
        String doc = "You might wonder why a designer would choose to use lorem ipsum text instead " +
                "of a few paragraphs in English or their native language. Why not just copy and paste" +
                " a page from an old book or lyrics from a famous song? The main reason for using " +
                "lorem ipsum text is that it keeps people from focusing on the actual text. " +
                "When someone creates a template and asks for feedback on it, they don't want the " +
                "people reviewing it to get distracted by what the text says. Instead of focusing on " +
                "the layout of the text, people might read the words to, for example, look for typos";

        /*int frequencyCount = */IRUtil.getFrequencyCount(term, doc);
        double termFrequency = IRUtil.termFrequency(term,doc);

        //System.out.println("Frequency Count: "+frequencyCount);
        System.out.println("Term Frequency: "+termFrequency);


    }


}
