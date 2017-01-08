package controller.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.user.impl.UserServiceImpl;
import dao.bean.user.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String type = request.getParameter("type");
		response.setContentType("text/plain");
		if (type.equals("login")) {
		   String name = request.getParameter("ope_name");
		   String psw = request.getParameter("ope_pwd");
		   System.out.print(name + " " + psw);
//		   User newUser = new User();
//		   newUser.setUserName("hello");
//		   newUser.setUserLevel(2);
//		   newUser.setPassword("123456");
//		   UserServiceImpl.getInstance().createUser(newUser);
		   List<User> checkUserList = UserServiceImpl.getInstance().getUserListByName(name);
		   System.out.print(checkUserList.get(0).toString());
		   if(checkUserList.get(0).getPassword().equals(psw)) {
			   response.getWriter().write("success");
		   }else {
			   response.getWriter().write("failed");
		   }
		}
	}

}








