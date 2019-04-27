package be.odisee.hetnest.Service;

import be.odisee.hetnest.dao.AanbiedingRepository;
import be.odisee.hetnest.domain.Aanbieding;
import be.odisee.hetnest.Service.IHetNestService;
import be.odisee.hetnest.Service.IPersistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("hetnestService")
public class HetNestService implements IHetNestService{
    public HetNestService(){}

    private IPersistanceService persistanceService;

    @Autowired
    public void setPersistanceService(IPersistanceService persistanceService){
        this.persistanceService = persistanceService;
    }
}
