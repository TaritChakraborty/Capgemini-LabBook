package com.capgemini.jse.hibernate_example.hibernate_OTO;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class U_id_generation implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		int num = (int) (Math.random()*(5000 - 3000 + 1) + 3000);
		return num;
	}

}
