package org.fasttrackit.magazin.domain;

import java.util.List;

//@Entity
public class Cart {

    // @OneToOne
    private User user;

    //@OneToMany
    private List<OrderedProduct> productsOrdered;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderedProduct> getProductsOrdered() {
        return productsOrdered;
    }

    public void setProductsOrdered(List<OrderedProduct> productsOrdered) {
        this.productsOrdered = productsOrdered;
    }
}

