<%@page import="POJO.com.Bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Bean b=(Bean)request.getAttribute("be");
%>
	
<form name="form" action="Controller" method="post">
<table>
<tr><td><input type="hidden" name="id" value="<%=b.getId()%>"></td></tr>
<tr><td><input type="text" name="Name" placeholder="Name" value="<%=b.getName() %>" ></td></tr>
<tr><td><input type="text" name="CMPF" placeholder="CMPF"  value="<%=b.getCMPF() %>" ></td></tr>
<tr><td><input type="text" name="PPO_NO" placeholder="PPO" value="<%=b.getPPO_NO() %>" ></td></tr>
<tr><td><input type="date" name="Date" placeholder="Date" value="<%=b.getDate() %>" ></td></tr>
<tr><td><input type="text" name="Aadhar" placeholder="Aadhar" value="<%=b.getAadhar() %>" ></td></tr>
<tr><td><input type="text" name="PAN_NO" placeholder="date" value="<%=b.getPAN_NO() %>" ></td></tr>
<tr><td><input type="number" name="phone_number" placeholder="Phone number" value="<%=b.getPhone_number() %>" ></td></tr>
<tr><td><input type="email" name="email" placeholder="Email" value="<%=b.getEmail() %>" ></td></tr>
<tr><td><input type="password" name="password" placeholder="password" value="<%=b.getPassword() %>" ></td></tr>
<tr><td><input type="date" name="DOB" placeholder="DOB" value="<%=b.getDOB() %>" ></td></tr>
<tr><td><input type="text" name="gender" placeholder="Gender" value="<%=b.getGender()%>" ></td></tr>
<tr><td><input type="text" name="address" placeholder="Address" value="<%=b.getAddress() %>" ></td></tr>
<tr><td><input type="number" name="pension" placeholder="Pension" value="<%=b.getPension() %>" ></td></tr>
<tr><td><input type="text" name="IFSC_Code" placeholder="IFSC" value="<%=b.getIFSC_Code() %>" ></td></tr>
<tr><td><input type="text" name="Account_number" placeholder="Account number" value="<%=b.getAccount_number() %>" ></td></tr>
<tr><td><input type="text" name="Bank_Name" placeholder="Bank Name" value="<%=b.getBank_Name() %>" ></td></tr>
<tr><td><input type="text" name="Branch_Name" placeholder="Branch Name" value="<%=b.getBranch_Name() %>" ></td></tr>
<tr><td><input type="text" name="SName" placeholder="Spouse Name" value="<%=b.getSName() %>" ></td></tr>
<tr><td><input type="text" name="SDOB" placeholder="Spouse DOB" value="<%=b.getSDOB() %>" ></td></tr>
<tr><td><input type="text" name="SAadhar" placeholder="Spouse Aadhar" value="<%=b.getSAadhar() %>" ></td></tr>
<tr><td><input type="text" name="SPAN_NO" placeholder="Spouse Pan Number" value="<%=b.getSPAN_NO() %>" ></td></tr>
<tr><td><input type="text" name="Sphone_number" placeholder="Spouse Phone Number" value="<%=b.getSphone_number() %>" ></td></tr>
<tr><td><input type="email" name="Semail" placeholder="Spouse Email" value="<%=b.getSemail() %>" ></td></tr>
<tr><td><input type="submit" name="action" value="Update"></td></tr>
</table>
</form>
</body>
</html>