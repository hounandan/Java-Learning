public class CurrencyConverter {

    double[] exchangeRates = {63.0d, 3.0d, 3.0d, 595.5d, 18.0d, 107.0d, 2.0d};

    void setExchangeRates(double[] rates){
        this.exchangeRates =rates;
    }

    void updateExchangeRates(int country, double newRate){
        this.exchangeRates[country] = newRate;
    }

    double getExchangeRate(int country){
        return this.exchangeRates[country];
    }

    double computeTransferAmount(int country, double amount){
        return amount * getExchangeRate(country);
    }

    void printCurrencies(){
        System.out.println("rupee: "+exchangeRates[0]);
        System.out.println("dirham: "+exchangeRates[1]);
        System.out.println("real: "+exchangeRates[2]);
        System.out.println("chilean_peso: "+exchangeRates[3]);
        System.out.println("mexican_peso: "+exchangeRates[4]);
        System.out.println("_yen: "+exchangeRates[5]);
        System.out.println("$australian: "+exchangeRates[exchangeRates.length-1]);
    }




}
