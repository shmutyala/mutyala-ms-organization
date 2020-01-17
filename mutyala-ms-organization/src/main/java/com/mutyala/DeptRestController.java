package com.mutyala;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptRestController {
	
	
	@GetMapping("/getDeptList")
	public ResponseEntity<List<String>> getDeptList() {
		List<String> asList = Arrays.asList("Software", "Finance", "Marketing");
		return new ResponseEntity<>(asList, HttpStatus.OK);
	}

}
