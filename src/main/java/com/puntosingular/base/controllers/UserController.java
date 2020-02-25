package com.puntosingular.base.controllers;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final static Logger LOG = Logger.getLogger("com.puntosingular.base.controllers.UserController");

	@Autowired
	UserService userService;

	@GetMapping("getUsers")
	public ResponseEntity<?> getUsers() {
		Map<String, Object> response = new HashMap<>();

		if (userService.getUsers().isEmpty()) {
			response.put("data", "No hay usuarios registrados");
		} else {
			response.put("data", userService.getUsers());
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);

		// return userService.getUsers();
	}

	@GetMapping("getUserByName/{name}")
	public ResponseEntity<?> getUserByName(@PathVariable String name) {
		Map<String, Object> response = new HashMap<>();

		UserDTO userDto = userService.getUserByName(name);

		if (userDto == null) {
			response.put("data", "Usuario No Existente");
		} else {
			response.put("data", userDto);
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);

		// return userService.getUsers();
	}

	@GetMapping("findByName/{name}")
	public ResponseEntity<?> findByName(@PathVariable String name) {
		Map<String, Object> response = new HashMap<>();

		UserDTO userDto = userService.findByName(name);

		if (userDto == null) {
			response.put("data", "Usuario No Existente");
		} else {
			response.put("data", userDto);
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);

		// return userService.getUsers();
	}
}
