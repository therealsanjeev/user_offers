package github.com.simpl.user_offers.repository;

import github.com.simpl.user_offers.entity.Offer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OfferRepoTest  {

    @Autowired
    private OfferRepo offerRepo;

    @Test
    public void saveOffer(){
        Offer offer=Offer.builder()
                .title("zomato")
                .description("50% off on zomato")
                .build();
        offerRepo.save(offer);
    }

    @Test
    public void printAllOffers(){
        List<Offer> list=offerRepo.findAll();
        System.out.println("All Offers :"+list);
    }
}