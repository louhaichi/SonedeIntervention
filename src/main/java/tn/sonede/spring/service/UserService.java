package tn.sonede.spring.service;

import tn.sonede.spring.entity.User;

import java.util.List;

public interface UserService {
	User saveUser(User u);
	User updateUser(User u);
	void deleteUser(User u);
	 void deleteUserById(Long id);
	User getUserByUsername(String username);
	User getUser(Long id);
	void SetImageUser(Long id,String img);
	
	List<User> getAllUsers();
}
