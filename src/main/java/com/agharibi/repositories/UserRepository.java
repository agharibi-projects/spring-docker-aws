package com.agharibi.repositories;


import com.agharibi.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    User findByusername(String userName);
}
