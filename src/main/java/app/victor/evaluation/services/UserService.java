package app.victor.evaluation.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import app.victor.evaluation.entity.User;
import app.victor.evaluation.repositories.UserRepository;

@Component
public class UserService {
	
	@Resource 
	UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}

}
