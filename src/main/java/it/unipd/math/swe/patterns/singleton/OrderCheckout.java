package it.unipd.math.swe.patterns.singleton;

public class OrderCheckout {

    private final PaypalRepository paypalRepository;

    public OrderCheckout(PaypalRepository paypalRepository) {
        this.paypalRepository = paypalRepository;
    }

    public void checkout() {
        // Fa cose...
        paypalRepository.pay(
                "username",
                "password",
                100.0);
        // Fa cose...
    }
}
