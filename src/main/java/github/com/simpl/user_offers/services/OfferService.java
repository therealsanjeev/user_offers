package github.com.simpl.user_offers.services;


import github.com.simpl.user_offers.entity.Offer;

import java.util.List;

public interface OfferService {

    public List<Offer> getAllOffers();
    public Offer getOffer(long offerID);

    public List<Offer> addOffer(Offer offer);
}
