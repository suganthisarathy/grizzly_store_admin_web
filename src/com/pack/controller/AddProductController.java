package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.dao.AddProductDaoImpl;
import com.pack.model.AddProduct;

import com.pack.service.AddProductServiceImpl;


/**
 * Servlet implementation class AddProductController
 */
@WebServlet("/AddProductController")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int productid=Integer.parseInt(request.getParameter("pid"));
		String category=request.getParameter("category");
		String name=request.getParameter("name");
		String description=request.getParameter("desc");
		String price=request.getParameter("price");
		float prize=Float.parseFloat(price);
		AddProduct ap=new AddProduct(productid,category,name,description,prize);
		List<AddProduct> l=null;
		int i=new AddProductServiceImpl().insertProduct(ap);
		
		if(i==1)
			
		{
			l=new AddProductDaoImpl().listProduct();
			if(l!=null)
			{
				
				request.setAttribute("custlist",l);
				RequestDispatcher rd=request.getRequestDispatcher("/ListProduct.jsp");
				rd.include(request, response);

			}
	}
	}
}
