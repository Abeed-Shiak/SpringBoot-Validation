package net.javaguide.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import net.javaguide.entity.User;
import net.javaguide.service.UserService;

@RestController
public class UserControl {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<User>SaveUser(@RequestBody @Valid  User user){
		User saveuser =userService.Saveuser(user);
		return new ResponseEntity<User>(saveuser, HttpStatus.CREATED);
		
	}
	@GetMapping("/getAll")
	public List<User>getALLUsers(){
		return  userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User>getUserByID(@PathVariable("id") long id){
		return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
	
		
	}
	

}
