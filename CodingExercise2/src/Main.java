public class Main {

    public static void main(String[] args) {
        CarPriceEstimator carPriceEstimator = new CarPriceEstimator();
        double salesPrice = carPriceEstimator.
                getSalePrice("ford ecosport",
                        2021, 60000.0,
                        2, true, false,
                        true, false,
                        false, true);
    }

}
