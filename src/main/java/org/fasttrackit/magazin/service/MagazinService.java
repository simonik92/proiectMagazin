package org.fasttrackit.magazin.service;

import org.fasttrackit.magazin.domain.Product;
import org.fasttrackit.magazin.domain.Magazin;
import org.fasttrackit.magazin.dto.ProductDTO;
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
    public void saveMagazin(org.fasttrackit.magazin.dto.MagazinDTO magazin) {
        if (magazin.getNume() == null) {
            throw new IllegalArgumentException("Nume can not be null");
        }
        if (magazin.getAdresa() == null) {
            throw new IllegalArgumentException("Adresa can not be null");
        }

       Magazin maga = convert(magazin);
        try {
            //open transaction
            magazinRepository.save(maga);
//            close
        } catch (Exception e) {
            System.out.println("Error when saving magazin " + e);
        }
    }

    @Transactional
    public List<org.fasttrackit.magazin.dto.MagazinDTO> getMagazin() {
        Iterator<Magazin> iterator =
                magazinRepository.findAll().iterator();


        List<org.fasttrackit.magazin.dto.MagazinDTO> list = new ArrayList<>();

        while (iterator.hasNext()) {
            Magazin magazin = iterator.next();

            org.fasttrackit.magazin.dto.MagazinDTO magazinDTO = new org.fasttrackit.magazin.dto.MagazinDTO();
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

                magazinDTO.getProducts().add(productDTO);
                nrOfProd++;
            }

            list.add(magazinDTO);
        }

        return list;


    }

    private org.fasttrackit.magazin.dto.MagazinDTO convertToDTO(Magazin magazin) {

        org.fasttrackit.magazin.dto.MagazinDTO magazinDTO = new org.fasttrackit.magazin.dto.MagazinDTO();
        magazinDTO.setNume(magazin.getNume());
        magazinDTO.setId(magazin.getId());
        return magazinDTO;
    }

    private Magazin convert(org.fasttrackit.magazin.dto.MagazinDTO magazinDTO) {

        Magazin magazin = new Magazin();
        magazin.setNume(magazinDTO.getNume());
        magazin.setAdresa(magazinDTO.getAdresa());
        return magazin;
    }

    public org.fasttrackit.magazin.dto.MagazinDTO getMagazinById(long id) {

        Magazin magazin = magazinRepository.findOne(id);
        if(magazin == null) {
            throw new IllegalArgumentException("The id is not valid.");
        }
        return convertToDTO(magazin);
    }

    public org.fasttrackit.magazin.dto.MagazinDTO updateMagazin(long id, org.fasttrackit.magazin.dto.MagazinDTO dto) {

       Magazin magazin = magazinRepository.findOne(id);
       magazin.setNume(dto.getNume());
       magazin.setAdresa(dto.getAdresa());

       Magazin savedObject = magazinRepository.save(magazin);

       return convertToDTO(savedObject);
    }
}
