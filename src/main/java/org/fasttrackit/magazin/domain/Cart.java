package org.fasttrackit.magazin.domain;

import javax.persistence.*;
import java.util.List;

 @Entity
public class Cart {

     @Id
     @GeneratedValue
     private long id;

    @OneToOne
    private User user;

    @OneToMany
    @JoinColumn(name="cartId")
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

