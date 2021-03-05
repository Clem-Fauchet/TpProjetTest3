package com.tactfactory.monprojetsb3.monprojetsb3.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tactfactory.monprojetsb3.monprojetsb3.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByLastName(String lastName);

	List<User> findByFirstName(String firstName);

	UserRepository findById(long id);

}
