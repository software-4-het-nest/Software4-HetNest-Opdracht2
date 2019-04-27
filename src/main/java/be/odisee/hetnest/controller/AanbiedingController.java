package be.odisee.hetnest.controller;

import be.odisee.hetnest.Service.HetNestService;
import be.odisee.hetnest.Service.IHetNestService;
import be.odisee.hetnest.Service.IPersistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import be.odisee.hetnest.domain.Aanbieding;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class AanbiedingController {

    @Autowired
    protected IPersistanceService persistanceService = null;


    @RequestMapping(value = {"/aanbiedingen.html"}, method = RequestMethod.GET)
    public String index(ModelMap model) {
        List<Aanbieding> aanbiedingen = persistanceService.getAlleAanbiedingen();
        model.addAttribute("aanbiedingen", aanbiedingen);
        return "/aanbiedingen";
    }

    @RequestMapping(value = {"/aanbieding.html"}, method = RequestMethod.GET)
    public String aanbiedingDetail(@RequestParam("id") Integer id, ModelMap model) {
        Aanbieding aanbieding = persistanceService.getAanbiedingById(id);
        model.addAttribute("aanbieding", aanbieding);
        return "/aanbieding";
    }

    @RequestMapping(value = {"/nieuweAanbieding.html"}, method = RequestMethod.GET)
    public String aanbiedingFormulier(ModelMap model) {
        Aanbieding aanbieding = new Aanbieding();
        model.addAttribute("aanbieding", aanbieding);
        return "/nieuweAanbieding";
    }

    @RequestMapping(value = {"/nieuweAanbieding.html"}, method = RequestMethod.POST)
    public String aanbiedingToevoegen(@ModelAttribute("aanbieding") Aanbieding aanbieding, ModelMap model) {
        Aanbieding toegevoegdAanbieding = persistanceService.addAanbieding(aanbieding.getHoeveelhijd(), aanbieding.getPrijs(), aanbieding.getType(), aanbieding.getNaam());
        toegevoegdAanbieding.setHoeveelhijd(aanbieding.getHoeveelhijd());
        toegevoegdAanbieding.setPrijs(aanbieding.getPrijs());
        toegevoegdAanbieding.setType(aanbieding.getType());
        toegevoegdAanbieding.setNaam(aanbieding.getNaam());
        persistanceService.updateAanbieding(toegevoegdAanbieding);
        return "redirect:aanbieding.html?id=" + toegevoegdAanbieding.getId();
    }

    @RequestMapping(value = {"/updateAanbieding.html"}, method = RequestMethod.GET)
    public String aanbiedingUpdateformulier(@RequestParam("id") Integer id, ModelMap model) {
        model.addAttribute("aanbieding", persistanceService.getAanbiedingById(id));
        return "/nieuweAanbieding";
    }

    @RequestMapping(value = {"/updateAanbieding.html"}, method = RequestMethod.POST)
    public String aanbiedingUpdaten(@ModelAttribute("aanbieding") Aanbieding updateAanbieding, ModelMap model) {
        Aanbieding aanbieding = new Aanbieding();
        aanbieding.setId(updateAanbieding.getId());
        aanbieding.setHoeveelhijd(updateAanbieding.getHoeveelhijd());
        aanbieding.setPrijs(updateAanbieding.getPrijs());
        aanbieding.setType(updateAanbieding.getType());
        aanbieding.setNaam(updateAanbieding.getNaam());
        persistanceService.updateAanbieding(aanbieding);
        return "redirect:aanbieding.html?id=" + aanbieding.getId();
    }

    @RequestMapping(value = {"/aanbiedingVerwijder.html"}, method = RequestMethod.GET)
    public String aanbiedingVerwijderen(@RequestParam("id") Integer id, ModelMap model) {
        try {
            persistanceService.deleteAanbiedingById(id);
            System.out.println("LOG: aanbieding is verwijdert");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());

        }
        return "redirect:aanbiedingen.html";
    }
}
