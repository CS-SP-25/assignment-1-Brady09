public class FourPointFiveSalesTax implements SalesTaxBehavior{
    @Override
    public double compute(double value) {
        return value * 0.045; // 4.5% tax applies
    }

}