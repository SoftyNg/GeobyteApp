/**
 * 
 */
package com.app.geobyte.viewservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.geobyte.model.UserModel;
import com.app.geobyte.repository.UserRepository;


/**
 * 
 */

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	
	
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
	

}
