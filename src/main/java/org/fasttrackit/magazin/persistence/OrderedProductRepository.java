package org.fasttrackit.magazin.persistence;

import org.fasttrackit.magazin.domain.OrderedProduct;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderedProductRepository extends PagingAndSortingRepository<OrderedProduct, Long>{
}

