package com.work.adminwebpanel;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/admin")
@Controller
public class IndexController {
	
	//SessionFactory sf = HibernateUtil.getSessionFactory();
	
	@Autowired SessionFactory sessionFactory;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index()
	{
		return "home";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product(Model model)
	{
		model.addAttribute("data", productResult());
		return "product";
	}
	
	@RequestMapping(value = "/newProduct", method = RequestMethod.GET)
	public String newProduct(Model model)
	{
		model.addAttribute("data", productResult());
		return "newProduct";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(Product pro, Model model) {
		Session sesi = sessionFactory.openSession();
		Transaction tr = sesi.beginTransaction();
		pro.setPdesc1(pro.getPdesc1());
		pro.setPdesc2(pro.getPdesc2());
		pro.setPprice(pro.getPprice());
		sesi.save(pro);
		tr.commit();
		model.addAttribute("data", productResult());
		return "redirect:/admin/product";
	}

	public List<Product> productResult() {
		Session sesi = sessionFactory.openSession();
		List<Product> pr = sesi.createQuery("from Product").getResultList();
		sesi.close();
		return pr;
	}
	
	
	@RequestMapping(value = "/deleteProduct/{pid}", method = RequestMethod.GET)
	public String deleteItem(@PathVariable int pid) {
		Session sesi = sessionFactory.openSession();
		Transaction tr = sesi.beginTransaction();
		Product pro = (Product) sesi.load(Product.class, pid);
		sesi.delete(pro);
		tr.commit();
		return "redirect:/admin/product";
	}

	
/*	public String MD5(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		       }
		        return sb.toString();
		    } catch (java.security.NoSuchAlgorithmException e) {
		    }
		    return null;
		}
		
*/

	
}
