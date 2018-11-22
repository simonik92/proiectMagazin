package org.fasttrackit.magazin.persistence;

import org.fasttrackit.magazin.domain.Magazin;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MagazinRepository extends PagingAndSortingRepository<Magazin, Long>
{
}
