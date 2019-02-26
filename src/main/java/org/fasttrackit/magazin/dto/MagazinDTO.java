package org.fasttrackit.magazin.dto;

import java.util.ArrayList;
import java.util.List;

public class MagazinDTO {

    private long id;
    private String nume;
    private String adresa;
    private String telefon;

    private List<ProductDTO> firstelements = new ArrayList<>();
    //
    // private List<Product> products = new ArrayList<>();


    public void setId(long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public List<ProductDTO> getFirstelements() {
        return firstelements;
    }

    public void setFirstelements(List<ProductDTO> firstelements) {
        this.firstelements = firstelements;
    }

    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shop{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", firstElement=").append(firstelements);
        sb.append('}');
        return sb.toString();
    }
}
