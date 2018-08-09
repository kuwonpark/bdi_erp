package com.bdi.erp.dao.impl;

import com.bdi.erp.dao.UserDAO;

public class UserDAOImpl implements UserDAO{

	@Override
	public boolean login(String id, String pwd) {
		
		return false;
	}
	
	public static void main(String[] args) {
		String str = "a,b,c,d,e";
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			
			Character c = str.charAt(i);
			if(c.toString().equals(",")) {
				cnt++;
			}
		}
		System.out.println(",의 갯수"+cnt);
	}	
}
