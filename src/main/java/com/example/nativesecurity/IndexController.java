package com.example.nativesecurity;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@GetMapping(value = "/api/status", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getStatus() {
		return "STATUS OK";
	}
}
