package github.com.simpl.user_offers.services;


import github.com.simpl.user_offers.entity.Offer;
import github.com.simpl.user_offers.repository.OfferRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {
    @Autowired
    private OfferRepo offerRepo;
    public OfferServiceImpl( OfferRepo offerRepo) {
        this.offerRepo=offerRepo;
    }
    @Override
    public List<Offer> getAllOffers() {
         return offerRepo.findAll();
    }

    @Override
    public Offer getOffer(long offerID) {
        List<Offer> allOffers=offerRepo.findAll();
        for (Offer allOffer : allOffers) {
            if (offerID == allOffer.getId()) {
                return allOffer;
            }
        }
        return null;
    }

    @Override
    public List<Offer> addOffer(Offer offer) {
        offerRepo.save(offer);
        return offerRepo.findAll();
    }
}
