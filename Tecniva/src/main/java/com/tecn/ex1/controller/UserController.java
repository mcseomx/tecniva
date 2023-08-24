package com.tecn.ex1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tecn.ex1.model.User;
import com.tecn.ex1.service.UserService;


@RestController  
public class UserController   
{  
 
@Autowired  
UserService userService;  

@GetMapping("/getUsers")  
private List<User> getAllUsers()   
{  
return userService.getAllUsers();  
}  

@GetMapping("/getUser/{userid}")  
private Optional<User> getUsers(@PathVariable("userid") int userid)   
{  
return userService.getUserById(userid);  
}  
  
@DeleteMapping("/delUser/{userid}")  
private void deleteUser(@PathVariable("userid") int userid)   
{  
userService.deleteUser(userid);  
}  
 
@PostMapping("/postUser")  
private String saveOrUpdate(@RequestBody User user)   
{  
userService.insertOrUpdateUser(user);  
return user.toString();  
}  

@PostMapping("/postUsers")  
private String saveOrUpdateList(@RequestBody List<User> users)   
{  
userService.insertOrUpdateUserList(users);  
return users.toString();  
}  

}  