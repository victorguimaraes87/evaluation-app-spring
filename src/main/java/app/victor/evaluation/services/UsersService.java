package app.victor.evaluation.services;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


import app.victor.evaluation.entity.Users;
import app.victor.evaluation.repositories.UsersRepository;

@Component
public class UsersService {
	
	@Resource 
	UsersRepository repository;
	
	public List<Users> findAll() {
		return repository.findAll();
	}
	
	public  Optional<Users> getById(Long id) {
		return repository.findById(id);
	}
	
	public Users update(Long id, Users obj) {
		Users entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	
	private void updateData(Users entity, Users obj) {
	
		entity.setName(obj.getName());
		entity.setLogin(obj.getLogin());
		entity.setPassword(obj.getPassword());
		
	}


}
