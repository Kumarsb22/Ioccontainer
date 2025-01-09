
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.constants.AppConstants;
import com.example.demo.properties.AppProperties;


@org.springframework.web.bind.annotation.RestController
public class RestController {

//	@Value("${welcomeMsg}")
//	private String welMsg;

	@Autowired
	private AppProperties appProperties;

	@GetMapping("/welcome")
	public String welcomeMsg() {

		return appProperties.getMessages().get(AppConstants.STR_WELCOME_MSG);

	}

	@GetMapping("/greet")
	public String greetMsg() {
		return appProperties.getMessages().get(AppConstants.STR_GREET_MSG);
	}
}
