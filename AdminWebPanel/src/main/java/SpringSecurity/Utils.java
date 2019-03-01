package SpringSecurity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class Utils {

	
		public static String oturum() {
			String n = "";
			Object prin = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			Collection<?extends GrantedAuthority> auth = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
			
			if(prin instanceof UserDetails) {
				n = ((UserDetails) prin).getUsername();
			}else {
				n = prin.toString();
			}
			return auth.toArray()[0].toString();
		}
	
}