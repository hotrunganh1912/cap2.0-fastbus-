package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.*;

import model.bean.ChuyenXe;
import model.bo.ChuyenXeBO;

/**
 * Servlet implementation class LoadListTripServlet
 */
@WebServlet("/LoadListTripServlet")
public class LoadListTripServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadListTripServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		request.getCharacterEncoding();
		String idBusiness =request.getParameter("idBusiness");
		String startPlace = request.getParameter("startPlace");
		String endPlace= request.getParameter("endPalce");
		List<ChuyenXe> listTrip=new ChuyenXeBO().getListTripByIdBusinessAndPlaceBO(idBusiness,startPlace,endPlace);
		Gson gSon= new Gson();
		PrintWriter out= response.getWriter();
		out.print(gSon.toJson(listTrip));
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
