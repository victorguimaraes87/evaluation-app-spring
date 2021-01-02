package app.victor.evaluation.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.victor.evaluation.entity.Users;
import app.victor.evaluation.services.UsersService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserResource {
	
	@Autowired
	UsersService userService; 
	
	@GetMapping(value = "/")
	public List<Users> getUser() {
		return userService.findAll();
	}

}
