<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register here</title>
</head>
<body>

<form action="Controller" method="post">
<table>
<tr>
<td >NAME</td>
<td><input type="text" id="uname" name="Name" placeholder="NAME OF PENSIONER"></td> 
</tr>
<tr>
<td>CMPF AC NO.</td>
<td><input type="number" id="cnum" name="CMPF" placeholder="CMPF AC NO."></td>
</tr>
<tr>
<td>PPO NO</td>
<td><input type="number" id="pponum" name="PPO_NO" placeholder="PPO NO"></td>
</tr>
<tr>
<td >DATE OF EXIT</td>
<td><input type="date" id="date" name="Date" placeholder="DATE OF EXIT"></td> 
</tr>
<tr>
<td>AADHAR NUMBER</td>
<td><input type="number" id="aadhar" name="Aadhar" placeholder="AADHAR NUMBER"></td>
</tr>
<tr>
<td>PAN NO</td>
<td><input type="text" id="pan" name="PAN_NO" placeholder="PAN NO"></td>
</tr>
<tr>
<td>PHONE NUMBER</td>
<td><input type="number" id="phno" name="phone_number" placeholder="PHONE NUMBER" maxlength="10"></td>
</tr>
<tr>
<td>EMAIL-ID</td>
<td><input type="email" id="mail" name="email" placeholder="EMAIL-ID"></td>
</tr>
<tr>
<td>PASSWORD</td>
<td><input type="password" id="pass" name="password" placeholder="PASSWORD" maxlength="8"></td>
</tr>
<tr>
<td>DATE OF BIRTH</td>
<td><input type="date" id="dob" name="DOB" placeholder="DOB"></td>
</tr>
<tr>
<td>GENDER</td>
<td><input type="radio" id="gender" name="gender" value="male"/>Male
<input type="radio" name="gender" value="female"/>Female
<input type="radio" name="gender" value="other"/>Other</td>
</tr>
<tr>
<td>ADDRESS</td>
<td><textarea rows="3" cols="16" id="add" name="address" placeholder="ADDRESS"></textarea></td>
</tr>
<tr>
<tr>
<td>MONTHLY PENSION</td>
<td><input type="number" id="pension" name="pension" placeholder="MONTHLY PENSION"></td>
</tr>
<tr>
<td>IFSC CODE</td>
<td><input type="number" id="ifsc" name="IFSC_Code" placeholder="IFSC CODE"></td>
</tr>
<tr>
<td>BANK AC NO </td>
<td><input type="number" id="acno" name="Account_number" placeholder="BANK AC NO"></td>
</tr>
<tr>
<td>BANK</td>
<td><input type="text" id="bname" name="Bank_Name" placeholder="BANK"></td>
</tr>
<tr>
<td>BRANCH</td>
<td><input type="text" id="branch" name="Branch_Name" placeholder="BRANCH"></td>
</tr>
<tr>
<td>NAME OF SPOUSE</td>
<td><input type="text" id="sname" name="SName" placeholder="NAME OF SPOUSE"></td>
</tr>
<tr>
<td>DOB(SPOUSE)</td>
<td><input type="date" id="sdob" name="SDOB" placeholder="BIRTH DATE"></td>
</tr>
<tr>
<td>AADHAR NUMBER</td>
<td><input type="number" id="saadhar" name="SAadhar" placeholder="AADHAR NUMBER"></td>
</tr>
<tr>
<td>PAN NO</td>
<td><input type="text" id="span" name="SPAN_NO" placeholder="PAN NO"></td>
</tr>
<tr>
<td>PHONE NUMBER</td>
<td><input type="number" id="sphno" name="Sphone_number" placeholder="PHONE NUMBER" maxlength="10"></td>
</tr>
<tr>
<tr>
<td>EMAIL-ID</td>
<td><input type="email" id="smail" name="Semail" placeholder="EMAIL-ID"></td>
</tr>

<tr>
<td><input type="submit" value="Insert" name="action"/></td>

<td><input type="reset" value="Reset"/></td>
</tr>
</table>

</form>

</body>
</html>