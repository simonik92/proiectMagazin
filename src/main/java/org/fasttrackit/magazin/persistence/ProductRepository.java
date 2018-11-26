package org.fasttrackit.magazin.persistence;

import org.fasttrackit.magazin.domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long>
{
}
