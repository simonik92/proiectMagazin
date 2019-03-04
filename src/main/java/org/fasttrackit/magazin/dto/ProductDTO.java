package org.fasttrackit.magazin.dto;

public class ProductDTO {
    private long id;

    private String name;
    private String pret;
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
}
