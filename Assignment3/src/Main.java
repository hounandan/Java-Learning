public class Main {

    public static void main(String[] args) {

        MoneyTransferService transferService = new MoneyTransferService();

        double transferAmount = transferService.computeTransferAmount(0, 1000);
        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: "+transferAmount);
        System.out.println("Transfer Fee: "+transferFee);

    }

}
