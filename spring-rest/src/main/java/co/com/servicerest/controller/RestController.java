package co.com.servicerest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.servicerest.business.RestBusiness;

@CrossOrigin("*")
@RequestMapping("/rest-manager")
public class RestController {

	@Autowired
	@Qualifier("restBusiness")
	private RestBusiness restBusiness;

	@PostMapping
	public ResponseEntity<?> sendRequest() {
		return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
	}

}
