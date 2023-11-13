/**
 * 
 */
package com.app.geobyte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * 
 */

@Entity //uses our class as database table to inside field values into database
public class LocationModel {
	
	@Id//convert to primary ID in the database table
	private int locationId;
	
	private String locationName;
	
	private double longitude;
	
	private double latitude;

	
	/**
	 * Empty constructor
	 */
	public LocationModel() {
		
	}

	/**
	 * @param locationId
	 * @param locationName
	 * @param longitude
	 * @param latitude
	 */
	public LocationModel(int locationId, String locationName, double longitude, double latitude) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	/**
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	

}
