package org.fasttrackit.magazin.service;

import org.fasttrackit.magazin.domain.Product;
import org.fasttrackit.magazin.persistence.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
@Autowired
    private ProductRepository productRepository;
    public void saveProduct(Product product)
    {
        if(product.getName()==null)
        {
            throw new IllegalArgumentException("Name can not be null");
        }

//        if(product.getDataExpirarii()==null) {
//            throw new IllegalArgumentException("Data expirarii can not be null");
//        }
        try
        {
            productRepository.save(product);
        }
        catch (Exception e)
        {
            System.out.println("Error when saving user" + e);
        }
    }
}

