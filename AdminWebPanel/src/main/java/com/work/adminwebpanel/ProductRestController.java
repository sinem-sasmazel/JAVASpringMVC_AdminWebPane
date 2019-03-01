package com.work.adminwebpanel;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/productAPI")
public class ProductRestController {
	
	public IndexController ic = new IndexController();
	
	
	// Hibernate Connection
	//SessionFactory sf = HibernateUtil.getSessionFactory();
	
	@Autowired SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/admin/productAPI", method = RequestMethod.GET)
	public HashMap<String, Object> productAPI()
	{
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("statu", true);
		hm.put("message", "Products are listed successfully");
		
		Session sesi = sessionFactory.getCurrentSession();
		Transaction tr = sesi.beginTransaction();
		List<Product> pr = sesi.createQuery("from Product")
				.getResultList();
		hm.put("products", pr);
		tr.commit();
		sesi.close();
		return hm;
	}

}
