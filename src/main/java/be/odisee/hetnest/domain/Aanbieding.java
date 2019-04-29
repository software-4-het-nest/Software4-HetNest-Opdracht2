package be.odisee.hetnest.domain;

import javax.persistence.*;


@Entity
@Table(name = "aanbiedingen")
public class Aanbieding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int hoeveelhijd;

    @Column
    private double prijs;

    @Column
    private String type;

    @Column
    private String naam;

    public Aanbieding(){}

    public Aanbieding(int _hoeveelheid, double _prijs, String _type, String _naam)
    {
        this.hoeveelhijd = _hoeveelheid;
        this.prijs = _prijs;
        this.type = _type;
        this.naam = _naam;
    }

    public int getId()
    {
        return this.id;
    }

    public int getHoeveelheid()
    {
        return this.hoeveelhijd;
    }

    public double getPrijs()
    {
        return this.prijs;
    }

    public String getType()
    {
        return this.type;
    }

    public String getNaam()
    {
        return this.naam;
    }

    public void setHoeveelheid(int _hoeveelheid)
    {
        this.hoeveelhijd = _hoeveelheid;
    }

    public void setPrijs(double _prijs)
    {
        this.prijs = _prijs;
    }

    public void setType(String _type)
    {
        this.type = _type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }



}
