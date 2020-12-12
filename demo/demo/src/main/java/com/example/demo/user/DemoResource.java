package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

	@Autowired
	private DemoRepository demoRepository;

	@GetMapping("/getUsers")
	public List<DemoPojo> retrieveAllUsers() {
		return demoRepository.findAll();
	}
}
