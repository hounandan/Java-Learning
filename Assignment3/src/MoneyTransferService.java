public class MoneyTransferService {

    CurrencyConverter cc = new CurrencyConverter();

    double computeTransferAmount(int country, double amount){
        return cc.computeTransferAmount(country,amount);
    }

    double computeTransferFee(int country, double amount){
        return 0.02d * cc.computeTransferAmount(country,amount);
    }

}
