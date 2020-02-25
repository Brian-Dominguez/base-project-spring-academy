package com.puntosingular.base.services;

import java.util.List;

import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.User;

public interface UserService {

	public List<UserDTO> getUsers();
	
	public UserDTO getUserByName(String name);
	
	public UserDTO findByName(String name);
	
	public void setUser(User user);
}
