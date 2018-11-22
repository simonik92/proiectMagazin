package org.fasttrackit.magazin.domain;

import java.util.Date;

public class Product {


    private String name;
    private int pret;
    private Date dataExpirarii;
    private String producator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public Date getDataExpirarii() {
        return dataExpirarii;
    }

    public void setDataExpirarii(Date dataExpirarii) {
        this.dataExpirarii = dataExpirarii;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

}
