package com.tecn.ex1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecn.ex1.model.User;
import com.tecn.ex1.persistance.userRepo;

@Service
public class UserService {

	@Autowired
	userRepo usRp;
	
	
	public User insertOrUpdateUser(User u) {
	
	return usRp.save(u);
	}
	public List<User> insertOrUpdateUserList(List<User> u) {
		
		return usRp.saveAll(u);
		}
	
	public List<User>  getAllUsers() {
		return usRp.findAll();
	}
	
	public Optional<User> getUserById(long id) {
		return usRp.findById(id);
	}
	
	public void deleteUser(long id) {
		usRp.deleteById(id);
	}
	
	
}
