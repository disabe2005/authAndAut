package com.disabe.authAndAut.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.disabe.authAndAut.controllers.interfacesApi.UsersApi;
import com.disabe.authAndAut.entities.SatooUsers;
import com.disabe.authAndAut.exceptions.UserNotFoundException;
import com.disabe.authAndAut.repositories.SatooUsersRepository;

@RestController
public class UsersController implements UsersApi{
	
	@Autowired
	SatooUsersRepository userRepository;

	@Override
	public SatooUsers findById(long id) {
		 return userRepository.findById(id)
		            .orElseThrow(() -> new UserNotFoundException(id, "Utilisateur n'a pas été trouvé"));		
	}

	@Override
	public Collection<SatooUsers> findUsers() throws Exception {
		return userRepository.findAll();
	}

	@Override
	public SatooUsers updateUser(Long id, SatooUsers user) throws Exception {	
	        return userRepository.save(user);
	}
	
	
	

}
