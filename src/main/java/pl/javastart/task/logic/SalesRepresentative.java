package pl.javastart.task.logic;

import pl.javastart.task.model.Offer;

public class SalesRepresentative {

    private Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.setPercentage(config.getPercentage());
            offer.setValid(true);
            offer.setValue(requestedAmount);
        }
        return offer;
    }

}
