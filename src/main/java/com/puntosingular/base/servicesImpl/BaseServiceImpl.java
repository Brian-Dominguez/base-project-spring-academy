package com.puntosingular.base.servicesImpl;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.puntosingular.base.services.BaseService;

@Service
public class BaseServiceImpl implements BaseService {

	private final static Logger LOG = Logger.getLogger("com.puntosingular.base.servicesImpl.BaseServiceImpl");

	@Override
	public ResponseEntity<?> getHolaMundo() {
		Map<String, Object> respuesta = new HashMap<>();

		// System.out.println("hola");
		LOG.info("Hola Mundo Desde Spring boot - getHolaMundo");
		respuesta.put("respuesta", "Hola Mundo Desde Spring Boot - getHolaMundo - 282Accepted");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}

}
