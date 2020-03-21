package it.unipd.math.swe.patterns.mv.mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 * The Command Line Interface allows the user to withdraw and to deposit an amount using a terminal. It represents
 * the View component inside the MVC pattern. It implements the <em>presentation logic</em>.
 */
public class CLI extends Subject implements Observer {

    private final BankAccount bankAccount;

    private String currentOperation;
    private String currentQuantity;

    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public CLI(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void askForNextOperation() {
        System.out.println("Select an operation: deposit or withdraw");
    }

    public void readNextOperation() {
        try {
            currentOperation = br.readLine();
            switch (currentOperation) {
                case "W":
                case "D":
                    currentQuantity = br.readLine();
                    break;
                default:
                    if (!Objects.equals("E", currentOperation)) {
                        showOperationNotAllowedError();
                    }
            }
            notifyObservers();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showOperationNotAllowedError() {
        System.out.println(String.format("The operation '%s' is not allowed.", currentOperation));
    }

    @Override
    public void update() {
        showAccountInformation();
    }

    public void showAccountInformation() {
        System.out.println("The current available amount is " + bankAccount.getAmount());
    }

    public String getCurrentOperation() {
        return currentOperation;
    }

    public String getCurrentQuantity() {
        return currentQuantity;
    }
}
