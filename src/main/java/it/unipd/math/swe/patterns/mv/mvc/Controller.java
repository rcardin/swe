package it.unipd.math.swe.patterns.mv.mvc;

/**
 * The Controller has the responsibility to map the information that comes from the presentation component to the
 * business component. It implements the <em>application logic</em>.
 */
public class Controller implements Observer {

    private final CLI cli;
    private final BankAccount bankAccount;

    public Controller(CLI cli, BankAccount bankAccount) {
        this.cli = cli;
        this.bankAccount = bankAccount;
    }

    @Override
    public void update() {
        final String operation = cli.getCurrentOperation();
        switch (operation) {
            case "W":
                final String valueToWithdraw = cli.getCurrentQuantity();
                bankAccount.withdraw(mapToDouble(valueToWithdraw));
                break;
            case "D":
                final String valueToDeposit = cli.getCurrentQuantity();
                bankAccount.deposit(mapToDouble(valueToDeposit));
                break;
            case "E":
                System.exit(0);
                break;
            default:
        }
    }

    /**
     * Verifies if the information coming from the presentation component is valid and it performs the proper
     * transformation.
     * @param quantity The quantity inserted by the user
     * @return A double amount
     */
    private double mapToDouble(String quantity) {
        return Double.parseDouble(quantity);
    }
}
