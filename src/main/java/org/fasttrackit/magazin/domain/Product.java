package org.fasttrackit.magazin.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "product_generator")
    @SequenceGenerator(
            name = "product_generator",
            sequenceName = "product_sequence",
            initialValue = 1
    )
    private long id;

    private String name;
    private String pret;
    private int stock;
    private String ulrImage;

    public String getUlrImage() {
        return ulrImage;
    }

    public void setUlrImage(String ulrImage) {
        this.ulrImage = ulrImage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", pret='").append(pret).append('\'');
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }
}
