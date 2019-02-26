package org.fasttrackit.magazin.service;

import org.fasttrackit.magazin.domain.Product;
import org.fasttrackit.magazin.domain.Magazin;
import org.fasttrackit.magazin.dto.ProductDTO;
import org.fasttrackit.magazin.dto.MagazinDTO;
import org.fasttrackit.magazin.persistence.MagazinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service

public class MagazinService {

    @Autowired
    private MagazinRepository magazinRepository;

    @Transactional
    public void saveMagazin(Magazin magazin) {
        if (magazin.getNume() == null) {
            throw new IllegalArgumentException("Nume can not be null");
        }
        if (magazin.getAdresa() == null) {
            throw new IllegalArgumentException("Adresa can not be null");
        }
        try {
            //open transaction
            magazinRepository.save(magazin);
//            close
        } catch (Exception e) {
            System.out.println("Error when saving magazin " + e);
        }
    }

    @Transactional
    public List<MagazinDTO> getMagazin() {
        Iterator<Magazin> iterator =
                magazinRepository.findAll().iterator();


        List<MagazinDTO> list = new ArrayList<>();

        while (iterator.hasNext()) {
            Magazin magazin = iterator.next();

            MagazinDTO magazinDTO = new MagazinDTO();
            magazinDTO.setNume(magazin.getNume());
            magazinDTO.setAdresa(magazin.getAdresa());
            magazinDTO.setId(magazin.getId());


            List<Product> products = magazin.getProducts();
            int nrOfProd = 0;
            while (nrOfProd < 5 && products.size() >= 5) {

                Product product = products.get(nrOfProd);
                ProductDTO productDTO = new ProductDTO();

                productDTO.setId(product.getId());
                productDTO.setName(product.getName());
                productDTO.setPret(product.getPret());

                magazinDTO.getFirstelements().add(productDTO);
                nrOfProd++;
            }

            list.add(magazinDTO);
        }

        return list;


    }
}
