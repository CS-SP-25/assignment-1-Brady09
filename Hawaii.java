public class Hawaii extends State {
    public Hawaii() {
        this.taxBehavior = new FourPointFiveSalesTax(); // Use 4.5%tax strategy
        this.setName("Hawaii");
    }

    @Override
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, getName(), tax);
    }
}

