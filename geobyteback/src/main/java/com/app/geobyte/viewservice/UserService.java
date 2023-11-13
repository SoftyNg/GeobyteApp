/**
 * 
 */
package com.app.geobyte.viewservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.geobyte.model.LocationModel;
import com.app.geobyte.model.UserModel;
import com.app.geobyte.repository.UserRepository;
import com.app.geobyte.repository.LocationRepository;


/**
 * 
 */

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private LocationRepository locationrepo;
	
	
	
	public UserModel saveUser(UserModel userreg) {
		return repo.save(userreg);
		
	}
	
	public UserModel fetchEmail(String email) {
		return repo.findByEmail(email);
	}

	public UserModel fetchEmailAndPassword(String Email, String Password) {
		// TODO Auto-generated method stub
		return repo.findByEmailAndPassword(Email, Password);
	}
	
	public LocationModel fetchLocationName(String name) {
		return locationrepo.findByLocationName(name);
	}

	public LocationModel saveLocation(LocationModel locationobj) {
		// TODO Auto-generated method stub
		return locationrepo.save(locationobj);
	}

	public LocationModel[] fetchAllLocation(LocationModel view) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
