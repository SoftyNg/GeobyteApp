/**
 * 
 */
package com.app.geobyte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.geobyte.model.UserModel;
import com.app.geobyte.viewservice.UserService;


/**
 * 
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/registeruser")
	@CrossOrigin("origin = http://localhost:4200")
	  public UserModel register(@RequestBody UserModel userreg) throws Exception {
		
		  String tempEmail = userreg.getEmail();//assign temporary email to object
		  
		  if (tempEmail != null && !"".equals(tempEmail)) {
			UserModel userobj = service.fetchEmail(tempEmail);
			if (userobj != null) {
				throw new Exception("User with this email "+ tempEmail+ "Already exist");
			}
		}//checking and comparing entered email value with database stored value
		  
		  UserModel userObj = null;
		  userObj= service.saveUser(userreg);
		  
		  return userObj;
	  }
	
	@PostMapping("/login")
	@CrossOrigin("origin = http://localhost:4200")
	public UserModel loginUser(@RequestBody UserModel userlogin) throws Exception {
		String tempEmail = userlogin.getEmail();
		String tempPassword = userlogin.getPassword();
		UserModel loginobj = null;
		if (tempEmail != null && tempPassword != null) {
			 loginobj = service.fetchEmailAndPassword(tempEmail, tempPassword);
			
			if (loginobj == null) {
				throw new Exception("Your email or password is wrong");
			}
		}		  
		  return loginobj;		
	}

}
