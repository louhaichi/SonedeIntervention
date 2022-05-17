package tn.sonede.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.sonede.spring.entity.User;
import tn.sonede.spring.repository.UserRepository;
import tn.sonede.spring.service.UserService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserService Userservice;
	
	@Autowired
	private UserRepository userRepo;
	
	// get all users 
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return Userservice.getAllUsers();
		
		
	}
	
	// create user 
	@PostMapping("/users")
	public User createUser(@RequestBody User u) {
		return Userservice.saveUser(u);
	}
	
	@GetMapping("/users/{username}")
	public ResponseEntity<User> getUserById(@PathVariable String username) {
		User u =Userservice.getUserByUsername(username);
		return ResponseEntity.ok(u);
	}
	@GetMapping("/usersFA/{id}")
	public ResponseEntity<User> getUserByIdFromAnnonce(@PathVariable Long id) {
		User u =Userservice.getUser(id);

		return ResponseEntity.ok(u);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User u){
		User UX = Userservice.getUser(id);
		
		UX.setUsername(u.getUsername());
		UX.setEmail(u.getEmail());
		UX.setPassword(u.getPassword());
		
		
		User updateUser = Userservice.updateUser(UX);
		return ResponseEntity.ok(updateUser);
	}
	
	@RequestMapping(value ="/login/{username}",method = RequestMethod.GET)
	public Optional<User> getUserByUsernamePassword(@PathVariable("username") String
	username) {
	return userRepo.findByUsername(username);
	}
	
	@PutMapping("/users/SetImage/{id}")
	public ResponseEntity<User> SetUserImage(@PathVariable Long id,@RequestBody String img){
		User UX = Userservice.getUser(id);
		
	
		UX.setImage(img);
		User updateUser = Userservice.updateUser(UX);
		return ResponseEntity.ok(updateUser);
	}

	@GetMapping("/usersid/{userid}")
	public ResponseEntity<User> getUserByIdd(@PathVariable long userid) {
		User u =Userservice.getUser(userid);
		return ResponseEntity.ok(u);
	}

}
