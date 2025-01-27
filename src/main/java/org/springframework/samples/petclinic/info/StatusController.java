package org.springframework.samples.petclinic.info;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.samples.petclinic.rest.Response;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class StatusController {

	@RequestMapping(value = "/status/check", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
	public ResponseEntity checkStatus() {
		return Response.statusWithBody(HttpStatus.OK, "Status is up!");
	}

}
