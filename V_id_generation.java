package com.capgemini.jse.hibernate_example.hibernate_OTO;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class V_id_generation implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		int num = (int) (Math.random()*(2000 - 1000 + 1) + 1000);
		return num;
	}

}
