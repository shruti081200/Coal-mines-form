package DAO.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import POJO.com.Bean;
import UTIL.com.DBMSConnection;


public class DaoClass 
{
	public static void doinsert(Bean b)
	{
		try {
		
		Connection con = DBMSConnection.myconnection();
		String sql = "insert into details (Name,CMPF,PPO_NO,Date,Aadhar,PAN_NO,phone_number,email,password,DOB,gender,address,pension,IFSC_Code,Account_number,Bank_Name,Branch_Name,SName,SDOB,SAadhar,SPAN_NO,Sphone_number,Semail) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
		
			PreparedStatement pre=con.prepareStatement(sql);
			
			 pre.setString(1, b.getName());
			 pre.setString(2, b.getCMPF());
			 pre.setString(3, b.getPPO_NO());
			 pre.setString(4, b.getDate());
			 pre.setString(5, b.getAadhar());
			 pre.setString(6, b.getPAN_NO());
			 pre.setString(7, b.getPhone_number());
			 pre.setString(8, b.getEmail());
			 pre.setString(9, b.getPassword());
			 pre.setString(10, b.getDOB());
			 pre.setString(11, b.getGender());
			 
			 pre.setString(12, b.getAddress());
			 pre.setString(13, b.getPension());
			 pre.setString(14, b.getIFSC_Code());
			 pre.setString(15, b.getAccount_number());
			 pre.setString(16, b.getBank_Name());
			 pre.setString(17, b.getBranch_Name());
			 pre.setString(18, b.getSName());
			 pre.setString(19, b.getSDOB());
			 pre.setString(20, b.getSAadhar());
			 pre.setString(21, b.getSPAN_NO());
			 pre.setString(22, b.getSphone_number());
			 pre.setString(23, b.getSemail());
			 
			 pre.executeUpdate();
			 System.out.println("Data inserted successfully");
			 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
	
	public static List<Bean> getAll()
	{
		List<Bean> list=new ArrayList<Bean>();
		try {
		Connection con=DBMSConnection.myconnection();
		String sql= "Select * from details";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Bean be=new Bean();
			
			be.setId(rs.getInt("id"));
			be.setName(rs.getString("Name"));
			be.setCMPF(rs.getString("CMPF"));
			be.setPPO_NO(rs.getString("PPO_NO"));
			be.setDate(rs.getString("Date"));
			be.setAadhar(rs.getString("Aadhar"));
			be.setPAN_NO(rs.getString("PAN_NO"));
			be.setPhone_number(rs.getString("Phone_number"));
			be.setEmail(rs.getString("Email"));
			be.setPassword(rs.getString("Password"));
			be.setDOB(rs.getString("DOB"));
			be.setGender(rs.getString("Gender"));
			be.setAddress(rs.getString("Address"));
			be.setPension(rs.getString("Pension"));
			be.setIFSC_Code(rs.getString("IFSC_Code"));
			be.setAccount_number(rs.getString("Account_number"));
			be.setBank_Name(rs.getString("Bank_Name"));
			be.setBranch_Name(rs.getString("Branch_Name"));
			
			be.setSName(rs.getString("SName"));
			be.setSDOB(rs.getString("SDOB"));
			be.setSAadhar(rs.getString("SAadhar"));
			be.setSPAN_NO(rs.getString("SPAN_NO"));
			be.setSphone_number(rs.getString("Sphone_number"));
			be.setSemail(rs.getString("Semail"));
			list.add(be);
			
		}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;	
	}
	public static void delete(int id)
	{
		try
		{
		Connection cwd = DBMSConnection.myconnection();
		   String sql=("delete from details where id=?");
			  
			PreparedStatement ps=cwd.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} 
		   catch (Exception e) 
		   {
			
			e.printStackTrace();
		}
	}
	 public static void Update(Bean b)
	 {
		 try {
				
				Connection con = DBMSConnection.myconnection();
				String sql = "update details set Name=?, CMPF=?, PPO_NO=?, Date=?, Aadhar=?, PAN_NO=?, phone_number=?, email=?, password=?, DOB=?, gender=?, address=?, pension=?, IFSC_Code=?, Account_number=?, Bank_Name=?, Branch_Name=?, SName=?, SDOB=?, SAadhar=?, SPAN_NO=?, Sphone_number=?, Semail=? where id=?"; 
				
					PreparedStatement pre=con.prepareStatement(sql);
					
					 pre.setString(1, b.getName());
					 pre.setString(2, b.getCMPF());
					 pre.setString(3, b.getPPO_NO());
					 pre.setString(4, b.getDate());
					 pre.setString(5, b.getAadhar());
					 pre.setString(6, b.getPAN_NO());
					 pre.setString(7, b.getPhone_number());
					 pre.setString(8, b.getEmail());
					 pre.setString(9, b.getPassword());
					 pre.setString(10, b.getDOB());
					 pre.setString(11, b.getGender());
					 
					 pre.setString(12, b.getAddress());
					 pre.setString(13, b.getPension());
					 pre.setString(14, b.getIFSC_Code());
					 pre.setString(15, b.getAccount_number());
					 pre.setString(16, b.getBank_Name());
					 pre.setString(17, b.getBranch_Name());
					 pre.setString(18, b.getSName());
					 pre.setString(19, b.getSDOB());
					 pre.setString(20, b.getSAadhar());
					 pre.setString(21, b.getSPAN_NO());
					 pre.setString(22, b.getSphone_number());
					 pre.setString(23, b.getSemail());
					 pre.setInt(24, b.getId());
					 pre.executeUpdate();
	 }
		 catch (Exception e)
		 {
			 e.printStackTrace();
		}
}
	  public static Bean getstudentbyid(int id)
	  {
		  Bean b=null;
		  try {
				Connection con=DBMSConnection.myconnection();
				String sql="select * from details where id=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs=pst.executeQuery();
				if(rs.next())
				{
					b=new Bean();
					b.setId(rs.getInt("id"));
					b.setName(rs.getString("Name"));
					b.setCMPF(rs.getString("CMPF"));
					b.setPPO_NO(rs.getString("PPO_NO"));
					b.setDate(rs.getString("Date"));
					b.setAadhar(rs.getString("Aadhar"));
					b.setPAN_NO(rs.getString("PAN_NO"));
					b.setPhone_number(rs.getString("Phone_number"));
					b.setEmail(rs.getString("Email"));
					b.setPassword(rs.getString("Password"));
					b.setDOB(rs.getString("DOB"));
					b.setGender(rs.getString("Gender"));
					b.setAddress(rs.getString("Address"));
					b.setPension(rs.getString("Pension"));
					b.setIFSC_Code(rs.getString("IFSC_Code"));
					b.setAccount_number(rs.getString("Account_number"));
					b.setBank_Name(rs.getString("Bank_Name"));
					b.setBranch_Name(rs.getString("Branch_Name"));
					
					b.setSName(rs.getString("SName"));
					b.setSDOB(rs.getString("SDOB"));
					b.setSAadhar(rs.getString("SAadhar"));
					b.setSPAN_NO(rs.getString("SPAN_NO"));
					b.setSphone_number(rs.getString("Sphone_number"));
					b.setSemail(rs.getString("Semail"));
				}
			}catch (Exception e) 
		  {
				e.printStackTrace();
			}
		  return b;
	  }
		  
	 
}
