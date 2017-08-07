package com.newcapec.edu.service;

import com.newcapec.edu.dao.PageImple;
import com.newcapec.edu.entity.PageBean;
import com.newcapec.edu.entity.UserBean;

public class PageService {

	
	public void getAll(PageBean<UserBean> userBean){
		PageImple dao=new PageImple();
		dao.getAll(userBean);
		
	}
	
}
