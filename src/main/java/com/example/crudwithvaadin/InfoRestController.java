package com.example.crudwithvaadin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoRestController {

	@GetMapping("/api/info")
	public AppInfo getInfo() {
		return new AppInfo("79822", "First Java CRUD REST", "1.0.0");
	}

	public record AppInfo(String studentId, String applicationName, String version) {
	}
}