package be.odisee.hetnest.Service;

import be.odisee.hetnest.domain.*;

import java.util.List;

public interface IPersistanceService {
    Aanbieding addAanbieding(int _hoeveelheid, double _prijs, String _type, String _naam);
    Aanbieding getAanbiedingById (int id);
    Aanbieding getAanbiedingByName (String naam);
    List<Aanbieding> getAlleAanbiedingen();
    void updateAanbieding(Aanbieding aanbieding);
    void deleteAanbieding (Aanbieding aanbieding);
    void deleteAanbiedingById (int id);
}

