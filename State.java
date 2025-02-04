public abstract class State {
    private String name;
    protected SalesTaxBehavior taxBehavior; // Strategy pattern

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method to enforce implementation in subclasses
    public abstract void showTax(double value);
}