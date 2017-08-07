package com.newcapec.edu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newcapec.edu.entity.PageBean;
import com.newcapec.edu.entity.UserBean;
import com.newcapec.edu.service.PageService;

/**
 * Servlet implementation class PageServlet
 */
@WebServlet("/PageServlet")
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
String currentPage=request.getParameter("currentPage");
		if (currentPage==null||currentPage.equals("")) {
			currentPage="1";
		}
PageBean<UserBean> pageBean=new PageBean<>();
pageBean.setCurrentPage(Integer.parseInt(currentPage));	


PageService pageService=new PageService();	
pageService.getAll(pageBean);
//给作用域设置相关数据
request.setAttribute("pageData", pageBean.getPageData());
//获取数据可以分成多少页
int  totalPage=pageBean.getTotalCount()%pageBean.getPageCount()==0
?pageBean.getTotalCount()/pageBean.getPageCount():pageBean.getTotalCount()/pageBean.getPageCount()+1;
int index[]=new int[totalPage];
for (int i = 0; i <totalPage; i++) {
	index[i]=i+1;
}


request.setAttribute("totalPage", index);
//给作用域设置当前页
request.setAttribute("currentPage", pageBean.getCurrentPage());
	request.getRequestDispatcher("/WEB-INF/page/list.jsp")
	.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
