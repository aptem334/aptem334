package com.demo.aptem334.repo;

import org.springframework.data.repository.CrudRepository;
import com.demo.aptem334.model.Users;

import java.util.List;

public interface UserRepository extends CrudRepository<Users, Integer> {
    List<Users> findByEmailOrName(String email, String name);
}