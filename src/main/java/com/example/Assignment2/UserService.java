package com.example.Assignment2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private static Map<String, User> productRepo = new HashMap<String, User>();
	   static {
		  User user = new User();
	      user.getUsername();
	      user.getPassword();
	      user.getloginStatus();
	      productRepo.put(user.getUsername(), user);
	   }
	
	public Collection<User> getProducts() {
		      return productRepo.values();
    }

	public void CheckLogin(String username, String password) {
		
		User user = new User();
		if(isNumeric(username)||isNumeric(password)||username == null||password == null)
		{
			user.getUsername();
			user.getPassword();
			user.setloginStatus("fail");
			user.getloginStatus();
		}
		else 
		{
			user.getUsername();
			user.setloginStatus("success");
			user.getloginStatus();
		}
		
	}
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
}
