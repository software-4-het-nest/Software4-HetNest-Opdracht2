package be.odisee.hetnest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import be.odisee.hetnest.domain.Aanbieding;

public interface AanbiedingRepository extends JpaRepository<Aanbieding, Integer>{
    Aanbieding findByNaam(String naam);
    void deleteById(int id);
}
