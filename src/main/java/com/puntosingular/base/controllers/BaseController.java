package com.puntosingular.base.controllers;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puntosingular.base.services.BaseService;

@RestController
@RequestMapping("/base")
public class BaseController {
	
	private final static Logger LOG = Logger.getLogger("com.puntosingular.base.controllers.BaseController");
	
	//Services
	@Autowired
	BaseService baseService;
	
	@GetMapping("holaMundo")
	public ResponseEntity<?> holaMundo(){
		Map<String, Object> respuesta = new HashMap<>();
		
		//System.out.println("hola");
		//LOG.info("Hola Mundo Desde Spring boot");
		respuesta.put("respuesta", "Hola Mundo Desde Spring Boot - 282Accepted");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}

	@GetMapping("getHolaMundo")
	public ResponseEntity<?> getHolaMundo(){
		 return baseService.getHolaMundo();
	}
	
}
