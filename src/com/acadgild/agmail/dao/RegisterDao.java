package com.acadgild.agmail.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acadgild.agmail.model.Register;
@Repository("registerDao")
public class RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;
	public void registerUser(Register register) {
		sessionFactory.getCurrentSession().saveOrUpdate(register);
	}
	
	public boolean checkLogin(String userName,String password) {
		String SQL_QUERY =" from Register as o where o.firstName=? and o.password=?";
		Query query = sessionFactory.getCurrentSession().createQuery(SQL_QUERY);
		query.setParameter(0,userName);
		query.setParameter(1,password);
		List list = query.list();
		if(list!=null && list.size()>0){
			return true;
		}
		return false;
	}
}
