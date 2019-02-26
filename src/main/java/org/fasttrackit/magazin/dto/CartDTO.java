package org.fasttrackit.magazin.dto;

import org.fasttrackit.magazin.domain.OrderedProduct;
import org.fasttrackit.magazin.domain.User;

import java.util.ArrayList;
import java.util.List;

public class CartDTO {

    private User user;
    private List<OrderedProduct> firstOrder = new ArrayList<>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderedProduct> getFirstOrder() {
        return firstOrder;
    }

    public void setFirstOrder(List<OrderedProduct> firstOrder) {
        this.firstOrder = firstOrder;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cart{");
        sb.append("user=").append(user);
        sb.append(", firstOrder=").append(firstOrder);
        sb.append('}');
        return sb.toString();
    }

}








