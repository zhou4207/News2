package com.newcapec.edu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newcapec.edu.entity.PageBean;
import com.newcapec.edu.entity.UserBean;
import com.newcapec.edu.utils.Connect;

public class PageImple implements PageDao {
	public Connection connect;
	ResultSet result;
	Statement sql;
	@Override
	public int getTotalCount() {
		connect=Connect.getConn();
		int count=0;
		 try {
		sql=connect.createStatement();
	
		String test="SELECT COUNT(*) FROM user_info ";
		 result=sql.executeQuery(test);
		 while (result.next()) {
			 count= result.getInt(1);
			 System.out.println("==="+count);
		 }
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					result.close();
					sql.close();
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		
		return count;
	}

	@Override
	public void getAll(PageBean<UserBean> userBean) {
		
		//获取总数
	int totalCount=getTotalCount();
	userBean.setTotalCount(totalCount);
	//
	int index=(userBean.getCurrentPage()-1)*userBean.getPageCount();
		connect=Connect.getConn();
		 try {
		sql=connect.createStatement();
		String test="SELECT * FROM user_info limit "+index+","+userBean.getPageCount();
		System.out.println("="+test);
		result=sql.executeQuery(test);
		 List<UserBean> userList=new ArrayList<>();
		 while (result.next()) {
			 UserBean user=new UserBean();
			 user.setId(result.getInt(1));
			 user.setUserName(result.getString(2));
			 user.setPassword(result.getString(3));
			 user.setSex(result.getString(4));
			 userList.add(user);
			 userBean.setPageData(userList);

		 }
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					result.close();
					sql.close();
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		

	}

	@Override
	public void delete(PageBean<UserBean> userBean) {
	
		
	}

}
