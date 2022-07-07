package github.com.simpl.user_offers.controller;


import github.com.simpl.user_offers.entity.Offer;
import github.com.simpl.user_offers.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {


    @Autowired
    private OfferService service;

    @GetMapping("/home")
    public String home(){
        return "Simpl User Offer!";
    }

    @GetMapping("/offers")
    public List<Offer> getAllOffers(){
        return this.service.getAllOffers();
    }

    @GetMapping("/offers/{offerID}")
    public Offer getCourse(@PathVariable String offerID){
        return this.service.getOffer(Long.parseLong(offerID));
    }

    @PostMapping("/offers")
    public List<Offer> addOffer(@RequestBody Offer offer){
        return this.service.addOffer(offer);
    }


}
