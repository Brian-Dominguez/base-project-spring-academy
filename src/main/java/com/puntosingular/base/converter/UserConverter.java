package com.puntosingular.base.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.User;

@Component("UserConverter")
public class UserConverter {

	public UserDTO UsertoUserDTO(User user) {

		if (user != null) {

			UserDTO userDTO = new UserDTO();

			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setLastname(user.getLastname());
			userDTO.setCreateDate(user.getCreateDate());
			userDTO.setStatus(user.getStatus());
			userDTO.setRoles(user.getRoles());
			return userDTO;
		}
		
		return null;
	}

	public User UserDTOtoUser(UserDTO userDTO) {

		User user = new User();

		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setLastname(userDTO.getLastname());
		user.setCreateDate(userDTO.getCreateDate());
		user.setStatus(userDTO.getStatus());
		user.setRoles(userDTO.getRoles());
		return user;
	}

	public List<UserDTO> UserstoUsersDTO(Iterable<User> users) {

		List<UserDTO> usersDTO = new ArrayList<UserDTO>();
		for (User user : users) {

			UserDTO userDTO = new UserDTO();

			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setLastname(user.getLastname());
			userDTO.setCreateDate(user.getCreateDate());
			userDTO.setStatus(user.getStatus());
			userDTO.setRoles(user.getRoles());
			usersDTO.add(userDTO);
		}
		return usersDTO;
	}

}
