package SERVLET.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DAO.com.DaoClass;
import POJO.com.Bean;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
		PrintWriter pw = response.getWriter();
		pw.print("Welcome to Controller");
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Insert"))
		{
			Bean b=new Bean();
			
			b.setName(request.getParameter("Name"));
			b.setCMPF(request.getParameter("CMPF"));
			b.setPPO_NO(request.getParameter("PPO_NO"));
			b.setDate(request.getParameter("Date"));
			b.setAadhar(request.getParameter("Aadhar"));
			b.setPAN_NO(request.getParameter("PAN_NO"));
			b.setPhone_number(request.getParameter("phone_number"));
			b.setEmail(request.getParameter("email"));
			b.setPassword(request.getParameter("password"));
			b.setDOB(request.getParameter("DOB"));
			b.setGender(request.getParameter("gender"));
			b.setAddress(request.getParameter("address"));
			b.setPension(request.getParameter("pension"));
			b.setIFSC_Code(request.getParameter("IFSC_Code"));
			b.setAccount_number(request.getParameter("Account_number"));
			b.setBank_Name(request.getParameter("Bank_Name"));
			b.setBranch_Name(request.getParameter("branch_Name"));
			b.setSName(request.getParameter("SName"));
			b.setSDOB(request.getParameter("SDOB"));
			b.setSAadhar(request.getParameter("SAadhar"));
			b.setSPAN_NO(request.getParameter("SPAN_NO"));
			b.setSphone_number(request.getParameter("Sphone_number"));
			b.setSemail(request.getParameter("Semail"));
			DaoClass.doinsert(b);
			response.sendRedirect("Show.jsp");
				
		}
		else if(action.equalsIgnoreCase("delete"))
		{
		  int id=Integer.parseInt(request.getParameter("id"));
		  DaoClass.delete(id);
		  response.sendRedirect("Show.jsp");
	}
		
		else if(action.equalsIgnoreCase("Update"))
		{
			Bean b = new Bean();
			b.setId(Integer.parseInt(request.getParameter("id")));
			b.setName(request.getParameter("Name"));
			b.setCMPF(request.getParameter("CMPF"));
			b.setPPO_NO(request.getParameter("PPO_NO"));
			b.setDate(request.getParameter("Date"));
			b.setAadhar(request.getParameter("Aadhar"));
			b.setPAN_NO(request.getParameter("PAN_NO"));
			b.setPhone_number(request.getParameter("phone_number"));
			b.setEmail(request.getParameter("email"));
			b.setPassword(request.getParameter("password"));
			b.setDOB(request.getParameter("DOB"));
			b.setGender(request.getParameter("gender"));
			b.setAddress(request.getParameter("address"));
			b.setPension(request.getParameter("pension"));
			b.setIFSC_Code(request.getParameter("IFSC_Code"));
			b.setAccount_number(request.getParameter("Account_number"));
			b.setBank_Name(request.getParameter("Bank_Name"));
			b.setBranch_Name(request.getParameter("Branch_Name"));
			
			b.setSName(request.getParameter("SName"));
			b.setSDOB(request.getParameter("SDOB"));
			b.setSAadhar(request.getParameter("SAadhar"));
			b.setSPAN_NO(request.getParameter("SPAN_NO"));
			b.setSphone_number(request.getParameter("Sphone_number"));
			b.setSemail(request.getParameter("Semail"));
			DaoClass.Update(b);
			response.sendRedirect("Show.jsp");
		}
		
	else if(action.equalsIgnoreCase("edit"))
	{
		int id=Integer.parseInt(request.getParameter("id"));
		Bean b=DaoClass.getstudentbyid(id);
		request.setAttribute("be",b);
		request.getRequestDispatcher("Update.jsp").forward(request, response);
	}
	}
	}

