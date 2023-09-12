<html>

<body bgcolor=yellow text=blue>
<h1>
<% facebook.Signup1 r=(facebook.Signup1)request.getAttribute("data"); %>
<table boder=20px >
<tr>
<th>Firstname </th>
<tr>
<td>
<%= r.getFirstname() %><br>
<td>
</tr>
<th>Surname </th>
<%= r.getSurname() %><br>
 <th>Mobilenumberoremailaddress</th>
 <%= r.getMobilenumberoremailaddress() %><br>
<th>password</th>
<%= r.getPassword() %><br>
<th>Month</th>
<%= r.getMont() %><br>
<th>number</th>
<%= r.getMnumber() %><br>
<th>year</th>
<%= r.getYear() %><br>
<th>sex</th>
<%= r.getSex() %><br>
<th>uname</th>
<%= r.getUname() %><br>
</tr>
</table>
</h1>
</body>
</html>