package com.tecn.ex1.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecn.ex1.model.User;

public interface userRepo extends JpaRepository<User,Long>{
	


}
