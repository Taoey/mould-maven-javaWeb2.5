package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping("/login")
	public String login() {
		/*不管重定向或转发，都需要符合视图解析器的配置，如果直接跳转到一个不需要dispatcher servlet的资源，
		 * 需要使用mvc:resources配置，
		如：<mvc:resources location="/html/" mapping="/html/**"></mvc:resources> ）
		return "forward:/html/my.html";*/
		//转发到一个请求方法（同一个控制器类里，可省略/index/）
		//return "forward:/index/isLogin";
		return "login";
	}
	@RequestMapping("/isLogin")
	public String isLogin() {
		//重定向到一个请求方法
		return "redirect:/index/isRegister";
	}
	@RequestMapping("/isRegister")
	public String isRegister() {
		//转发到一个视图
		return "register";
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
}
