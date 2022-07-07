package github.com.simpl.user_offers.repository;


import github.com.simpl.user_offers.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepo extends JpaRepository<Offer, Integer> {

}
