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

}
