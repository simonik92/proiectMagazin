package org.fasttrackit.magazin.service;

import org.fasttrackit.magazin.domain.Magazin;
import org.fasttrackit.magazin.persistence.MagazinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MagazinService {
    @Autowired
    private MagazinRepository magazinRepository;
    public void saveMagazin (Magazin magazin)
    {
        if(magazin.getNume()==null)
        {
            throw new IllegalArgumentException("Nume can not be null");
        }
        if (magazin.getAdresa()==null)
        {
            throw new IllegalArgumentException("Adresa can not be null");
        }
        try
        {
            magazinRepository.save(magazin);
        }
        catch(Exception e)
        {
            System.out.println("Error when saving magazin " + e );
        }
    }
}
