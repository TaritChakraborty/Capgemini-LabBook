package com.capgemini.jse.hibernate_example.hibernate_MTM;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.capgemini.jse.hibernate_example.hibernate_mapping.UserDetails_MTM;
import com.capgemini.jse.hibernate_example.hibernate_mapping.Vehicle_MTM;

public class Execute_MTM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				                 .configure("com/capgemini/jse/hibernate_example/hibernate_MTM/hibernate.config.xml")
				                 .buildSessionFactory();

		Session session = factory.getCurrentSession();
	    List<UserDetails_MTM> ulist = new ArrayList<UserDetails_MTM>();
		Vehicle_MTM vobj1 = new Vehicle_MTM("Maruti Wagon R",ulist);
		Vehicle_MTM vobj2 = new Vehicle_MTM("Hyundai Creta",ulist);
		Vehicle_MTM vobj3 = new Vehicle_MTM("Renault Scarla",ulist);
		List<Vehicle_MTM> vlist = new ArrayList<Vehicle_MTM>();
		vlist.add(vobj1);
		vlist.add(vobj2);
		vlist.add(vobj3);
		UserDetails_MTM uobj1 = new UserDetails_MTM("R M Shah",vlist);
		UserDetails_MTM uobj2 = new UserDetails_MTM("L N Singh",vlist);
		UserDetails_MTM uobj3 = new UserDetails_MTM("V K Gujral",vlist);
		ulist.add(uobj1);
		ulist.add(uobj2);
		ulist.add(uobj3);
		session.beginTransaction();
		session.save(vobj1); 
		session.save(vobj2); 
		session.save(vobj3); 
		session.save(uobj1);
		session.save(uobj2);
		session.save(uobj3);
		session.getTransaction().commit();
		factory.close();

	}


}
