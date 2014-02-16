package com.mkyong.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mkyong.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class UserSpringAction extends ActionSupport {

	private static final long serialVersionUID = -6714339481344215527L;
	
	@Autowired
	private UserBo userBo;
	
	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
 
		userBo.printUser();
		return "success";
 
	}
	
}
