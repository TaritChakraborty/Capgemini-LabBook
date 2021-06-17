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
@Table(name = "userdetailsmtm")
public class UserDetails_MTM {
	@Id
    @Column(name = "u_id")
	@GenericGenerator(name = "V_id",strategy = "com.capgemini.jse.hibernate_example.hibernate_OTO.U_id_generation")	
	@GeneratedValue(generator = "U_id")
    private int userId;
    
    @Column(name = "u_name") 
    private String userName;
    
    @ManyToMany
    private List<Vehicle_MTM> vehicle = new ArrayList<Vehicle_MTM>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Vehicle_MTM> getVehicle() {
		return vehicle;
	}

	public void setVehicle(ArrayList<Vehicle_MTM> vehicle) {
		this.vehicle = vehicle;
	}

	public UserDetails_MTM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails_MTM(String userName, List<Vehicle_MTM> vehicle) {
		super();
		this.userName = userName;
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "UserDetails_MTM [userId=" + userId + ", userName=" + userName + ", vehicle=" + vehicle + "]";
	}
    

}

