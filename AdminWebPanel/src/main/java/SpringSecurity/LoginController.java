package SpringSecurity;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.adminwebpanel.User;

@Controller
public class LoginController {
	
	
	@Autowired SessionFactory sessionFactory;
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String home( Model model) {
		
		
		System.out.println("oturum() : " + Utils.oturum());
		if(Utils.oturum().equals("ROLE_ANONYMOUS")) {
			return "redirect:/admin/home";
		}
		
		if(Utils.oturum().equals("ADMIN")) {
			return "redirect:/admin/home";
		}
		
		if(Utils.oturum().equals("USER")) {
			return "redirect:/admin/home";
		}
		
		if(Utils.oturum().equals("CALLCENTER")) {
			return "redirect:/admin/home";
		}
		
		return "signup";
	}
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String login(User us, Model model) {
		model.addAttribute("userData",us.getName());
		return "login";
	}
	
	
	@RequestMapping(value = {"/createAccount"}, method = RequestMethod.GET)
	public String createAcc(Model model)
	{
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String insert(User us, Model model) {
		Session sesi = sessionFactory.openSession();
		Transaction tr = sesi.beginTransaction();
		us.setPassword(us.getPassword());
		//us.setUrid(1); //create all users as an admin because urid =1 equals admin role
		sesi.save(us);
		tr.commit();
		model.addAttribute("data", userResult());
		return "redirect:/";
	}
	
	
	public List<User> userResult() {
		Session sesi = sessionFactory.openSession();
		List<User> ls = sesi.createQuery("from User").getResultList();
		sesi.close();
		return ls;
	}
	
}
