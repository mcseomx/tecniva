package com.tecn.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecn.ex1.model.User;
import com.tecn.ex1.service.UserService;

import java.util.List;
import java.util.ArrayList;


@SpringBootTest
class Ex1ApplicationTests {
	@Autowired
	UserService us = new UserService();
	
	//private static Logger LOG = LoggerFactory.getLogger(Ex1Application.class);
	
	@Test
	void testInsertUpdate() {
		
		User user1 = new User((long) 1,"pedro","picapiedra","roca","email@pedro",LocalDate.parse("2015-02-20"));
		assertEquals(us.insertOrUpdateUser(user1), user1);
	}
	
void testInsertUpdateList() {
		
	User user1 = new User((long) 1,"pedro","picapiedra","roca","email@pedro",LocalDate.parse("2015-02-20"));
	User user2 = new User((long) 2,"pablo","marmol","roca","email@pablo",LocalDate.parse("1990-02-20"));
	User user3 = new User((long) 3,"pepe","pollo","roca","email@pepe",LocalDate.parse("1950-02-20"));
	User user4 = new User((long) 4,"popeye","espinaca","roca","email@popeye",LocalDate.parse("2000-02-20"));
	User user5 = new User((long) 5,"pepito","picapiedra","roca","email@pepito",LocalDate.parse("2020-02-20"));

	List<User> uli = new ArrayList<User>();
	uli.add(user1);
	uli.add(user2);
	uli.add(user3);
	uli.add(user4);
	uli.add(user5);
		assertEquals(us.insertOrUpdateUserList(uli), uli.toString());
	}

void testGetUser() {
	
	User user1 = new User((long) 1,"pedro","picapiedra","roca","email@pedro",LocalDate.parse("2015-02-20"));
	assertEquals(us.getUserById(1), user1);
}


void testDelete() {
	
	User user1 = new User((long) 11,"delete","picapiedra","roca","email@pedro",LocalDate.parse("2015-02-20"));
	us.insertOrUpdateUser(user1);
	us.deleteUser(11);
	assertEquals(us.getUserById(1), null);
}
	

}
