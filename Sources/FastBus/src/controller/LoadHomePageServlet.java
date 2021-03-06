package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Business;
import model.bean.DiaDiem;
import model.bo.BusinessBO;
import model.bo.DiaDiemBO;

/**
 * Servlet implementation class LoadHomePageServlet
 */
@WebServlet("/LoadHomePageServlet")
public class LoadHomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadHomePageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getCharacterEncoding();
		response.getCharacterEncoding();
		
		DiaDiemBO dd=new DiaDiemBO();	
		List<DiaDiem> listPlace=dd.getListPlaceBO();
		
		List<Business> listBusiness= new BusinessBO().getListBusinessBO();
		
		request.setAttribute("listBusiness", listBusiness);
		request.setAttribute("listPlace", listPlace);
		RequestDispatcher rd=request.getRequestDispatcher("/Views/users/homePage.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
