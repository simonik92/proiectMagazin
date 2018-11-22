package org.fasttrackit.magazin.persistence;


import org.fasttrackit.magazin.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository
        extends
        PagingAndSortingRepository<User, Long>
{
}
