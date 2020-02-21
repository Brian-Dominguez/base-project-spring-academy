package com.puntosingular.base.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntosingular.base.models.User;
import com.puntosingular.base.repository.UserRepository;
import com.puntosingular.base.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

}
