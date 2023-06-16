package pl.javastart.task.app;

import pl.javastart.task.logic.*;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to nie powinno być możliwe
//        salesRepresentative.config.minRequiredEarnings = 0;

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);

        // to również nie powinno być możliwe
//        offer.valid = true;
//        offer.percentage = -0.5;
//        offer.value = 2_000_000;

//        Offer offer1 = new Offer();
//
//        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);
//        offer.setPercentage(-5);
//        offer.setValid(true);

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}