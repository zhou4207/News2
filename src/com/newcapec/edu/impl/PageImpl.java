package com.newcapec.edu.impl;


import com.newcapec.edu.entity.PageBean;
import com.newcapec.edu.entity.UserBean;

public interface PageImpl {

	public int getTotalCount();
	public void getAll(PageBean<UserBean> userBean);
	public void delete(PageBean<UserBean> userBean);
}
