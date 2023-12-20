package it.unipd.math.swe.patterns.singleton;

public enum PaypalRepository {
    INSTANCE;

    private String connectionUri;

  public void pay(
          String username,
          String password,
          double amount) {
        System.out.println("Paying " + amount + " with paypal " + connectionUri);
    }
}
