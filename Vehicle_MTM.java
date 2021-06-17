package com.capgemini.jse.hibernate_example.hibernate_mapping;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "vehiclemtm")
public class Vehicle_MTM {
	@Id
	@GenericGenerator(name = "V_id",strategy = "com.capgemini.jse.hibernate_example.hibernate_OTO.V_id_generation")	
	@GeneratedValue(generator = "V_id")
	@Column(name = "v_id")
	private int vehicleId;

	@Column(name = "v_name")
	private String vehicleName;

	@ManyToMany(mappedBy = "vehicle")
	private List<UserDetails_MTM> user = new ArrayList<UserDetails_MTM>();

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public List<UserDetails_MTM> getUser() {
		return user;
	}

	public void setUser(List<UserDetails_MTM> user) {
		this.user = user;
	}

	public Vehicle_MTM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle_MTM(String vehicleName, List<UserDetails_MTM> user) {
		super();
		this.vehicleName = vehicleName;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Vehicle_MTM [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", user=" + user + "]";
	}
	

}
