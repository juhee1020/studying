package com.lec.mvc.controller;
import javax.servlet.http.HttpSession;

//import org.apache.coyote.http11.upgrade.UpgradeServletOutputStream;
//import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lec.mvc.dao.UserDAO;
import com.lec.mvc.vo.UserVO;



@Controller
public class LoginController {

	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login(UserVO user, HttpSession sess) {
		//UserVO user 라고 해도 이 user는 userVO로 넘어간다.

		user.setId("admin@gmail.com");
		user.setPassword("12345");
		
		sess.setAttribute("isLoginSuccess", true);
		//sess.setAttribute("isLoginSuccess", false);

		return "login/login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO userVO, UserDAO userDAO, HttpSession sess) {
		//System.out.println(userVO.getId()); // 들어온다.

		// user : db에서 가져온놈 / userVO : 유저가 입력한거
		UserVO user = userDAO.getUser(userVO.getId());

		if(user==null) {
			sess.setAttribute("isLoginSuccess", false);
		}
		if(!user.getPassword().equals(userVO.getPassword())) {
			sess.setAttribute("matchedPassword", false);
			return "login/login.jsp";
		}else{
			sess.setAttribute("matchedPassword", true);
		}
		
		if(user.getId().equalsIgnoreCase(userVO.getId())) {
			sess.setAttribute("user", user);
			sess.setAttribute("perPage", 10);
			if(user.getRole().equalsIgnoreCase("ADMIN")) {
				sess.setAttribute("isAdmin", true);
			}else {
				sess.setAttribute("isAdmin", false);
			}
			return "login/logout.jsp";
		}
		return null;
	}
	
	@RequestMapping(value="/logout.do", method=RequestMethod.GET)
	public String logout(UserVO userVO, HttpSession sess) {
		sess.invalidate();
		return "index.jsp";
	}
}