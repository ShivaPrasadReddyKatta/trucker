package com.shiva.truckerapi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ALERT_TBL")
public class Alert {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String vin;
	private String priority;
	private String description;
	
	@DateTimeFormat(pattern="YYYY-MM-DDThh:mm:ss.sTZD")
	private Date timestamp;
	private double latitude;
	private double longitude;
	private boolean added;
	
	public Alert() {
		
	}
	
	public boolean getAdded() {
		return added;
	}
	
	public void setAdded(boolean added) {
		this.added = added;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Alert [id=" + id + ", vin=" + vin + ", priority=" + priority + ", description=" + description
				+ ", timestamp=" + timestamp + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}
