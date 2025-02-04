public class Indiana extends State {
    public Indiana() {
        this.taxBehavior = new SevenPercent(); // Use SevenPercent strategy
        this.setName("Indiana");
    }

    @Override
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, getName(), tax);
    }
}
