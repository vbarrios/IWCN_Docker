package com.iwcn.master.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import com.iwcn.master.entities.User;
import com.iwcn.master.repositories.UsuarioRepository;

public class UserDatabase {
	
	@Autowired
	private UsuarioRepository userRepository;
	
//	@PostConstruct
//	private void initDatabase() {
//		GrantedAuthority[] usuarioRoles = { new SimpleGrantedAuthority("ROLE_USER")};
//		userRepository.save(new User("user", "user", Arrays.asList(usuarioRoles)));
//		
//		GrantedAuthority[] administradorRoles = { new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority("ROLE_ADMIN")};
//		userRepository.save(new User("admin", "admin", Arrays.asList(administradorRoles)));
//
//	}
	
}