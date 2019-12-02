package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.District;
import model.bean.Province;
import model.bean.Ward;
import model.bo.ProvinceDistrictWardBO;

/**
 * Servlet implementation class RegisterBusunessServlet
 */
@WebServlet("/RegisterBusunessServlet")
public class RegisterBusunessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterBusunessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="/Views/business/registerAdmin.jsp";
		List<Province> listProvinces=null;
		List<District> listDistricts=null;
		List<Ward> listWards=null;
		ProvinceDistrictWardBO bo=new ProvinceDistrictWardBO();
		if("btnRegister".equalsIgnoreCase(request.getParameter("btnRegister"))) {
			
		}else {
			listProvinces= bo.getListProvinceBO();
			listDistricts=bo.getListDistrictBO("");
			listWards=bo.getListWardBO("");
		}
		
		request.setAttribute("listProvinces", listProvinces);
		request.setAttribute("listDistricts", listDistricts);
		request.setAttribute("listWards", listWards);
		RequestDispatcher rd= request.getRequestDispatcher(url);
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
