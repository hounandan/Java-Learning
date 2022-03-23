public class CurrencyConverter {

    double[] exchangeRates;

    void setExchangeRates(double[] rates){
        this.exchangeRates =rates;
    }

    void updateExchangeRates(int index, double newRate){
        this.exchangeRates[index] = newRate;
    }

    double getExchangeRate(int index){
        return this.exchangeRates[index];
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
