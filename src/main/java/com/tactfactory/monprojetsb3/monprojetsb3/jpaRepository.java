package com.tactfactory.monprojetsb3.monprojetsb3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface jpaRepository extends CrudRepository<User, Long> {

	List<User> findByLastName(String lastName);

	List<User> findByFirstName(String firstName);

	jpaRepository findById(long id);
}
