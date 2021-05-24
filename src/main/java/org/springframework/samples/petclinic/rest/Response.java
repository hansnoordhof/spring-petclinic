package org.springframework.samples.petclinic.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;

public class Response {

	private Response() {
	}

	public static <T> ResponseEntity<T> ok(T body) {
		return statusWithBody(HttpStatus.OK, body);
	}

	public static <T> ResponseEntity<T> created(T body) {
		return statusWithBody(HttpStatus.CREATED, body);
	}

	public static <T> ResponseEntity<T> status(HttpStatus status) {
		return statusWithBody(status, null);
	}

	public static <T> ResponseEntity<T> statusWithBody(HttpStatus status, T body) {
		return ((BodyBuilder) ((BodyBuilder) ResponseEntity.status(status).header("Cache-Control",
				new String[] { "no-cache, no-store, must-revalidate, max-age=0" })).header("Pragma",
						new String[] { "no-cache" })).body(body);
	}

}
