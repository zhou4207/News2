package com.newcapec.edu.dao;


import com.newcapec.edu.entity.PageBean;
import com.newcapec.edu.entity.UserBean;

public interface PageDao {

	public int getTotalCount();
	public void getAll(PageBean<UserBean> userBean);
	public void delete(PageBean<UserBean> userBean);
}
