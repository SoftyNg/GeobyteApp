/**
 * 
 */
package com.app.geobyte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.geobyte.model.LocationModel;


/**
 * 
 */
public interface LocationRepository extends JpaRepository<LocationModel, Integer>{
	
	public LocationModel findByLocationName(String name);

	

}