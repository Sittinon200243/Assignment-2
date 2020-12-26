package com.example.Assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserServiceController {
	
	@Autowired
	UserService userservice; 
	
	/*@RequestMapping(value = "/checkLogin", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getUser(@PathVariable("username") String username, @PathVariable("password") String password)
	{
	   return new ResponseEntity<>(userservice.CheckLogin(username, password), HttpStatus.OK);	      
	}*/

	/*User user;
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE)
	   public void check()
	   {
	      userservice.CheckLogin(user.getUsername(), user.getPassword());	      
	   }*/
	 @GetMapping("/")
	 public String index()
	 {
		 return "Welcome";
	 }
	 
	 @PostMapping(value = "/checkLogin",  produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Object> getUser(User user) {
		 return new ResponseEntity<>(userservice.getProducts(), HttpStatus.OK);
	 }
	 
	 /*@PostMapping(value = "/checkLogin",  produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Object> getUser() {
	      return new ResponseEntity<>(userservice.getProducts(), HttpStatus.OK);
	 }*/
	 
	 /*@GetMapping("/checkLogin")
	 public String signin(Model model)
	 {
		 model.addAttribute("user" , new User());
		 User user = new User();
		 String username = user.getUsername();
		 String password = user.getPassword();
	     return username + password;
	 }*/
	 
	 /*@PostMapping(value = "/checkLogin")
	   public String show(User user)
	   {
		  user.setUsername("ice");
		  user.setUsername(user.getPassword());
	      return user.getUsername() + user.getPassword();
	   }*/
}
 