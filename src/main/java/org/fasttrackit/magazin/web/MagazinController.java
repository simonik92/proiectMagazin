package org.fasttrackit.magazin.web;

import org.fasttrackit.magazin.domain.Magazin;
import org.fasttrackit.magazin.dto.MagazinDTO;
import org.fasttrackit.magazin.service.MagazinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MagazinController {

    @Autowired
    private MagazinService magazinService;

    @RequestMapping(path = "/magazin/{id}", method = RequestMethod.GET)
    public MagazinDTO getMagazin(@PathVariable("id") long id) {

        return magazinService.getMagazinById(id);
    }

    @RequestMapping(path = "/magazin", method = RequestMethod.POST)
    public void saveMagazin(@RequestBody MagazinDTO magazin) {

        magazinService.saveMagazin(magazin);

    }
    @RequestMapping(path = "/magazin/{id}", method = RequestMethod.PUT)
    public MagazinDTO updateMagazin(long id, MagazinDTO dto) {

       return magazinService.updateMagazin(id, dto);
    }

}
