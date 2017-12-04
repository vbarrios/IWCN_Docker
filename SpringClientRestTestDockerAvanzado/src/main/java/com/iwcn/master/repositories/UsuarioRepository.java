package com.iwcn.master.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iwcn.master.entities.User;

public interface UsuarioRepository extends CrudRepository<User, Integer> {
	
	User findById (int id);
	
	User findByUser (String nombre);

}
