/**
 * 
 */
package com.project.spacehubsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gbemisola
 *
 */
@Controller
public class SpaceHubController {
	
	
	@GetMapping("/")
	public String showHome() {
		
		
		return "home";
	}

}
