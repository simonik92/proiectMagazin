package org.fasttrackit.magazin.persistence;

import org.fasttrackit.magazin.domain.Cart;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CartRepository extends PagingAndSortingRepository<Cart, Long>
{
}
