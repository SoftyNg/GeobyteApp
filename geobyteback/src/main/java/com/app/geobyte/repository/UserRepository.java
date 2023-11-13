/**
 * 
 */
package com.app.geobyte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.geobyte.model.UserModel;


/**This is where the magic happens, as our interface fetches functionality from the JPA
 * Repository, inheriting all powerful features
 * We can then mirror our database TABLE fields using INTEGER id.
 */
public interface UserRepository extends JpaRepository<UserModel, Integer>{
	
	public UserModel findByEmail(String email);//fetching results by email
	
	public UserModel findByEmailAndPassword(String email, String password);//checking users email and password

}
