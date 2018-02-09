package controller;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;
public class BaseController {
	@ModelAttribute  
    public void isLogin(HttpSession session) throws Exception {      
       if(session.getAttribute("user") == null){  
           throw new Exception("没有权限");  
       }  
    }    
}
