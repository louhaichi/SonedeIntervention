package tn.sonede.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sonede.spring.entity.User;
import tn.sonede.spring.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceIMPL implements UserService {

	@Autowired
	UserRepository UserRepo;

	@Override
	public User saveUser(User u) {

		return UserRepo.save(u);
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		return UserRepo.save(u);
	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		UserRepo.delete(u);
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		UserRepo.deleteById(id);
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return UserRepo.findById(id).orElseThrow(null);
	}
	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return UserRepo.findByUsername(username).orElseThrow(null);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return UserRepo.findAll();
	}
	
	
@Override
public void SetImageUser(Long id,String img) {
	
	User u = UserRepo.findById(id).orElseThrow(null);
	u.setImage(img);
	
	
}
}
