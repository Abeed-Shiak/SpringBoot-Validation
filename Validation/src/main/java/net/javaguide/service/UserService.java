package net.javaguide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.entity.User;
import net.javaguide.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public User Saveuser(User user) {
		return userRepository.save(user);
		
	}
	public List<User>getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(long id) {
		return userRepository.findById(id).orElseThrow();
	}
}
