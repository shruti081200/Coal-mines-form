<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="DAO.com.DaoClass" %>
<%@ page import="POJO.com.Bean"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Members</title>
</head>
<body style="background-color: tan;">
<h1 style="background-color: tan ;color: maroon;text-align:center; ">Registration details</h1>

<%
  List<Bean>list = DaoClass.getAll();
%>

 <table border="2" width="40%" border-spacing="none" cell-spacing="none">
 <tr>
 <th>ID</th>
 <th>NAME</th>
 <th>CMPF</th>
 <th>PPO</th>
 <th>DATE</th>
 <th>AADHAR</th>
 <th>PAN</th>
 <th>PHONE NUMBER</th>
 <th>EMAIL</th>
 <th>PASSWORD</th>
 <th>DOB</th>
 <th>GENDER</th>
 <th>ADDRESS</th>
 <th>PENSION</th>
 <th>IFSC</th>
 <th>ACCOUNT NUMBER</th>
 <th>BANK NAME</th>
 <th>BRANCH NAME</th>
 <th>SPOUSE NAME</th>
 <th>SPOUSE DOB</th>
 <th>SPOUSE AADHAR</th>
 <th>SPOUSE PAN</th>
 <th>SPOUSE PHONE NUMBER</th>
 <th>SPOUSE EMAIL</th>
 <th>EDIT</th>
 <th>DELETE</th>
 
</tr>

<% 
  for(Bean b : list)
  {
%>
<tr>
<td><%=b.getId() %></td>
<td><%=b.getName()%></td>
<td><%=b.getCMPF()%></td>
<td><%=b.getPPO_NO()%></td>
<td><%=b.getDate()%></td>
<td><%=b.getAadhar()%></td>
<td><%=b.getPAN_NO()%></td>
<td><%=b.getPhone_number()%></td>
<td><%=b.getEmail()%></td>
<td><%=b.getPassword()%></td>
<td><%=b.getDOB()%></td>
<td><%=b.getGender()%></td>
<td><%=b.getAddress()%></td>
<td><%=b.getPension()%></td>
<td><%=b.getIFSC_Code()%></td>
<td><%=b.getAccount_number()%></td>
<td><%=b.getBank_Name()%></td>
<td><%=b.getBranch_Name()%></td>
<td><%=b.getSName()%></td>
<td><%=b.getSDOB()%></td>
<td><%=b.getSAadhar()%></td>
<td><%=b.getSPAN_NO()%></td>
<td><%=b.getSphone_number()%></td>
<td><%=b.getSemail()%></td>

<td>
<form name="Edit" method="post" action="Controller">
<input type="hidden" name="id" value="<%=b.getId()%>">
<input type="submit" name="action" value="Edit"></form>
</td>
<td>
<form name="delete" method="post" action="Controller">   
	  <input type="hidden" name="id" value="<%=b.getId()%>">
	  <input type="submit" name="action" value="Delete" class="fa-solid fa-trash">
	 </form>
</td>
</tr>
<% } %>
</table>
<a href="Registration.jsp">
<button>New Form</button>

</body>
</html>