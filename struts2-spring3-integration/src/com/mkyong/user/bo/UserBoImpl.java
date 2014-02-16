package com.mkyong.user.bo;

import org.springframework.stereotype.Component;

@Component
public class UserBoImpl implements UserBo {

	@Override
	public void printUser() {
		System.out.println("printUser() is executed...");
	}

}
