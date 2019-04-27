package be.odisee.hetnest.Service;

import be.odisee.hetnest.dao.*;
import be.odisee.hetnest.domain.*;
import be.odisee.hetnest.Service.IPersistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("persisteaceService")
@Transactional
public class PersistanceService implements IPersistanceService {
    @Autowired
    private AanbiedingRepository aanbiedingRepository = null;

    public PersistanceService(){}

    @Override
    public Aanbieding addAanbieding(int _hoeveelheid, double _prijs, String _type, String _naam){
        return this.aanbiedingRepository.save(new Aanbieding(_hoeveelheid, _prijs, _type, _naam));
    }

    @Override
    public Aanbieding getAanbiedingById(int id){
        return this.aanbiedingRepository.findOne(id);
    }

    @Override
    public Aanbieding getAanbiedingByName(String naam){
        return this.aanbiedingRepository.findByNaam(naam);
    }

    @Override
    public List<Aanbieding> getAlleAanbiedingen(){
        return this.aanbiedingRepository.findAll();
    }

    @Override
    public void updateAanbieding(Aanbieding aanbieding){
        this.aanbiedingRepository.save(aanbieding);
    }

    @Override
    public void deleteAanbieding(Aanbieding aanbieding){
        this.aanbiedingRepository.delete(aanbieding);
    }

    @Override
    public void deleteAanbiedingById(int id){
        this.aanbiedingRepository.deleteById(id);
    }
}
