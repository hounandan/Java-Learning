public class Main {


    public static void main(String[] args) {

        CurrencyConverter cc = new CurrencyConverter();

        double[] rates = {63.0d, 3.0d, 3.0d, 595.5d, 18.0d, 107.0d, 2.0d};
        cc.setExchangeRates(rates);
        System.out.println("As of Jan 1");
        cc.printCurrencies();

        rates = new double[]{65.0d, 5.0d, 3.0d, 595.5d, 18.0d, 107.0d, 2.0d};
        cc.setExchangeRates(rates);
        System.out.println("\nUpdated Exchange rates");
        cc.printCurrencies();

        cc.updateExchangeRates(0, 66.0d);
        System.out.println("\nChanging rupees");
        cc.printCurrencies();

        double amount = cc.computeTransferAmount(0, 1000d);
        System.out.println("\nTransferred Amount: "+amount);

    }

}
