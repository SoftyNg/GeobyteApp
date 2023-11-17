/**
 * 
 */
package com.app.geobyte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.geobyte.model.LocationModel;
import com.app.geobyte.model.UserModel;
import com.app.geobyte.viewservice.UserService;


/**
 * 
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	
	//Registration function	
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
	
		
	//login function
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
	
	
	
	//save location function	
		@PostMapping("/registerlocation")
		@CrossOrigin("origin = http://localhost:4200")
		  public LocationModel saveLocation(@RequestBody LocationModel newLocation) throws Exception {
			
			  String tempName = newLocation.getLocationName();//assign temporary location name to object
			  
			  if (tempName != null && !"".equals(tempName)) {
				LocationModel locationobj = service.fetchLocationName(tempName);
				if (locationobj != null) {
					throw new Exception("User with this email "+ locationobj+ "Already exist");
				}
			}//checking and comparing entered email value with database stored value
			  
			  LocationModel locationobj = null;
			  locationobj = service.saveLocation(locationobj);
			  
			  return locationobj;
		  }
		
		
		//login function
		@PostMapping("/view_location")
		@CrossOrigin("origin = http://localhost:4200")
		public LocationModel viewLocation(@RequestBody LocationModel view) throws Exception {
			 String tempView = view.getLocationName();
			LocationModel fetchview = null;
			if (view != null) {
				 fetchview = service.fetchLocationName(tempView);
				
				if (fetchview == null) {
					throw new Exception("Cannot find this location on our database");
				}
			}		  
			  return fetchview;		
		}
		
		

}
