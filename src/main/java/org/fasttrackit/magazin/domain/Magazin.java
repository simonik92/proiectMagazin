package org.fasttrackit.magazin.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "magazin")
public class Magazin {

    @Id
    @GeneratedValue(generator = "magazin_generator")
    @SequenceGenerator(
            name = "magazin_generator",
            sequenceName = "magazin_sequence",
            initialValue = 1000
    )
    private long id;
    private String nume;
    private String adresa;
    private String telefon;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="magazin_Id")
    private List<Product> products = new ArrayList<>();


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


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = Objects.requireNonNull(products);
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
        sb.append(", products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}