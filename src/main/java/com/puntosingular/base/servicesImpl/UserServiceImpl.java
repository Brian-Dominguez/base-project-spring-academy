package com.puntosingular.base.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.puntosingular.base.converter.UserConverter;
import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.User;
import com.puntosingular.base.repository.UserRepository;
import com.puntosingular.base.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("UserConverter")
	private UserConverter userConverter;
	
	@Override
	public List<UserDTO> getUsers() {
		
		return userConverter.UserstoUsersDTO(userRepository.findAll());
		//return (List<User>) userRepository.findAll();
	}

	@Override
	public UserDTO getUserByName(String name) {
		return userConverter.UsertoUserDTO(userRepository.getUserByName(name));
	}

	@Override
	public UserDTO findByName(String name) {
		return userConverter.UsertoUserDTO(userRepository.findByName(name));
	}

}
