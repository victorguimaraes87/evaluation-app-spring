package app.victor.evaluation.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value = "/{id}")
	public Optional<Users> getById(@PathVariable Long id) {
		return userService.getById(id);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Users> update(@PathVariable Long id,@RequestBody Users obj) {
		obj = userService.update(id, obj);
		return ResponseEntity.ok().body(obj);		
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Users> delete(@PathVariable Long id) {
		userService.delete(id);
		return ResponseEntity.noContent().build(); 
	}
	
	@PostMapping
	public Users insert(@RequestBody Users obj) {
		return userService.insert(obj);
	}
	

}
