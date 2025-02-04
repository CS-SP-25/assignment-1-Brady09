public class SalesTaxCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <sale_amount>");
            return;
        }

        String stateName = args[0];
        double saleAmount;

        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Sale amount must be a valid number.");
            return;
        }

        State state;
        switch (stateName) {
            case "Indiana":
                state = new Indiana();
                break;
            case "Alaska":
                state = new Alaska();
                break;
            case "Hawaii":
                state = new Hawaii();
                break;
            default:
                System.out.println("Error: Unsupported state. Use 'Indiana' or 'Alaska'.");
                return;
        }

        // Display the sales tax
        state.showTax(saleAmount);
    }
}


